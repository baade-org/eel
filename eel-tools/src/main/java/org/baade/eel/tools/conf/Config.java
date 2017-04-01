package org.baade.eel.tools.conf;

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
        "rootDir",
        "messageConfig",
})
public class Config {

    private String rootDir;

    private MessageConfig messageConfig;

    public static Config loadDefault() {
        return load("/config.xml");
    }

    public static Config load(String xmlFilePath) {
        return XMLUtils.xmlFile2Obj(Config.class, xmlFilePath);
    }

    public String getRootDir() {
        return rootDir;
    }

    public void setRootDir(String rootDir) {
        this.rootDir = rootDir;
    }

    public MessageConfig getMessageConfig() {
        return messageConfig;
    }

    public void setMessageConfig(MessageConfig messageConfig) {
        this.messageConfig = messageConfig;
    }
}
