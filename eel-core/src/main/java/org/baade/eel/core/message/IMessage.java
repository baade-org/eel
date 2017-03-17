package org.baade.eel.core.message;

import org.baade.eel.core.ILifecycle;

public interface IMessage extends ILifecycle {

	
	public byte[] toBytes();
}
