package com._4thex.canbrushbtree;

public interface IKeyContainer<T extends Comparable<T>> {
    public void insert(Key<T> key);
    public void remove(Key<T> key);

}
