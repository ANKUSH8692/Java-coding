import java.util.*;
public class ass6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r=0;
        System.out.println("enter the yes or no");
        String c = scan.nextLine();
        int n;
       while(c.equals("yes"))
       { System.out.print("which note u have 500,200,100,50");
        int N =scan.nextInt();
        switch(N){
            case 50 : System.out.println("enter the no of notes 50 ");
                      n =scan.nextInt();
                      r = r+(50*n);
                     break;
            case 100 :System.out.println("enter the no of notes 100 ");
                      n =scan.nextInt();
                      r =r+(100*n);
                      break;
            case 200: System.out.println("enter the no of notes 200 ");
                      n =scan.nextInt();
                      r =r+(500*n);
                      break;
            case 500:System.out.println("enter the no of notes 500 ");
                     n =scan.nextInt();
                     r =r+(500*n);
                     break;
            default:System.out.println("wrong");
                     break;
            continue;
        }
        
        c=scan.nextLine();
      
    }
    System.out.println("number of ruppes u have"+r);
    }
    
}
