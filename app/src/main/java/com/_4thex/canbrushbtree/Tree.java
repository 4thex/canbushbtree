package com._4thex.canbrushbtree;

/**
 * The B-Tree
 */
public abstract class Tree<T extends Comparable<T>> implements IKeyContainer<T> {
    /**
     * The order of the tree. This number is the max number of children of in each {@link Node}
     * @return The order of the tree
     */
    public abstract int getOrder();

    public abstract Node<T> getRootNode();
    public abstract void setRootNode(Node<T> node);

    public abstract Key<T> insert(T value);

    public abstract SearchResult<T> search(T value);

}
