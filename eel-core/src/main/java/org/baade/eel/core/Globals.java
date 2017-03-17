package org.baade.eel.core;

import org.baade.eel.core.conf.Config;

/**
 * 该类的所有方法都是全局静态的
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/16.
 */
public class Globals {

    static {
        init();
    }

    /**
     * 全局的配置
     */
    private static Config config;

    /**
     * 初始化<br>
     *     1.初始化全局配置.<br>
     *
     */
    public static void init(){
        config = Config.loadDefault();
    }

    /**
     * 返回全局配置
     * @return 返回全局配置
     */
    public static Config getConfig() {
        return config;
    }

    public static void main(String[] args) {
        Globals.init();
    }
}
