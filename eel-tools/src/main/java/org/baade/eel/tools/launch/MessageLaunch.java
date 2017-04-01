package org.baade.eel.tools.launch;

import org.baade.eel.tools.conf.Config;
import org.baade.eel.tools.generator.IGenerator;
import org.baade.eel.tools.generator.msg.java.JavaProtoMsgGen;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public class MessageLaunch {

    public static void main(String[] args) {
        Config config = Config.loadDefault();

        genJava(config);
    }

    public static void genJava(Config config) {
        IGenerator javaProtoGen = new JavaProtoMsgGen(config);
        javaProtoGen.gen();
    }
}
