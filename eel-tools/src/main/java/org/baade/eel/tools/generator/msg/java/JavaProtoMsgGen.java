package org.baade.eel.tools.generator.msg.java;

import org.baade.eel.tools.conf.Config;
import org.baade.eel.tools.constants.Command;
import org.baade.eel.tools.constants.CommonConst;
import org.baade.eel.tools.generator.msg.IMessageGen;
import org.baade.eel.tools.generator.msg.ProtoMsgGenAdapter;
import org.baade.eel.tools.log.Log;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * 生成java的proto Msg
 *
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public class JavaProtoMsgGen extends ProtoMsgGenAdapter implements IMessageGen {


    public JavaProtoMsgGen(Config config) {
        super(config);
    }

    @Override
    public void gen() {
        if (check()) {
            String protocAbsPath = config.getRootDir() + config.getMessageConfig().getProtocFilePath();
            String protoFileDir = config.getRootDir() + config.getMessageConfig().getProtosFileDir();
            String msgJavaOutAbsPath = config.getRootDir() + config.getMessageConfig().getMsgFileJavaOutPath();
            File protoDir = new File(protoFileDir);
            Stream.of(protoDir.listFiles()).
                    filter(pf -> pf.getName().endsWith(CommonConst.FileSuffix.PROTO.getName())).
                    forEach(
                            pf -> {
                                Log.TOOLS.info("处理proto文件:{}", pf.getName());
                                String runCommond = String.format(Command.Protoc.JAVA.getCommondStr(),
                                        protocAbsPath, protoFileDir, msgJavaOutAbsPath, pf.getAbsolutePath());
                                Log.TOOLS.debug("Gen JAVA Proto Msg commond:{}", runCommond);
                                try {
                                    Runtime.getRuntime().exec(runCommond);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    Log.TOOLS.error("Gen JAVA Proto Msg commond:{}, \n 错误原因：{}", runCommond, e);
                                }
                            }
                    );

        } else {
            Log.TOOLS.error("未生成任何 JAVA Proto Message，请确认Config配置");
        }
    }
}
