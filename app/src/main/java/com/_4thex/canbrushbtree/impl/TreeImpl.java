package com._4thex.canbrushbtree.impl;

import java.util.Vector;

import com._4thex.canbrushbtree.Key;
import com._4thex.canbrushbtree.Node;
import com._4thex.canbrushbtree.Tree;
import com._4thex.canbrushbtree.ObjectFactory;
import com._4thex.canbrushbtree.SearchResult;

public class TreeImpl<T extends Comparable<T>> extends Tree<T> {
    private ObjectFactory<T> factory;
    private int order;
    private Node<T> rootNode;
    
    public TreeImpl(ObjectFactory<T> objectFactory, int order) {
        this.factory = objectFactory;
        this.order = order;
        this.rootNode = objectFactory.createNode(this);
    }

    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public Key<T> insert(T value) {
        Key<T> key = this.factory.createKey(this, value);
        this.rootNode.insert(key);
        return key;
    }

    @Override
    public SearchResult<T> search(T value) {
        return this.rootNode.search(value);
    }

    @Override
    public Node<T> getRootNode() {
        return this.rootNode;
    }

}
