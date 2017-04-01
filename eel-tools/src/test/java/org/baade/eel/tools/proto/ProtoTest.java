package org.baade.eel.tools.proto;

import org.baade.eel.tools.conf.Config;
import org.junit.Test;

import java.io.*;
import java.util.stream.Stream;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public class ProtoTest {

    @Test
    public void genProtoMsg() {
        Config config = Config.loadDefault();
        String protocAbsPath = config.getRootDir() + config.getMessageConfig().getProtocFilePath();
        System.out.println(protocAbsPath);

        String protoFileDir = config.getRootDir() + config.getMessageConfig().getProtosFileDir();
        System.out.println(protoFileDir);

        String msgJavaOutAbsPath = config.getRootDir() + config.getMessageConfig().getMsgFileJavaOutPath();
        System.out.println(msgJavaOutAbsPath);


        File protoDir = new File(protoFileDir);
        //protoc --proto_path=IMPORT_PATH --cpp_out=DST_DIR --java_out=DST_DIR --python_out=DST_DIR path/to/file.prot
        String command = protocAbsPath + " --proto_path=%s --java_out=%s %s";

        if (protoDir.exists()) {
            File[] protoFiles = protoDir.listFiles();
            Stream.of(protoFiles).forEach(
                    protoFile -> {
                        String commandStr = String.format(command, protoDir, msgJavaOutAbsPath, protoFile.getAbsolutePath());
                        System.out.println(commandStr);
                        Runtime run = Runtime.getRuntime();
                        try {
                            Process process = run.exec(commandStr);
                            InputStream fis = process.getInputStream();
                            //用一个读输出流类去读
                            InputStreamReader isr = new InputStreamReader(fis);
                            //用缓冲器读行
                            BufferedReader br = new BufferedReader(isr);
                            String line = null;
                            //直到读完为止
                            while ((line = br.readLine()) != null) {
                                System.out.println(line);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
            );
        }

    }
}
