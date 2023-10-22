import java.util.Scanner;
public class p1{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number ");
        int n1; 
        int n2;
        n1=input.nextInt();
        n2=input.nextInt();
        if(n1==n2){
            System.out.printf("the no. are equal %d%n",n1,n2);
        }
        if(n1!=n2){
            System.out.printf("the no. are not equal %d%n",n1,n2);
        }
        if(n1>n2){
            System.out.printf("the no. are  n1 is greater then %d%n",n1,n2);
        }
        if(n1<n2){
            System.out.printf("the no. are  n1 is less then %d%n",n1,n2);
        }
        System.out.printf("********%n****%n*****%n****%n****%n");
    }
}