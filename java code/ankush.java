import java.util.*;
class pap{
    void strde(String a,String a2){
        int num1=a.length();
        int num2=a2.length();
        int c= (num1-(int)((num1+num2)/2));
        if (num1==num2){
            System.out.println(a+a2);;
        }
        else{
            if (num1>num2){
                for(int i=c ;c<a.length();i++){
                    char d =a.charAt(i);
                    System.out.print(d+"");
            }
            System.out.print(a2);
            }
        }
    }
}
    public class ankush{
        public static void main(String [] args) {
            Scanner scan = new Scanner(System.in);
            String a1 = scan.nextLine();
            String a12 = scan.nextLine();
            pap oj=new pap();
            oj.strde(a1,a12);
 }
  }
    

