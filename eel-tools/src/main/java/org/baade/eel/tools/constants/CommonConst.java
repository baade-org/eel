package org.baade.eel.tools.constants;

/**
 * 一般的常量
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public interface CommonConst {

    /**
     * 文件后缀名
     */
    enum FileSuffix{

        /**
         * proto 文件的后缀名
         */
        PROTO(".proto")
        ;
        private String name;

        FileSuffix(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
