package com._4thex.canbrushbtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;

import com._4thex.canbrushbtree.impl.NodeImpl;

import static org.mockito.Mockito.*;

public class NodeTest {
    private Tree<Integer> tree;
    private Node<Integer> node;
    private ObjectFactory<Integer> factory;
    @BeforeEach
    void createANode() {
        this.factory = new ObjectFactory<Integer>();
        this.tree = factory.createTree(5);
        this.node = this.tree.getRootNode();
    }

    @Test
    void getCountIsCorrect() {
        Key<Integer> lowKey = this.factory.createKey(this.tree, 5);
        Key<Integer> highKey = this.factory.createKey(this.tree, 6);
        this.node.insert(lowKey);
        this.node.insert(highKey);
        assertEquals(2, this.node.getCount());
    }

    @Test
    void searchFindsSingleKeyInNode() {
        Key<Integer> key = this.factory.createKey(this.tree, 5);
        this.node.insert(key);
        SearchResult<Integer> result = node.search(5);
        assertTrue(result.getFound());
        assertEquals(5, result.getKey().get());
    }

    @Test
    void searchFindsKeyInDoubleKeyNode() {
        Key<Integer> key1 = this.factory.createKey(this.tree, 5);
        this.node.insert(key1);
        Key<Integer> key2 = this.factory.createKey(this.tree, 6);
        this.node.insert(key2);
        SearchResult<Integer> result = node.search(6);
        assertTrue(result.getFound());
        assertEquals(6, result.getKey().get());
    }
}
