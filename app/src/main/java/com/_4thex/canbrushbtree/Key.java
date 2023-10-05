package com._4thex.canbrushbtree;

/**
 * 
 */
public abstract class Key<T extends Comparable<T>> {
    /**
     * @return The {@link Key} with the next higher value
     */
    public abstract Node<T> getGreaterChild();
    public abstract void setGreaterChild(Node<T> node);
    /**
     * @return The {@link Key} with the next lower value
     */
    public abstract Node<T> getLesserChild();
    public abstract void setLesserChild(Node<T> node);

    public abstract Key<T> getGreaterSibling();
    public abstract void setGreaterSibling(Key<T> key);

    public abstract Key<T> getLesserSibling();
    public abstract void setLesserSibling(Key<T> key);

    public abstract T get();
}
