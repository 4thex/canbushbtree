package com._4thex.canbrushbtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ObjectFactoryTest {
    @Test
    void testCreateTree() {
        ObjectFactory<Integer> factory = new ObjectFactory<Integer>();
        Tree<Integer> tree = factory.createTree(5);
        assertNotNull(tree);
        assertEquals(5, tree.getOrder());
    }

    
}
