package org.baade.eel.core.service;

import org.baade.eel.core.ILifecycle;

/**
 * Service接口
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/6.
 */
public interface IService extends ILifecycle {

    public void init();
}
