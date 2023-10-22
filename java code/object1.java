import java.util.*;
public class object1 {
    int a,b;
    void getdata(){
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

    }
    void putdata(){
        System.out.println("Adding to number"+(a+b));
    }
    public static void main(String[] args){
        object1 aa = new object1();
        aa.getdata();
        aa.putdata();

    } 
}
