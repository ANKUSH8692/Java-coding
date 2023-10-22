public class thread implements Runnable {
public void run(){
    for(int i=0;i<5;i++)
    System.out.println("the main thread+"+i);
}    }
public class thread2{
public void main(String args []){
    thread td=new thread();
    td.start();
    for(int i=0;i<4;i++)
        System.out.println("the Thread"+i);
    
}
}
