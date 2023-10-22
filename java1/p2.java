import java.util.Scanner;
 public class p2{
     public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           Account myaccount=new Account();
           System.out.printf("Intaial value of %S%n%n",myaccount.getname());
           System.out.println("enter the name");
           String thename=input.nextLine();
           myaccount.setname(thename);
           System.out.println();
           System.out.printf("the name of object myaccount is %n%s%n",myaccount.getname());

    }
 }