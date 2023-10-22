import java.util.*;
public class currencyconvert{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String arr[]= new String[5];
        for(int i=0;i<5;i++){
            System.out.println("enter the currency");
            arr[i]=sc.nextLine();
        }
        do{
        System.out.println("Enter \ny to exchange currency\n1.To list the currency aviable\n0.Exit");
        System.out.println("enter your choice");
        String ch=sc.nextLine();
            if(ch=="1"){ 
                int c=1;
                for(String r:arr){
                    System.out.println(c+" "+r);
                    c++;
                }
                System.out.println("enter your choice");
                ch=sc.nextLine();
            }
            if(ch=="y"){
                System.out.println("enter which currency you wnat to change");
                String curr=sc.nextLine();
                for(String r:arr){
                    if(r==curr){
                    }
                    else{
                        System.out.println("wrong input currency");
                    }    
                }
            }
            if(ch=="0"){
                System.out.println("EXIT");
            }
            ch=sc.nextLine();
            }while(ch=="0");
    }

    }
