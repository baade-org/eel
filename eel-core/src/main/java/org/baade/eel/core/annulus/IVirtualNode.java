package org.baade.eel.core.annulus;

import org.baade.eel.core.ILifecycle;

/**
 * 在环形空间上的虚拟节点
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *
 */
public interface IVirtualNode<T> extends ILifecycle {

	public int getHashIntValue();
	
	public String getUniqueStr();
	
	public IRealNode<T> getRealNode();
	
}
