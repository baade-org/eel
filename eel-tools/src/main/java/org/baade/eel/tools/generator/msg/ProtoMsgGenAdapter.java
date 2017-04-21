package org.baade.eel.tools.generator.msg;

import org.baade.eel.tools.conf.Config;
import org.baade.eel.tools.log.Log;

import java.io.File;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public abstract class ProtoMsgGenAdapter implements IMessageGen {

    protected final Config config;

    public ProtoMsgGenAdapter(Config config) {
        this.config = config;
    }

    @Override
    public boolean check() {
        boolean flag = true;
        String protocAbsPath = config.getMessageConfig().getProtocFilePath();
        String protoFileDir = config.getMessageConfig().getProtosFileDir();
        String msgJavaOutAbsPath = config.getMessageConfig().getMsgFileJavaOutPath();

        File file = new File(protocAbsPath);
        if(!file.exists()){
            Log.TOOLS.error("protoc.exe 文件不存在：{}", protocAbsPath);
            flag = false;
        }
        file = new File(protoFileDir);
        if(!file.exists()){
            Log.TOOLS.error("proto file 文件目录不存在：{}", protoFileDir);
            flag = false;
        }

        file = new File(msgJavaOutAbsPath);
        if(!file.exists()){
            Log.TOOLS.error("JAVA Proto Message 输出的文件目录不存在：{}", msgJavaOutAbsPath);
            flag = false;
        }
        return flag;
    }
}
