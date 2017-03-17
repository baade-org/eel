package org.baade.eel.ls.server;

import org.baade.eel.core.server.AbstractServer;
import org.baade.eel.core.server.IServerHandler;

/**
 * 登录的HTTP服务
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/16.
 */
public class LoginHTTPServer extends AbstractServer {

    private IServerHandler serverHandler;

    public LoginHTTPServer() {
        super();
    }

    @Override
    public void run() {

    }

    @Override
    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public void setHandler(IServerHandler handler) {
        this.serverHandler = handler;
    }
}
