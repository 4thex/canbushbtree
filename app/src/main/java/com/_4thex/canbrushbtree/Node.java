package com._4thex.canbrushbtree;

/**
 * A node in the tree with at most {@link Tree#getOrder()} {@link Key Keys}
 */
public abstract class Node<T extends Comparable<T>> extends Key<T> {
    public abstract int getCount();
    public abstract void insert(Key<T> key);
    public abstract Key<T> getLowestKey();
    public abstract Key<T> getHighestKey();
}
