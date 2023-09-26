package com._4thex.canbrushbtree;

public abstract class SearchResult<T extends Comparable<T>> {
    public abstract boolean getFound();
    public abstract Key<T> getKey();
    private static class FoundSearchResult<TU extends Comparable<TU>> extends SearchResult<TU > {
        private Key<TU> key;
        public FoundSearchResult(Key<TU> key) {
            this.key = key;
        }
        @Override
        public boolean getFound() {
            return true;
        }

        @Override
        public Key<TU> getKey() {
            return this.key;
        }

    }
    private static class NotFoundSearchResult<TU extends Comparable<TU>> extends SearchResult<TU > {
        public NotFoundSearchResult() {
            
        }
        @Override
        public boolean getFound() {
            return false;
        }

        @Override
        public Key<TU> getKey() {
            return null;
        }

    }
    public static <TU extends Comparable<TU>> FoundSearchResult<TU> createFound(Key<TU> key) {
        return new FoundSearchResult<TU>(key);
    }
    public static <TU extends Comparable<TU>> NotFoundSearchResult<TU> createNotFound() {
        return new NotFoundSearchResult<TU>();
    }
}
