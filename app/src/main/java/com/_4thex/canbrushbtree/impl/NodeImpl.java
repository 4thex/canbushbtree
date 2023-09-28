package com._4thex.canbrushbtree.impl;

import java.util.Vector;

import com._4thex.canbrushbtree.Key;
import com._4thex.canbrushbtree.Node;
import com._4thex.canbrushbtree.SearchResult;
import com._4thex.canbrushbtree.Tree;

public class NodeImpl<T extends Comparable<T>> extends Node<T> {

    private Vector<Key<T>> keys;
    private Tree<T> tree;
    private Node<T> parent;
    
    public NodeImpl(Tree<T> tree, Node<T> parent) {
        this.tree = tree;
        this.parent = parent;
        this.keys = new Vector<Key<T>>();
    }

    @Override
    public int getCount() {
        return this.keys.size();
    }

    @Override
    public void insert(Key<T> key) {
        if(this.getCount()==0) {
            this.keys.add(key);
            return;
        }
        Key<T> current = this.getMedianKey();
        if(current.get().compareTo(key.get()) == 0) {
            // Nothing to do
            return;
        }
        if(current.get().compareTo(key.get()) > 0) {

        }
        this.keys.add(key);
    }

    @Override
    public Key<T> getLowestKey() {
        return this.keys.get(0);
    }

    @Override
    public Key<T> getHighestKey() {
        return this.keys.get(this.keys.size()-1);
    }

    @Override
    public Key<T> getMedianKey() {
        return this.keys.get(this.keys.size()/2);
    }

    @Override
    public SearchResult<T> search(T value) {
        Key<T> median = this.getMedianKey();
        if(median.get().equals(value)) {
            return SearchResult.createFound(median);
        }
        return SearchResult.createNotFound();
    }

    @Override
    public void remove(Key<T> key) {
        
    }
    
}
