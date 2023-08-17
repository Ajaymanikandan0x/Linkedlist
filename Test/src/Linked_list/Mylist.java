package Linked_list;

class MyList {
    class Aad {
        int data;
        Aad next;

        Aad(int data) {
            this.data = data; 
        }
    }

    public Aad first;
    public Aad last;

    void input(int data) {
        var adNew = new Aad(data);
        if (first == null) {
            first = last = null;
            first = adNew;
        } else {
            last.next = adNew;
        }
        last = adNew;

    }

    void dis() {
        Aad temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void delete(int data) {
        Aad temp = first,pre;
        if (first.data == (data)) {
            first = first.next;
            return;
        }
        while (temp.next != null) {
            if ((temp.next).data == (data)) {
                // Aad pre;
                pre = temp;
                if (temp.next == last) {
                    last = temp;
                    last.next = null;
                    return;
                }
                temp.next = (pre.next).next;
                return;
              } 
                 
                temp = temp.next;
            
        }
    }

    void NewAad(int nextTo,int data){
Aad newAad =new Aad(data);
Aad temp,priv;
temp=first;
if(temp!=null && temp.data==nextTo){
  priv=temp;
 
newAad.next=temp.next;
 priv.next=newAad;
return;
}
 while(temp!=null){
    if(temp.data==nextTo){

  priv=temp;
newAad.next=temp.next;
priv.next=newAad;
if(temp==last){
last.next=newAad;
last=newAad;
last.next=null;
}
return;
    }
temp=temp.next;
}

    }

}
