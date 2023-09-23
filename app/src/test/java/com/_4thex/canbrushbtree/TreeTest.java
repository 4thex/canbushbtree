package com._4thex.canbrushbtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeTest {
    private Tree<Integer> tree;
    @BeforeEach
    void createATree() {
        ObjectFactory<Integer> factory = new ObjectFactory<Integer>();
        this.tree = factory.createTree(5);
    }

    @Test
    void insertedKeyIsFound() {
        tree.insert(5);
        SearchResult<Integer> result = tree.search(5);
        assertTrue(result.getFound());
        assertEquals(5, result.getKey().get());
    }
}
