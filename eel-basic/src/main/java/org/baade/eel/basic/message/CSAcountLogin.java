package org.baade.eel.basic.message;

import org.baade.eel.basic.message.protos.AccountProtos;
import org.baade.eel.core.message.MessageAdaptor;
import org.baade.eel.core.message.MessageId;
import org.baade.eel.core.player.IPlayer;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/5.
 */
@MessageId(MessageType.CS_ACOUNT_LOGIN)
public class CSAcountLogin extends MessageAdaptor<AccountProtos.CSLogin> {


    public CSAcountLogin(IPlayer player, AccountProtos.CSLogin protoMessage) {
        super(player, protoMessage);
    }

}
