package com._4thex.canbrushbtree;

public abstract class SearchResult<T extends Comparable<T>> {
    public abstract boolean getFound();
    public abstract Key<T> getKey();
}
