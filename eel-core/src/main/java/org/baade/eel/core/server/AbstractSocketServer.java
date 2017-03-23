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
public class AbstractSocketServer extends AbstractServer implements ISocketServer {

    protected ChannelInitializer<SocketChannel> channelInitializer;

    @Override
    public void setChannelInitializer(ChannelInitializer<SocketChannel> channelInitializer) {
        this.channelInitializer = channelInitializer;
    }


    @Override
    public void run() {
        String simpleClassName = this.getClass().getSimpleName();
        if (this.channelInitializer != null) {
            Globals.LOG.info(simpleClassName + " 在端口[{}]上监听, ChannelInitializer 是[{}].",
                    this.port, this.channelInitializer.getClass());
            bind();
        } else {
            Globals.LOG.error(simpleClassName + " 启动失败: 没有配置 ChannelInitializer.");
            System.exit(0);
        }

    }

    private void bind() {
        String simpleClassName = this.getClass().getSimpleName();
        EventLoopGroup bossGroup = new NioEventLoopGroup(); // (1)
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap(); // (2)
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class) // (3)
                    .childHandler(this.channelInitializer)
                    .option(ChannelOption.SO_BACKLOG, 128)          // (5)
                    .childOption(ChannelOption.SO_KEEPALIVE, true); // (6)

            // Bind and start to accept incoming connections.
            ChannelFuture f = b.bind(port).sync(); // (7)

            // Wait until the server socket is closed.
            // In this example, this does not happen, but you can do that to gracefully
            // shut down your server.
            f.channel().closeFuture().sync();
        } catch (Exception e) {
            Globals.LOG.error(simpleClassName + " 启动失败: cause{}.", e);
            System.exit(0);
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

}
