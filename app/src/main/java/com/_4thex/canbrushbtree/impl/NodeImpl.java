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
        this.count++;
        if(this.median == null) {
            this.median = key;
            return;
        }
        Key<T> current = this.median;
        T value = key.get();
        while(value.compareTo(current.get()) > 0) {
            if(current.getGreaterSibling() == null) {
                current.setGreaterSibling(key);
                this.setMedian(this.median.getGreaterSibling());
                return;
            }
            current = current.getGreaterSibling();
        }
        if(value.equals(current.get())) {
            // TODO Decide what to do with duplicate key
            return;
        }
        while(value.compareTo(current.get()) < 0) {
            if(current.getLesserSibling() == null) {
                current.setLesserSibling(key);
                this.setMedian(this.median.getLesserSibling());
                return;
            }
            current = current.getLesserSibling();
        }
        if(value.equals(current.get())) {
            // TODO Decide what to do with duplicate key
            return;
        }
    }

    @Override
    public SearchResult<T> search(T value) {
        Key<T> current = this.median;
        while(value.compareTo(current.get()) > 0) {
            current = current.getGreaterSibling();
        }
        if(value.equals(current.get())) {
            return SearchResult.createFound(current);
        }
        while(value.compareTo(current.get()) < 0) {
            current = current.getLesserSibling();
        }
        if(value.equals(current.get())) {
            return SearchResult.createFound(current);
        }
        return SearchResult.createNotFound();
    }

    @Override
    public void remove(Key<T> key) {
        
    }

    @Override
    public Key<T> getMedian() {
        return this.median;
    }

    @Override
    public void setMedian(Key<T> key) {
        this.median = key;
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
