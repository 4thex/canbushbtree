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
    public T get() {
        return this.value;
    }

    @Override
    public Node<T> getGreaterChild() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGreaterChild'");
    }

    @Override
    public void setGreaterChild(Node<T> node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGreaterChild'");
    }

    @Override
    public Node<T> getLesserChild() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLesserChild'");
    }

    @Override
    public void setLesserChild(Node<T> node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLesserChild'");
    }

    @Override
    public Key<T> getGreaterSibling() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGreaterSibline'");
    }

    @Override
    public void setGreaterSibling(Key<T> key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGreaterSibline'");
    }

    @Override
    public Key<T> getLesserSibling() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLesserSibline'");
    }

    @Override
    public void setLesserSibling(Key<T> key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLesserSibline'");
    }
    
}
