import java.util.*;
class table{
    synchronized void printtable(int n){
        for(int i=0;i<=10;i++)
        System.out.println(n+"*"+i+"="+i*n);
    }
}
class  mythread extends Thread{
    table t=new table();
    int number;
    mythread(table t,int number){
        this.t=t;
        this.number=number;
    }}
    public void run()
        {
            t.printtable(number);
        }
 
        class  mythread2 extends Thread{
            table t=new table();
            int number;
            mythread(table t,int number){
                this.t=t;
                this.number=number;
            }
            public void run()
                {
                    t.printtable(number);
                }
         
}

public class lab1 {
    public static void main(String [] args)
{
    Scanner sc= new Scanner(System.in);
    int n1,n2;
    System.out.println("enter the two number ");
    n1= sc.nextInt();
    n2=sc.nextInt();
    table t=new table;
    mythread t1=new mythread(t,n1);
    mythread2 t2=new mythread(t,n12);
    t1.start();
    t2.start();

}
    
    
}
