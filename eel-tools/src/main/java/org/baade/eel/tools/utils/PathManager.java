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
        File file = new File(path);
        return file.getAbsolutePath();
    }
}
