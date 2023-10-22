public class test implements Runnable{
    public void run(){
        System.out.println("thread has ended");           /// thread is used to run code parllel
        for(int i=1;i<5;i++){                                // as output comes in any order
            System.out.println(i+"thread end");
        p
            try{  
                Thread.sleep(400);                   ///Synchronization for uniform ouput
               }catch(Exception e){System.out.println(e);}
        System.out.println();
    }}
    public static void main(String[] args){
        test obj = new test();
        Thread t = new Thread(obj);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t.start();
        t1.start();
        t2.start();

        System.out.println("hi");
    }
}