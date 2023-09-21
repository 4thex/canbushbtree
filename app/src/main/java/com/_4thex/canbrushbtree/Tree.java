package com._4thex.canbrushbtree;

/**
 * The B-Tree
 */
public abstract class Tree {
    /**
     * The order of the tree. This number is the max number of {@link Key Keys} in each {@link Node}
     * @return The order of the tree
     */
    public abstract int getOrder();

    /**
     * The root {@link Node} of the tree.
     * @return The root {@link Node} of the tree.
     */
    public abstract Node getRoot();

}
