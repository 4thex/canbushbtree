package com._4thex.canbrushbtree;
import com._4thex.canbrushbtree.impl.TreeImpl;
public class ObjectFactory<T extends Comparable<T>> {
    public ObjectFactory() {

    }

    public Key<T> createKey(Tree<T> tree, T value) {
        return null;
    }

    public Tree<T> createTree(int order) {
        return new TreeImpl<T>(this, order);
    }
}
