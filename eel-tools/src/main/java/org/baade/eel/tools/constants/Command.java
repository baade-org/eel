package org.baade.eel.tools.constants;

/**
 * 命令
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public interface Command {

    /**
     * Protoc命令
     */
    enum Protoc{

        /**
         * 生成JAVA的proto消息<br/>
         * 1.protoc 文件路径<br/>
         * 2.proto_path proto目录<br/>
         * 3.java_out 生成JAVA proto消息的目录<br/>
         * 4.proto file
         */
        JAVA("%s --proto_path=%s --java_out=%s %s")

        ;

        private String commondStr;

        Protoc(String commondStr) {
            this.commondStr = commondStr;
        }

        public String getCommondStr() {
            return commondStr;
        }

    }

}
