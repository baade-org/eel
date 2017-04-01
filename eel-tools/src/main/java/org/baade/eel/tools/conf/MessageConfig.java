package org.baade.eel.tools.conf;

import javax.xml.bind.annotation.XmlType;

/**
 * 消息的配置
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
@XmlType(propOrder = { "protocFilePath",
        "protosFileDir",
        "msgFileJavaOutPath"

        })
public class MessageConfig {

    private String protocFilePath;

    private String protosFileDir;

    private String msgFileJavaOutPath;



    public String getProtocFilePath() {
        return protocFilePath;
    }

    public void setProtocFilePath(String protocFilePath) {
        this.protocFilePath = protocFilePath;
    }

    public String getProtosFileDir() {
        return protosFileDir;
    }

    public void setProtosFileDir(String protosFileDir) {
        this.protosFileDir = protosFileDir;
    }

    public String getMsgFileJavaOutPath() {
        return msgFileJavaOutPath;
    }

    public void setMsgFileJavaOutPath(String msgFileJavaOutPath) {
        this.msgFileJavaOutPath = msgFileJavaOutPath;
    }
}
