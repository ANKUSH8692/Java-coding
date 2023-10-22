import java.util.Scanner;
import java.util.Random;
public class p5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random ran = new Random();
        System.out.printf("enter the y to play and n to exit"); 
        String x=scan.nextLine();
        while(x.equals("y")){
            System.out.printf("enter s for stone  sc for scissor  p for paper ");
            String a = scan.nextLine();
            int b=ran.nextInt(3);
            if(a.equals("s")){
                if(b==0){
                    System.out.printf("computer has stone\n");
                    System.out.printf(" game draw\n");
                }
                else if(b==1){
                    System.out.printf("computer has scissor\n");
                    System.out.printf(" game win\n");}
                else 
                {System.out.printf("computer has paper\n");
                System.out.printf(" game loose\n");}  
            }
            else if(a.equals("sc")){
                if(b==0){
                    System.out.printf("computer has stone\n");
                    System.out.printf(" game loose\n");
                }
                else if(b==1){
                    System.out.printf("computer has scissor\n");
                    System.out.printf(" game draw\n");}
                else
                {System.out.printf("computer has paper\n");
                System.out.printf(" game win\n");}}

            else if(a.equals("p")){
                    if(b==0){
                        System.out.printf("computer has stone\n");
                        System.out.printf(" game win\n");
                    }
                    else if(b==1){
                        System.out.printf("computer has scissor\n");
                        System.out.printf(" game loose\n");}
                        else
                        {System.out.printf("computer has paper\n");
                    System.out.printf(" game draw\n");}}    
                    else {
                    System.out.printf("enter wrong input\n");
                }
                System.out.printf("want to enter more\n");
            x = scan.nextLine(); 
         }
        System.out.printf("Exit");
    }
    
}
