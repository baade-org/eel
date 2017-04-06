package org.baade.eel.ls.module.account;

import org.baade.eel.basic.message.CSAcountLogin;
import org.baade.eel.core.message.MessageHandler;
import org.baade.eel.core.message.OnMessageReceive;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/6.
 */
@MessageHandler
public class AcountMsgHandler {

    @OnMessageReceive(CSAcountLogin.class)
    public void login(CSAcountLogin msg){

        System.out.println(msg);
    }
}
