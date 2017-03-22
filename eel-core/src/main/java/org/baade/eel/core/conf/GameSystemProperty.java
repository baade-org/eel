package org.baade.eel.core.conf;

/**
 * 游戏的系统属性
 *
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/22.
 */
public enum GameSystemProperty {

    LOG_NAME("logName", "gameLogs")

    ;
    private String key;
    private String defaultValue;

    private GameSystemProperty(String key, String defaultValue){
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public String getKey() {
        return key;
    }

    public String getDefaultValue() {
        return defaultValue;
    }
}
