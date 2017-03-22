package org.baade.eel.ls;


import org.baade.eel.core.Globals;
import org.baade.eel.core.conf.GameSystemProperty;
import org.baade.eel.ls.handler.HTTPHandler;
import org.baade.eel.ls.handler.SocketHandler;
import org.baade.eel.ls.server.LoginHTTPServer;
import org.baade.eel.ls.server.LoginSocketServer;
import org.eclipse.jetty.server.Server;

/**
 * 登录服的启动入口
 */
public class Launch {

    public static final String LOG_NAME_OF_LOGIN_SERVER = "loginServer";

    public static void main(String[] args) {
        System.setProperty(GameSystemProperty.LOG_NAME.getKey(), LOG_NAME_OF_LOGIN_SERVER);

        startHttpServer();
        startSocketServer();
    }

    private static void startHttpServer() {
        LoginHTTPServer server = new LoginHTTPServer();
        server.setPort(Globals.getConfig().getLoginServer().getHttpPort());

        HTTPHandler httpHandler = new HTTPHandler();
        server.setHandler(httpHandler);

        server.start();

    }

    private static void startSocketServer() {
        LoginSocketServer server = new LoginSocketServer();
        server.setPort(Globals.getConfig().getLoginServer().getSocketPort());

        SocketHandler handler = new SocketHandler();
        server.setHandler(handler);

        server.start();
    }
}