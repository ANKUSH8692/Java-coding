import java.util.Scanner;
public class n {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
    //     int n=10;
    //     do{
    //         n=n-1;
    //        System.out.println("enetre the "+n);         
    //     }while(n>=5);
    // System.out.println("you name"+n);
    int r= scan.nextInt();
    int c=scan.nextInt();
    int n=1;
    for(int i=0;i<r;i++){
        System.out.println();
        for(int j=0;j<c;j++){
            System.out.print(n);
            n=n+1;
        }
    }
    }
    
}
