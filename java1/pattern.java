public class pattern {
    public static void main(String [] args){
        int n=6;
        int i,j,b;
        // for(i=1;i<=n;i++){
        //     for(b=1;b<=n-i;b++)
        //   {  System.out.print(" ");}
        //     for(s=1;s<=2*i-1;s++){
        //      System.out.print("*");}
        // System.out.println();
        // }
        for(i=1;i<=n;i++){
            for(b=1;b<i;b++){
                System.out.print(" ");
            }
            for(j=1;j<=2*(n-i);j++)
            {System.out.print("*");}
            System.out.println();
        }
        
    }
    }
