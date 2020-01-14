package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
    @Test public void emptyListTest() {
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }

    @Test public void insertHeadTest() {
        LinkedList list = new LinkedList();
        list.insertHead(12);
        assertEquals(12, list.head.dataVal);
    }

    @Test public void verifyHead() {
        LinkedList list = new LinkedList();
        list.insertHead(25);
        list.insertHead(12);
        list.insertHead(55);
        assertEquals(55, list.head.dataVal);
    }

    @Test public void booleanValueSearch() {
        LinkedList list = new LinkedList();
        list.insertHead(25);
        list.insertHead(12);
        list.insertHead(55);
        list.includedInList(12);
        assertFalse("Does not have 11.",
                list.includedInList(11));
        assertTrue("Does have 12.",
                list.includedInList(12));
    }

    @Test public void toStringTest() {
        LinkedList list = new LinkedList();
        list.insertHead(25);
        list.insertHead(12);
        list.insertHead(55);
        String expectedAnswer = "{ 55 } => { 12 } => { 25 } => null";
        assertEquals("Contains nodes 55, 12, 25",
                expectedAnswer,
                list.toString());
        System.out.println("expectedAnswer = " + expectedAnswer);
    }
}
