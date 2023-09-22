package com._4thex.canbrushbtree.impl;

import com._4thex.canbrushbtree.Key;
import com._4thex.canbrushbtree.Node;
import com._4thex.canbrushbtree.Tree;
import com._4thex.canbrushbtree.ObjectFactory;

public class TreeImpl<T extends Comparable<T>> extends Tree<T> {
    private ObjectFactory<T> factory;
    private int order;
    public TreeImpl(ObjectFactory<T> objectFactory, int order) {
        this.factory = objectFactory;
        this.order = order;
    }
    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public Node<T> getRoot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoot'");
    }

    @Override
    public Key<T> insert(T value) {
        return this.factory.createKey(this, value);
    }

}
