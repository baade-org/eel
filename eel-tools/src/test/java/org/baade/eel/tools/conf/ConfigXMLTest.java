package org.baade.eel.tools.conf;

import org.baade.eel.tools.utils.XMLUtils;
import org.junit.Test;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public class ConfigXMLTest {


    @Test
    public void genXML(){
        Config config = new Config();
        config.setRootDir("E:/workspace-baade/");

        MessageConfig messageConfig = new MessageConfig();
        messageConfig.setMsgFileJavaOutPath("");
        messageConfig.setProtocFilePath("");
        messageConfig.setProtosFileDir("");

        config.setMessageConfig(messageConfig);

//        XMLUtils.xmlFile2Obj(Config.class, "d:/config.xml");

        XMLUtils.obj2XMLFile(config, "d:/config.xml");
    }

    @Test
    public void readXML(){

        Config  conf = Config.loadDefault();

        System.out.println(XMLUtils.obj2XMLStr(conf));

    }


}
