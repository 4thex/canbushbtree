package com._4thex.canbrushbtree;
import com._4thex.canbrushbtree.impl.TreeImpl;
import com._4thex.canbrushbtree.impl.KeyImpl;
import com._4thex.canbrushbtree.impl.NodeImpl;

public class ObjectFactory<T extends Comparable<T>> {
    public ObjectFactory() {

    }

    public Key<T> createKey(Tree<T> tree, T value) {
        return new KeyImpl<T>(tree, value);
    }

    public Tree<T> createTree(int order) {
        return new TreeImpl<T>(this, order);
    }

    public Node<T> createNode(Tree<T> tree, Node<T> parent) {
        return new NodeImpl<T>(tree, parent);
    }
}
