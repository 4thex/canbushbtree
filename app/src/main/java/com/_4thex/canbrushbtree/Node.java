package com._4thex.canbrushbtree;

/**
 * A node in the tree with at most {@link Tree#getOrder()} {@link Key Keys}
 */
public abstract class Node<T extends Comparable<T>>  implements IKeyContainer<T> {
    public abstract int getCount();
    public abstract Key<T> getMedian();
    public abstract void setMedian(Key<T> key);
    public abstract SearchResult<T> search(T value);
    public abstract Node<T> getParent();
    public abstract void setParent();
}
