package org.baade.eel.core.heartbeat;

import org.baade.eel.core.ILifecycle;

/**
 * 心跳的基类
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *
 */
public interface IHeartbeat extends ILifecycle {

	
	public void beat();
}
