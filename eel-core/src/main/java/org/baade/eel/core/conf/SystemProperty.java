package org.baade.eel.core.conf;

/**
 * 系统相关的属性
 *
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/29.
 */
public enum SystemProperty {

    /**
     * Java 运行时环境版本
     */
    JAVA_VERSION("java.version", "Java 运行时环境版本"),

    /**
     * Java 安装目录
     */
    JAVA_HOME("java.home", "Java 安装目录"),

    /**
     * Java 类路径
     */
    JAVA_CLASS_PATH("java.class.path", "Java 类路径"),

    /**
     * 加载库时搜索的路径列表
     */
    JAVA_LIBRARY_PATH("java.library.path", "加载库时搜索的路径列表"),

    /**
     * 默认的临时文件路径
     */
    JAVA_IO_TMPDIR("java.io.tmpdir", "默认的临时文件路径"),

    /**
     * 一个或多个扩展目录的路径
     */
    JAVA_EXT_DIRS("java.ext.dirs", "一个或多个扩展目录的路径"),

    /**
     * 操作系统的名称
     */
    OS_NAME("os.name", "操作系统的名称"),

    /**
     * 操作系统的架构
     */
    OS_ARCH("os.arch", "操作系统的架构"),

    /**
     * 操作系统的版本
     */
    OS_VERSION("os.version", "操作系统的版本"),

    /**
     * 文件分隔符（在 UNIX 系统中是“/”）
     */
    FILE_SEPARATOR("file.separator", "文件分隔符（在 UNIX 系统中是“/”）"),

    /**
     * 路径分隔符（在 UNIX 系统中是“:”）
     */
    PATH_SEPARATOR("path.separator", "路径分隔符（在 UNIX 系统中是“:”）"),

    /**
     * 行分隔符（在 UNIX 系统中是“/n”）
     */
    LINE_SEPARATOR("line.separator", "行分隔符（在 UNIX 系统中是“/n”）"),

    /**
     * 用户的账户名称
     */
    USER_NAME("user.name", "用户的账户名称"),

    /**
     * 用户的主目录
     */
    USER_HOME("user.home", "用户的主目录"),

    /**
     * 用户的当前工作目录
     */
    USER_DIR("user.dir", "用户的当前工作目录"),

    ;

    private String key;
    private String desc;

    private SystemProperty(String key, String desc){
        this.key = key;
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }

    public String getValue(){
        return System.getProperty(this.key);
    }


}
