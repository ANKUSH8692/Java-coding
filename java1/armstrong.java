import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = n;
        int rev = 0;
        while(n>0){
           int b = n%10;
            rev = rev+(b*b*b);
            n=n/10;
        } 
    if(rev==a){
        System.out.println("it is armstrong");
    }
    else
    {System.out.println("it is not ");}

}
    
}
