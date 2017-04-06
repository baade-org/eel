package org.baade.eel.core.message;

import com.google.protobuf.Message;
import org.baade.eel.core.ILifecycle;
import org.baade.eel.core.player.IPlayer;

public interface IMessage extends ILifecycle {


	public IPlayer getPlayer();

	public short getMessageId();

	public <T extends Message> T getProtoMessage();

	public byte[] toBytes();
}
