package main.LinkedList.Single;

public class LinkedList {

    Node head;

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data){

        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null){
            list.head = newNode;
        }else{
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = newNode;
        }
        return list;
    }

    // Print LinkedList
    public static void printList(LinkedList list){

        if (list.head == null) {
            System.out.print("Empty Linked List ");
        }

        // start printing with head node
        Node currentNode = list.head;

        // Traverse through the LinkedList
        while(currentNode != null){

            // Print the data at current node
            System.out.print(currentNode.data + " ");

            // Go to the next node
            currentNode = currentNode.next;
        }
    }

    public static int countOfItems(LinkedList list){

        // If there is no head in list return 0
        if (list.head == null) {
            return 0;
        }

        // Count of node in list
        int countOfItems = 0;

        Node currentNode = list.head;

        while (currentNode != null){
            countOfItems++;
            currentNode = currentNode.next;
        }

        return countOfItems;
    }

    public static LinkedList insertFirst(LinkedList list, int data){
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
            return list;
        }

        // change head node reference with new node
        newNode.next = list.head;
        list.head = newNode;

        return list;
    }

    public static int getFirst(LinkedList list){
        return list.head.data;
    }

    public static int getLast(LinkedList list){
        Node current = list.head;
        while(current.next != null){
            current = current.next;
        }
        return current.data;
    }

    public static void clear(LinkedList list){
        list.head = null;
    }

    public static void removeFirst(LinkedList list){
        if (list.head.next == null){
            list.head = null;
        }

        Node current = list.head;
        list.head = list.head.next;
        current.next = null;
    }

    public static void removeLast(LinkedList list){
        Node current = list.head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public static void insertLast(LinkedList list, int data){
        Node newNode = new Node(data);
        Node current = list.head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static int getAt(LinkedList list, int position){
        int location = 0;
        Node current = list.head;
        while (current.next != null){
            current = current.next;
            location++;
            if (location == position) {
                break;
            }
        }
        return current.data;
    }

    public static void removeAt(LinkedList list, int position){
        int location = 1;
        Node current = list.head;
        Node previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
            location++;
            if (location == position) {
                previous.next = current.next;
               Node removed = current;
               removed.next = null;
            }
        }
    }

    public static void insertAt(LinkedList list, int position, int data){
        Node newNode = new Node(data);
        Node current = list.head;
        int location = 1;
        Node previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
            location++;
            if (location == position) {
                   previous.next = newNode;
                   newNode.next = current;
            }
        }
    }

    public static void reverseList(LinkedList list){
        Node previous = null;
        Node current = list.head;
        Node following = null;

        while(current != null){
            following = current.next;
            current.next = previous;
            previous = current;
            current = following;
        }
        list.head = previous;

    }

    public static LinkedList removeElements(LinkedList list, int val){

        if (list.head == null){
            return null;
        }


        Node current = list.head;

        while (current != null){

            if (list.head.data == val) {
                list.head = list.head.next;
                current = list.head;
            }else{
                if (current.next.data == val){
                    current.next = current.next.next;
                    current = current.next;
                    continue;
                }
            }
        }
        return list;
    }
}
