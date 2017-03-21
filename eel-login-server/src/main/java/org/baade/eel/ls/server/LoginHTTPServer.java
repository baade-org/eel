package org.baade.eel.ls.server;

import org.baade.eel.core.Log;
import org.baade.eel.core.server.AbstractServer;
import org.baade.eel.core.server.IServerHandler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

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
        if (serverHandler != null){
            if (this.serverHandler instanceof AbstractHandler){
                try{
                    Server httpServer = new Server(this.port);
                    httpServer.setHandler((AbstractHandler)(this.serverHandler));
                    Log.LOGIN_SERVER.info("LoginHTTPServer 在端口[{}]上监听, IServerHandler Class是[{}].", this.port, this.serverHandler.getClass());
                    httpServer.start();
                    httpServer.join();
                }catch (Exception e){
                    Log.LOGIN_SERVER.error("LoginHTTPServer 启动失败. cause:{}", e);
                    throw new RuntimeException("LoginHTTPServer 启动失败. cause:{}", e);
                }
            } else {
                Log.LOGIN_SERVER.error("LoginHTTPServer启动失败: ServerHandler配置有误：ServerHandler 应当继承于 org.eclipse.jetty.server.handler.AbstractHandler.");
                throw new RuntimeException("LoginHTTPServer启动失败: ServerHandler配置有误：ServerHandler 应当继承于 org.eclipse.jetty.server.handler.AbstractHandler.");
            }
        } else {
            Log.LOGIN_SERVER.error("LoginHTTPServer启动失败: 没有配置 ServerHandler.");
            throw new RuntimeException("LoginHTTPServer启动失败: 没有配置 ServerHandler.");
        }

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
