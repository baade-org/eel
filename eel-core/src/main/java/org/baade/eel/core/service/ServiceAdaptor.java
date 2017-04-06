package org.baade.eel.core.service;

import org.baade.eel.core.LifecycleAdaptor;

/**
 * Service适配器
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/6.
 */
public abstract class ServiceAdaptor extends LifecycleAdaptor implements IService {

    public ServiceAdaptor() {
        super();
    }

    @Override
    public long getDeadline() {
        return -1;
    }

    @Override
    public void init() {

    }
}
