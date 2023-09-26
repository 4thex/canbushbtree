package com._4thex.canbrushbtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeTest {
    private Tree<Integer> tree;
    private Node<Integer> node;
    private ObjectFactory<Integer> factory;
    @BeforeEach
    void createANode() {
        this.factory = new ObjectFactory<Integer>();
        this.tree = factory.createTree(5);
        this.node = factory.createNode(this.tree);
    }

    @Test
    void nodeKeysAreCorrectAfterMultipleInserts() {
        Key<Integer> lowKey = this.factory.createKey(this.tree, 5);
        Key<Integer> highKey = this.factory.createKey(this.tree, 6);
        this.node.insert(lowKey);
        this.node.insert(highKey);
        assertEquals(6, this.node.getHighestKey().get());
        assertEquals(5, this.node.getLowestKey().get());
        assertEquals(5, this.node.getMedianKey().get());
    }
}
