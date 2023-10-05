package com._4thex.canbrushbtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeTest {
    private Tree<Integer> tree;
    private ObjectFactory<Integer> factory;
    @BeforeEach
    void createATree() {
        this.factory = new ObjectFactory<Integer>();
        this.tree = factory.createTree(5);
    }

    @Test
    void hasRootNode() {
        assertNotNull(this.tree.getRootNode());
    }

    @Test
    void hasOrder() {
        assertEquals(5, this.tree.getOrder());
    }

    @Test
    void setRootNode() {
        Node<Integer> previous = this.tree.getRootNode();
        Node<Integer> next = this.factory.createNode(this.tree, this.tree.getRootNode());
        this.tree.setRootNode(next);
        Node<Integer> current = this.tree.getRootNode();
        assertNotEquals(current, previous);
        assertEquals(current, next);
    }

}
