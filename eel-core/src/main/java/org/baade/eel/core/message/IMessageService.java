package org.baade.eel.core.message;

import org.baade.eel.core.service.IService;

import java.util.function.Function;

/**
 * 消息的服务类
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/6.
 */
public interface IMessageService extends IService {

    public <T extends IMessage> T getMessage(short msgId);

    public Function getMessageHandler(short msgId);

    public <T extends IMessage> Function getMessageHandler(T message);
}
