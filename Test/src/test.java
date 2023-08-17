import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("enter a nubers");
        Scanner sca=new Scanner(System.in);
        int num=sca.nextInt();
        int flag=0;
        for(int i=0;i*i<num;i++){
            if(num%i==0){
                 flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("prime number");
        }else{
            System.out.println("nin number");
        }



}
}