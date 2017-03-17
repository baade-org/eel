package org.baade.eel.core.server;

import org.baade.eel.core.LifecycleAdaptor;

/**
 * Server的抽象类
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/16.
 */
public abstract class AbstractServer extends LifecycleAdaptor implements IServer, Runnable{

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
}
