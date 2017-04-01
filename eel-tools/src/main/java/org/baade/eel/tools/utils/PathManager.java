package org.baade.eel.tools.utils;

import java.io.File;

/**
 * 路径管理
 *
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public class PathManager {

    public static String getAbsolutePath(String path) {
        String absPath = null;
        File file = new File(path);
        if (!file.exists()) {

        } else {
            absPath = file.getAbsolutePath();
        }
        return absPath;
    }
}
