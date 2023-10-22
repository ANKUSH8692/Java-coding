import java.util.Scanner;
public class p6{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String n = scan.nextLine();
        int z = n.length();
        for(int i=0;i<=z;i++){
            System.out.println(n[i]);
        }
    }
}