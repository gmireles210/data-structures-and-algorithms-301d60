package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
    @Test
    public void emptyListTest() {
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }

    @Test
    public void insertHeadTest() {
        LinkedList list = new LinkedList();
        list.insertHead(10);
        assertEquals(10, list.head.dataVal);
    }

    @Test
    public void verifyHead() {
        LinkedList list = new LinkedList();
        list.insertHead(20);
        list.insertHead(10);
        list.insertHead(50);
        assertEquals(50, list.head.dataVal);
    }
}