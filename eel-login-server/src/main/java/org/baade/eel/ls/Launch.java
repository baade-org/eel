package org.baade.eel.ls;


import org.baade.eel.core.Globals;
import org.baade.eel.ls.handler.HTTPHandler;
import org.baade.eel.ls.server.LoginHTTPServer;
import org.eclipse.jetty.server.Server;

/**
 *
 */
public class Launch {
    public static void main(String[] args) {
        LoginHTTPServer httpServer = new LoginHTTPServer();
        httpServer.setPort(Globals.getConfig().getLoginServer().getHttpPort());

        HTTPHandler httpHandler = new HTTPHandler();
        httpServer.setHandler(httpHandler);

        httpServer.start();

    }
}