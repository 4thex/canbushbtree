package com._4thex.canbrushbtree.impl;

import com._4thex.canbrushbtree.Node;
import com._4thex.canbrushbtree.Tree;

public class Key<T extends Comparable<T>> extends com._4thex.canbrushbtree.Key<T> {

    private Tree<T> tree;
    private T value;
    public Key(Tree<T> tree, T value) {
        this.tree = tree;
        this.value = value;
    }

    @Override
    public com._4thex.canbrushbtree.Key<T> getHigherChild() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHigherChild'");
    }

    @Override
    public com._4thex.canbrushbtree.Key<T> getLowerChild() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLowerChild'");
    }

    @Override
    public void promote(Node<T> parent) {
    }

    @Override
    public T get() {
        return this.value;
    }
    
}
