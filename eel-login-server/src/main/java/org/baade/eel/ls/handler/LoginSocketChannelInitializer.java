package org.baade.eel.ls.handler;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.socks.SocksInitRequestDecoder;
import io.netty.handler.codec.socks.SocksMessageEncoder;


/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/23.
 */
public class LoginSocketChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
//        channelPipeline.addLast(SocksInitRequestDecoder.getName(), new SocksInitRequestDecoder());
//        channelPipeline.addLast(SocksMessageEncoder.getName(), socksMessageEncoder);
        channelPipeline.addLast("handler", new LoginSocketHandler());
    }
}
