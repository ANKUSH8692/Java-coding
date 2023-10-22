import java.util.Scanner;
public class primrfact {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.printf("factor are:");
        for(int i=1;i<=x;i++){
            if(x%i==0){
                System.out.println(i);
            }
        }

    }
    
}
