package Linked_list;
import java.util.NoSuchElementException;

public class Link_list {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public boolean isEmpty() {

        return first == null;
    }
    public void printA(){
        var current=first;
        while (current!=null) {
            System.out.print(current.value+"\t");
            current=current.next;
        }

    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

    }

    public void addFist(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            first.next = node;
            first = node;
        }

    }

    public int Index(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;

        }
        return -1;
    }

    public boolean contain(int item) {
        return Index(item) != -1;
    }

    public void RemoveFist() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;

        }
        var second = first.next;
        first.next = null;
        first = second;
    }
        public void RemoveLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
            
        }

       
        
        var current=first;
        while (current!=null) {
            if(current.next==last){
                last=current; 
                last.next=null;
                return;
            }
             
            
                current = current.next;
        }
    }
}