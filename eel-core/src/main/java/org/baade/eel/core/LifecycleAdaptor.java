package org.baade.eel.core;

/**
 * 对象生命周期的适配器
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/16.
 */
public abstract class LifecycleAdaptor implements ILifecycle{

    private final long createTime;

    public LifecycleAdaptor() {
        this(System.currentTimeMillis());
    }

    public LifecycleAdaptor(long createTime) {
        this.createTime = createTime;
    }

    @Override
    public long getCreateTime() {
        return this.createTime;
    }

}
