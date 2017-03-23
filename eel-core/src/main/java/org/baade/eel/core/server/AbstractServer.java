package org.baade.eel.core.server;

import org.baade.eel.core.LifecycleAdaptor;
import org.baade.eel.core.Log;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

/**
 * Server的抽象类
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/16.
 */
public abstract class AbstractServer extends LifecycleAdaptor implements IServer{

    protected int port;

    public AbstractServer() {
        super();
    }

    @Override
    public long getDeadline() {
        return -1;
    }

    @Override
    public void start() {
        new Thread(this).start();
    }

    @Override
    public void setPort(int port) {
        this.port = port;
    }


    @Override
    public String toString() {
        return this.getClass() + "[端口：" + this.port + ", 创建时间：" + this.getCreateTime() + "]";
    }
}
