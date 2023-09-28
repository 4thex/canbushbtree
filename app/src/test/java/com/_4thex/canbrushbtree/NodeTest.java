package com._4thex.canbrushbtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void nodeKeysAreCorrectAfterTwoInserts() {
        Key<Integer> lowKey = this.factory.createKey(this.tree, 5);
        Key<Integer> highKey = this.factory.createKey(this.tree, 6);
        this.node.insert(lowKey);
        this.node.insert(highKey);
        assertEquals(6, this.node.getHighestKey().get());
        assertEquals(5, this.node.getLowestKey().get());
        // TODO: With an even number of keys, the median is returned as the higher option. Should it be the lower one?
        assertEquals(6, this.node.getMedianKey().get());
    }

    @Test
    void getCountIsTwoAfterTwoInserts() {
        Key<Integer> lowKey = this.factory.createKey(this.tree, 5);
        Key<Integer> highKey = this.factory.createKey(this.tree, 6);
        this.node.insert(lowKey);
        this.node.insert(highKey);
        assertEquals(2, this.node.getCount());
    }

    @Test
    void insertCausesPromoteWhenCountWouldReacheOrder() {
        // Max number of keys is order-1
        // So if number of keys at insert is equal to order-1, promotion of the median key must happen
        // A promotion is like an insert into the parent node
        // A node can only have one parent, so an insert call should do the trick.
        Node<Integer> mockNode = mock(Node.class);
        Node<Integer> node = this.factory.createNode(this.tree, mockNode);
        int count = this.tree.getOrder();
        while(count-- > 0) {
            node.insert(this.factory.createKey(this.tree, count));
        }
        // verfiy that mockNode.insert has been called
        // mockNode.
    }
}
