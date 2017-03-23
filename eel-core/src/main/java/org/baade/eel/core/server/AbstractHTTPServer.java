package org.baade.eel.core.server;

import org.baade.eel.core.Globals;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

/**
 * 抽象的HTTTPServer类
 *
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/22.
 */
public class AbstractHTTPServer extends AbstractServer implements IHTTPServer {

    protected AbstractHandler handler;

    @Override
    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    @Override
    public void run() {

        String simpleClassName = this.getClass().getSimpleName();
        if (this.handler != null) {
            try {
                Server httpServer = new Server(this.port);
                httpServer.setHandler(this.handler);
                Globals.LOG.info(simpleClassName + " 在端口[{}]上监听, Handler 是[{}].",
                        this.port, this.handler.getClass());

                httpServer.setStopAtShutdown(true);

                httpServer.start();
                httpServer.join();
            } catch (Exception e) {
                Globals.LOG.error(simpleClassName + " 启动失败. cause:{}", e);
                System.exit(0);
            }
        } else {
            Globals.LOG.error(simpleClassName + " 启动失败: 没有配置 Handler.");
            System.exit(0);
        }
    }

}
