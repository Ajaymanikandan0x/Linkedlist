package Linked_list;

public class Stack {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public Node top;
    public void push(int data){
     var newAd=new Node(data);
     if(top==null){
        top=newAd;
     }else{
        newAd.next=top;
        top=newAd;
     }
    }
    public void printData(){
        Node temp=top;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void pop(){
        if (top==null){
            System.out.println("empty");
        }else{
            top=top.next;
        }
    }
    
}
