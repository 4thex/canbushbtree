package com._4thex.canbrushbtree.impl;

import com._4thex.canbrushbtree.Key;
import com._4thex.canbrushbtree.Node;
import com._4thex.canbrushbtree.Tree;

public class KeyImpl<T extends Comparable<T>> extends Key<T> {

    private Tree<T> tree;
    private T value;
    public KeyImpl(Tree<T> tree, T value) {
        this.tree = tree;
        this.value = value;
    }

    @Override
    public Key<T> getHigherChild() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHigherChild'");
    }

    @Override
    public Key<T> getLowerChild() {
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
