package org.baade.eel.core.annulus;

import java.util.Collection;

import org.baade.eel.core.ILifecycle;

/**
 * 环形空间
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *
 */
public interface IAnnulusSpace<T> extends ILifecycle {

	public void put(IRealNode<T> realNode);
	
	public void putAll(Collection<IRealNode<T>> realNodes);
	
	public void remove(IRealNode<T> realNode);
	
	public void removeAll(Collection<IRealNode<T>> realNodes);
	
}
