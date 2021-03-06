package org.baade.eel.core.server;

import org.baade.eel.core.ILifecycle;

public interface IServer extends ILifecycle, Runnable {

	public void setPort(int port);

	public void start();
}
