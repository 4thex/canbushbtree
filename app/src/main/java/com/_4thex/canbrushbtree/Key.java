package com._4thex.canbrushbtree;

/**
 * 
 */
public abstract class Key<T extends Comparable<T>> {
    /**
     * @return The {@link Key} with the next higher value
     */
    public abstract Key<T> getHigherChild();
    /**
     * @return The {@link Key} with the next lower value
     */
    public abstract Key<T> getLowerChild();
    /**
     * Move to parent {@link Node}
     */
    public abstract void promote(Node<T> parent);
    public abstract T get();
}
