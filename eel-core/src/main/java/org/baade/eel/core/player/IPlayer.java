package org.baade.eel.core.player;

import org.baade.eel.core.ILifecycle;
import org.baade.eel.core.message.IMessage;
import org.baade.eel.core.processor.IProcessor;

public interface IPlayer extends ILifecycle {

	public void send(IMessage message);
	
	public IProcessor getProcessor();
}
