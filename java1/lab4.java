import java.util.Scanner;
class multithreadingdemo extends Thread{
    public void run(){
        try{
            System.out.println("Thread"+Thread.currentThread().getId+"is running");
        }catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}
public class lab4 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc - new Scanner(System.in);
        System.out.println("enter the thread");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            multithreadingdemo obj = new multithreadingdemo();
            obj.start();
        }
    }
    
}
