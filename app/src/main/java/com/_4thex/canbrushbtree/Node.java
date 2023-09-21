package com._4thex.canbrushbtree;

import java.util.Set;
/**
 * A node in the tree with at most {@link Tree#getOrder()} {@link Key Keys}
 */
public abstract class Node extends Key {
    /**
     * 
     * @return
     */
    public abstract Set<Key> getKeys();
    /**
     * The index to the median key
     * @see #getKeys
     * @return
     */
    public abstract int getMedian();
}
