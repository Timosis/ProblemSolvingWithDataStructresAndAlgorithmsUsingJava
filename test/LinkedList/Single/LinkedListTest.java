package LinkedList.Single;

import main.Array.PivotIndex;
import main.LinkedList.Single.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @Test
    void insertTest() {

        LinkedList list = new LinkedList();
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.insertFirst(list,3);
    }

    @Test
    void GetLastTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        var lastNode  = list.getLast(list);
        assertEquals(5, lastNode);

    }

    @Test
    void countOfItemTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        var countOfItem = list.countOfItems(list);
        assertEquals(7, countOfItem);
    }

    @Test
    void insertFirstTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.insertFirst(list,10);
        list.printList(list);
    }

    @Test
    void getFirstTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        var firstElement = list.getFirst(list);
        assertEquals(1, firstElement);
    }

    @Test
    void getLastTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        var last = list.getLast(list);
        assertEquals(7,last);
    }

    @Test
    void clearTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.clear(list);
        list.printList(list);
    }

    @Test
    void removeFirstTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.removeFirst(list);
        list.printList(list);
    }

    @Test
    void removeLastTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.removeLast(list);
        list.printList(list);
    }

    @Test
    void insertLastTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.insertLast(list, 8);
        list.printList(list);
    }

    @Test
    void getAtTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        var result = list.getAt(list, 3);
        assertEquals(3,3);
    }

    @Test
    void removeAtTest() {

        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.removeAt(list, 5);
        list.printList(list);
    }

    @Test
    void insertAtTest(){
        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,7);
        list.insertAt(list,4,4);
        list.insertAt(list,6,10);
        list.printList(list);

    }

    @Test
    void reverseTest(){
        LinkedList list = new LinkedList();
        for (int i = 1; i <= 10 ; i++) {
            list.insert(list,i);
        }
        list.printList(list);
        System.out.println();
        list.reverseList(list);
        list.printList(list);

    }

    @Test
    void removeElementsTest_1(){
        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,2);
        list.insert(list,6);
        list.insert(list,2);
        list.removeElements(list,2);
        list.printList(list);
    }
    @Test
    void removeElementsTest_2(){
        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,1);
        list.insert(list,1);
        list.insert(list,1);
        list.insert(list,1);
        list.insert(list,1);
        list.removeElements(list,1);
        list.printList(list);
    }



}
