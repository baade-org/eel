package org.baade.eel.core.server;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.baade.eel.core.Globals;

/**
 * 抽象的SocketServer类
 *
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/22.
 */
public class AbstractSocketServer extends AbstractServer {

    @Override
    public void run() {

        String simpleClassName = this.getClass().getSimpleName();
        if (this.serverHandler != null) {
            if (this.serverHandler instanceof ChannelHandlerAdapter) {
                Globals.LOG.info(simpleClassName + " 在端口[{}]上监听, IServerHandler 是[{}].",
                        this.port, this.serverHandler.getClass());
                bind((ChannelHandlerAdapter)(this.serverHandler));
            }else{
                Globals.LOG.error(simpleClassName + " 启动失败: ServerHandler配置有误：" +
                        "ServerHandler 应当继承于 io.netty.channel.ChannelHandlerAdapter.");
                throw new RuntimeException(simpleClassName + " 启动失败: ServerHandler配置有误：" +
                        "ServerHandler 应当继承于 io.netty.channel.ChannelHandlerAdapter.");
            }
        }else{
            Globals.LOG.error(simpleClassName + " 启动失败: 没有配置 ServerHandler.");
            throw new RuntimeException(simpleClassName + " 启动失败: 没有配置 ServerHandler.");
        }

    }

    private void bind(final ChannelHandlerAdapter channelHandler){
        String simpleClassName = this.getClass().getSimpleName();
        EventLoopGroup bossGroup = new NioEventLoopGroup(); // (1)
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap(); // (2)
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class) // (3)
                    .childHandler(new ChannelInitializer<SocketChannel>() { // (4)
                        @Override
                        public void initChannel(SocketChannel ch) throws Exception {
//                            ch.pipeline().addLast((ChannelHandlerAdapter)(this.serverHandler));
                            ch.pipeline().addLast(channelHandler);
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)          // (5)
                    .childOption(ChannelOption.SO_KEEPALIVE, true); // (6)

            // Bind and start to accept incoming connections.
            ChannelFuture f = b.bind(port).sync(); // (7)

            // Wait until the server socket is closed.
            // In this example, this does not happen, but you can do that to gracefully
            // shut down your server.
            f.channel().closeFuture().sync();
        }catch (Exception e){
            Globals.LOG.error(simpleClassName + " 启动失败: cause{}.", e);
            throw new RuntimeException(simpleClassName + " 启动失败: cause{}.", e);
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

}
