package com._4thex.canbrushbtree.impl;

import java.util.Vector;

import com._4thex.canbrushbtree.Key;
import com._4thex.canbrushbtree.Node;
import com._4thex.canbrushbtree.SearchResult;
import com._4thex.canbrushbtree.Tree;

public class NodeImpl<T extends Comparable<T>> extends Node<T> {

    private Key<T> median;
    private Tree<T> tree;
    private Node<T> parent;
    private int count;
    public NodeImpl(Tree<T> tree, Node<T> parent) {
        this.tree = tree;
        this.parent = parent;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void insert(Key<T> key) {
        if(this.median == null) {
            this.median = key;
        } else if(key.get().compareTo(median.get()) > 0) {
            this.median.setGreaterSibling(key);
            key.setLesserSibling(this.median);
        }
        this.count++;
    }

    @Override
    public SearchResult<T> search(T value) {
        T medianValue = this.median.get();
        if(medianValue.equals(value)) {
            return SearchResult.createFound(this.median);
        }
        Key<T> greaterKey = this.median.getGreaterSibling();
        return null;
    }

    @Override
    public void remove(Key<T> key) {
        
    }

    @Override
    public Key<T> getMedian() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMedian'");
    }

    @Override
    public void setMedian(Key<T> key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMedian'");
    }

    @Override
    public Node<T> getParent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getParent'");
    }

    @Override
    public void setParent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setParent'");
    }
    
}
