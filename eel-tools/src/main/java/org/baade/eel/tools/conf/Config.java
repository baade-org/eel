package org.baade.eel.tools.conf;

import org.baade.eel.tools.utils.PathManager;
import org.baade.eel.tools.utils.XMLUtils;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 配置类
 *
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
@XmlRootElement
@XmlType(propOrder = {
        "messageConfig",
})
public class Config {


    private MessageConfig messageConfig;

    public static Config loadDefault() {
        return load("/config.xml");
    }

    public static Config load(String xmlFilePath) {
        Config config = XMLUtils.xmlFile2Obj(Config.class, xmlFilePath);
        config.getMessageConfig().setProtocFilePath(PathManager.getAbsolutePath(config.getMessageConfig().getProtocFilePath()));
        config.getMessageConfig().setMsgFileJavaOutPath(PathManager.getAbsolutePath(config.getMessageConfig().getMsgFileJavaOutPath()));
        config.getMessageConfig().setProtosFileDir(PathManager.getAbsolutePath(config.getMessageConfig().getProtosFileDir()));
        return config;
    }

    public MessageConfig getMessageConfig() {
        return messageConfig;
    }

    public void setMessageConfig(MessageConfig messageConfig) {
        this.messageConfig = messageConfig;
    }
}
