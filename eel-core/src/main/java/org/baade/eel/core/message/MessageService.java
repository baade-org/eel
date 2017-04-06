package org.baade.eel.core.message;

import org.baade.eel.core.service.ServiceAdaptor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/6.
 */
public class MessageService extends ServiceAdaptor implements IMessageService {

    private Map<Short, Class<? extends IMessage>> msgs;

    @Override
    public void init() {
        msgs = new HashMap<>();
    }

    @Override
    public <T extends IMessage> T getMessage(short msgId) {
        return null;
    }

    @Override
    public Function getMessageHandler(short msgId) {
        return null;
    }

    @Override
    public <T extends IMessage> Function getMessageHandler(T message) {
        return null;
    }
}
