package linkedList;
//Used online resources from StackOverflow, geeks to geeks, and team members
//https://stackoverflow.com/questions/37137350/linkedlist-insert-after-node/37138082
//https://codereview.stackexchange.com/questions/104940/inserting-a-node-to-a-given-position-in-a-linked-list
//http://junit.sourceforge.net/javadoc/org/junit/Before.html // https://junit.org/junit4/faq.html

import static org.junit.Assert.*;


import org.junit.Test;

import org.junit.Before;

public class LinkedListTest {

    LinkedList<Integer> intList;
    //start list with intergers and used before after seeing in various resources
    @Before public void start_LL_W_Ints() {

        intList = new LinkedList<>();

        intList.insertHead(20);
        intList.insertHead(6);
        intList.insertHead(44);
        intList.insertHead(3);
        intList.insertHead(850);
        intList.insertHead(36);
        intList.insertHead(20);
        intList.insertHead(61);
        intList.insertHead(850);
        intList.insertHead(76);
        intList.insertHead(58);
        intList.insertHead(6);
    }

    // Testing LL values
    @Test public void llListValTest() {

        assertEquals(6, (int) intList.head.value);
        assertEquals(58, (int) intList.head.followOn.value);
        assertEquals(76, (int) intList.head.followOn.followOn.value);
        assertEquals(850, (int) intList.head.followOn.followOn.followOn.value);
        assertEquals(61, (int) intList.head.followOn.followOn.followOn.followOn.value);
        assertEquals(20, (int) intList.head.followOn.followOn.followOn.followOn.followOn.value);
        assertEquals(36, (int) intList.head.followOn.followOn.followOn.followOn.followOn.followOn.value);
        assertEquals(850, (int) intList.head.followOn.followOn.followOn.followOn.followOn.followOn.followOn.value);
        assertEquals(3, (int) intList.head.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.value);
        assertEquals(44, (int) intList.head.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.value);
        assertEquals(6, (int) intList.head.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.value);
        assertEquals(20, (int) intList.head.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.value);

    }
    // Testing Empty LL
    @Test public void linkedList_EmptyTest() {

        LinkedList<Integer> emptyIntegerList = new LinkedList<>();

        int expected = 0;
        int actual = emptyIntegerList.getSize();

        assertEquals(expected, actual);
    }

    // Testing Insert
    @Test public void linkedList_InsertTest() {

        int expected = 12;
        int actual = intList.getSize();

        assertEquals(expected, actual);
    }

    // Testing strings
    @Test public void linkedList_StringTest() {

        LinkedList<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.insertHead(36);
        intLinkedList.insertHead(6);
        intLinkedList.insertHead(61);
        intLinkedList.insertHead(76);

        String expected = "{ 76 } -> { 61 } -> { 6 } -> { 36 } -> NULL";
        String actual = intLinkedList.toString();

        assertEquals(expected, actual);
    }

    // Testing head
    @Test public void linkedList_HeadTest() {

        int expected = 6;
        int actual = intList.head.value;

        assertEquals(expected, actual);
    }

    // Testing LL True
    @Test public void linkedList_TrueTest() {

        boolean actual = intList.includedInList(44);

        assertTrue(actual);
    }

    // Testing LL False
    @Test public void linkedList_FalseTest() {

        boolean actual = intList.includedInList(1);

        assertFalse(actual);
    }

    // Testing LL Append
    @Test public void linkedList_AppendTest() {

        intList.append(999);
        assertEquals(999, (int) intList.head.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.value);
        intList.append(850009);
        assertEquals(850009, (int) intList.head.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.followOn.value);
    }

    // Testing LL insert before true
    @Test public void linkedList_BeforeValTestTrue() {

        LinkedList<Integer> shortList = new LinkedList<>();

        shortList.insertHead(36);
        shortList.insertHead(6);
        shortList.insertHead(61);
        shortList.insertHead(76);

        boolean successfullyInserted = shortList.insertBefore(6, 850);

        assertTrue(successfullyInserted);
        assertEquals(850, (int)shortList.head.followOn.followOn.value);
    }

    // Testing LL insert before False
    @Test public void linkedList_BeforeValTestFal() {

        LinkedList<Integer> shortList = new LinkedList<>();

        shortList.insertHead(36);
        shortList.insertHead(6);
        shortList.insertHead(61);
        shortList.insertHead(76);

        boolean successfullyInserted = shortList.insertBefore(121314, 850);

        assertFalse(successfullyInserted);
    }

    // Testing LL middle True
    @Test public void linkedList_MidTestTrue() {

        LinkedList<Integer> shortList = new LinkedList<>();

        shortList.insertHead(36);
        shortList.insertHead(6);
        shortList.insertHead(61);
        shortList.insertHead(76);

        boolean successfullyInserted = shortList.insertAfter(6, 850);
        assertTrue(successfullyInserted);
        assertEquals(850, (int)shortList.head.followOn.followOn.followOn.value);
    }

    // Testing LL middle False
    @Test public void linkedList_MidTestFalse() {

        LinkedList<Integer> shortList = new LinkedList<>();

        shortList.insertHead(36);
        shortList.insertHead(6);
        shortList.insertHead(61);
        shortList.insertHead(76);

        boolean successfullyInserted = shortList.insertAfter(22323, 850);

        assertFalse(successfullyInserted);
    }

    // Testing LL insertAfter True
    @Test public void linkedList_InsertAfterValTrue() {

        LinkedList<Integer> shortList = new LinkedList<>();

        shortList.insertHead(36);
        shortList.insertHead(6);
        shortList.insertHead(61);
        shortList.insertHead(76);

        boolean successfullyInserted = shortList.insertAfter(76, 850);

        assertTrue(successfullyInserted);
        assertEquals(850, (int)shortList.head.followOn.value);
    }


}