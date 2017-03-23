package org.baade.eel.core.server;

import org.eclipse.jetty.server.handler.AbstractHandler;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/23.
 */
public interface IHTTPServer extends IServer {


    public void setHandler(AbstractHandler handler);
}
