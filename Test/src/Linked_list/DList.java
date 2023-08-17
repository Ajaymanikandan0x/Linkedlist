package Linked_list;
class DList {
    class Node {
        int data;
        Node next;
        Node priv;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    void AadNode(int data) {
        Node newNode = new Node(data);
        Node temp;
        temp = head;
        if (temp == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.priv = tail;
        }
        tail = newNode;
    }

    void disf() {
        Node temp = head;
        if (temp == null) {
            System.out.print("Empty");
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void disb() {
        Node temp;
        temp = tail;
        if (temp == null) {
            System.out.print("Empty");
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.priv;
        }
    }

    void delete(int data) {
        Node temp = head, pri;
        if (temp.data == (data)) {
            temp.next.priv = null;
            head = head.next;

            return;
        }
        while (temp != null) {
            if (temp.next.data == data) {

                if (temp.next == tail) {
                    tail = temp;
                    tail.next = null;
                    return;
                }
                pri = temp;
                pri.next = temp.next;
                temp.next.priv = pri;
                return;
            }
            temp = temp.next;
        }
    }

    public void insNode(int nexTo, int data) {
        var newNode = new Node(data);
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp, pri;
        temp = head;
        if (temp.data == nexTo) {
            pri = temp;
            newNode.next = temp.next;
            temp.next.priv = newNode;
            pri.next = newNode;
            newNode.priv = pri;
            return;

        }
        while (temp != null) {
            if (temp.data == nexTo) {

                if (temp == tail) {
                    tail.next = newNode;
                    tail = newNode;
                    tail.priv = newNode;
                    tail.next = null;
                    return;
                }
                pri = temp;
                newNode.next = temp.next;
                temp.next.priv = newNode;
                pri.next = newNode;
                newNode.priv = pri;
            }
            temp = temp.next;
        }
    }
}