package org.baade.eel.core.annulus;

import java.util.Collection;

import org.baade.eel.core.ILifecycle;

public interface IRealNode<T> extends ILifecycle{

	
	public Collection<IVirtualNode<T>> getVirtualNodes();
}
