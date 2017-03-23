package org.baade.eel.core.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/23.
 */
public interface ISocketServer extends IServer {

    public void setChannelInitializer(ChannelInitializer<SocketChannel> channelInitializer);
}
