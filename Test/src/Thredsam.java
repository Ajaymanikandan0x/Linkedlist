public class Thredsam extends Thread {
    @Override
    public void run(){
        super.run();
    

    for(int i=0;i<10;i++){
        System.out.println("thered count :"+i);

    try {
        Thread.sleep(1000);
           
        } catch (Exception e) {
        // TODO: handle exceptin
    
        }
    }

}
}