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
public class AbstractHTTPServer extends AbstractServer {

    @Override
    public void run() {

        String simpleClassName = this.getClass().getSimpleName();
        if (this.serverHandler != null) {
            if (this.serverHandler instanceof AbstractHandler) {
                try {
                    Server httpServer = new Server(this.port);
                    httpServer.setHandler((AbstractHandler) (this.serverHandler));
                    Globals.LOG.info(simpleClassName +  " 在端口[{}]上监听, IServerHandler 是[{}].",
                            this.port, this.serverHandler.getClass());
                    httpServer.start();
                    httpServer.join();
                } catch (Exception e) {
                    Globals.LOG.error(simpleClassName + " 启动失败. cause:{}", e);
                    throw new RuntimeException(simpleClassName + " 启动失败. cause:{}", e);
                }
            } else {
                Globals.LOG.error(simpleClassName + " 启动失败: ServerHandler配置有误：" +
                        "ServerHandler 应当继承于 org.eclipse.jetty.server.handler.AbstractHandler.");
                throw new RuntimeException(simpleClassName + " 启动失败: ServerHandler配置有误：" +
                        "ServerHandler 应当继承于 org.eclipse.jetty.server.handler.AbstractHandler.");
            }
        } else {
            Globals.LOG.error(simpleClassName + " 启动失败: 没有配置 ServerHandler.");
            throw new RuntimeException(simpleClassName + " 启动失败: 没有配置 ServerHandler.");
        }
    }

}
