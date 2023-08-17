public class Sample2 {
    int va=17;
    void display(){
        System.out.println("result :"+va);

    }
    Sample2(){
        double nu=3.05;
        float nm=3;
        double c =nu*nm;
        System.out.println(c);
        String name="pora syma!";
        System.out.println(name);

    }
        public static void main(String   []aj){
        Sample1 sa=new Sample1();
        Sample2  sb=new Sample2();
        sa.print(sb);

    }



}
