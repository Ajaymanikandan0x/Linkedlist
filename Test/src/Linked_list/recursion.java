package Linked_list;

public class recursion {

    static void print(int data) {
        if (data < 1) {
            return;
        }
        print(data - 1);
        System.out.println(data);
        print(data - 1);
    }

    static int var(int data) {

        if (data < 1) {
            return 0;
        }
        return 1 + var(data / 2);

    }
    static  int d=1;
    static  void rec (int data){
        System.out.println(data);
         System.out.println(d);
         d++;
         if (data>1) {
             rec(data-1);
     
         }
         System.out.println(d);
        
    }

    public static void main(String[] args) {

        // print(3);
        // int data =var(10);
        // System.out.println(data);
        rec(3);

    }

}
