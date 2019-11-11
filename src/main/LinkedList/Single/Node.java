package main.LinkedList.Single;

public class Node<T> implements Comparable<T> {

     T value;
     Node<T> next;

    public Node(T value){
        this.value = value;
        this.next = null;
    }

    @Override
    public int compareTo(T arg) {
        if (arg == this.value) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
