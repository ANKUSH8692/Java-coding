import java.util.*;
public class paper {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String a1 = scan.nextLine();
        String a12 = scan.nextLine();
        int n1 = a1.length(); 
        a1=a1+" ";
        int n2 = a12.length();
        String b = "";
        for(char i:a1.toCharArray()){
            if(i>='a' && i<='z'){
                b=b+i;
                
            }
            else
            {
                if(b.length()==n2){
                    System.out.println(b+a12);
                    break;
                }
                else{
                 b="";
                } 
            }
        }
    
    }
    
}
