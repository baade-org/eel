package org.baade.eel.core.message;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Message;
import org.baade.eel.core.LifecycleAdaptor;
import org.baade.eel.core.player.IPlayer;

import java.lang.annotation.Annotation;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/5.
 */
public abstract class MessageAdaptor<T extends Message> extends LifecycleAdaptor implements IMessage {

    protected IPlayer player;

    protected T protoMessage;

    public MessageAdaptor(IPlayer player, T protoMessage) {
        super();
        this.player = player;
        this.protoMessage = protoMessage;
    }

    @Override
    public IPlayer getPlayer() {
        return this.player;
    }

    @Override
    public long getDeadline() {
        return -1;
    }

    @Override
    public T getProtoMessage() {
        return this.protoMessage;
    }

    @Override
    public byte[] toBytes() {
        return new byte[0];
    }

    @Override
    public short getMessageId() {
        short msgId = 0;
        MessageId anno = this.getClass().getAnnotation(MessageId.class);
        if(anno != null){
            msgId = anno.value();
        }
        return msgId;
    }

    @Override
    public String toString() {
        return String.format("MSG-ID=[%s],MSG=[%s]", this.getMessageId(), this.getProtoMessage());
    }
}
