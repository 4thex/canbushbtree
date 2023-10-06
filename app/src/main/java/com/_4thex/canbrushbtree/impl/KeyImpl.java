package com._4thex.canbrushbtree.impl;

import com._4thex.canbrushbtree.Key;
import com._4thex.canbrushbtree.Node;
import com._4thex.canbrushbtree.Tree;

public class KeyImpl<T extends Comparable<T>> extends Key<T> {

    private Tree<T> tree;
    private T value;
    private Key<T> greaterSibling;
    private Key<T> lesserSibling;
    private Node<T> greaterChild;
    private Node<T> lesserChild;
    
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
        return this.greaterChild;
    }

    @Override
    public void setGreaterChild(Node<T> node) {
        this.greaterChild = node;
    }

    @Override
    public Node<T> getLesserChild() {
        return this.lesserChild;
    }

    @Override
    public void setLesserChild(Node<T> node) {
        this.lesserChild = node;
    }

    @Override
    public Key<T> getGreaterSibling() {
        return this.greaterSibling;
    }

    @Override
    public void setGreaterSibling(Key<T> key) {
        this.greaterSibling = key;
    }

    @Override
    public Key<T> getLesserSibling() {
        return this.lesserSibling;
    }

    @Override
    public void setLesserSibling(Key<T> key) {
        this.lesserSibling = key;
    }
    
}
