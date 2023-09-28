package com._4thex.canbrushbtree;

/**
 * A node in the tree with at most {@link Tree#getOrder()} {@link Key Keys}
 */
public abstract class Node<T extends Comparable<T>>  implements IKeyContainer<T> {
    public abstract int getCount();
    public abstract Key<T> getLowestKey();
    public abstract Key<T> getHighestKey();
    public abstract Key<T> getMedianKey();
    public abstract SearchResult<T> search(T value);
}
