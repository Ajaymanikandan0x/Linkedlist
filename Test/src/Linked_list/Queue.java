package Linked_list;

public class Queue {
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
   public Node first;
   public Node last;
   public void enqueue(int data){
    var newNode= new Node(data);
    Node temp=first;
    if(temp==null){
        first=last=newNode;
    }else{
      last.next=newNode;
      last=newNode;
            
        }
    }
    public void print(){
        Node temp =first;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
            
        }
    }
    public void deQueue(){
        if(first==null){
            System.out.println("empty");
        }
        else{
            
            first=first.next;
            
        }

    }
   }

