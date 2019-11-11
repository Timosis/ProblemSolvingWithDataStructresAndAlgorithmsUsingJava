package main.LinkedList.Single;

public class SingleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T element){
        Node<T> node = new Node<T>(element);

        // since there is only one element, both head and
        // tail points to the same object.
        if (head == null){
            head = node;
            tail = node;
        }else{
            //set current tail next link to new node
            tail.next = node;
            tail = node;
        }
    }

    public void reverse(){
        if (head == null || head.next == null){
            return;
        }

        Node<T> previous = null;
        Node<T> current = head;
        Node<T> following = head;

        while (current != null){
            following = following.next;
            current.next = previous;
            previous = current;
            current = following;
        }
        head = previous;
    }

    public void printList(){
        Node<T> node = head;
        while(node != null){
            System.out.print("["+ node.value + "]->");
            node = node.next;
        }

        System.out.println("["+ "NULL" +"]");

    }

}
