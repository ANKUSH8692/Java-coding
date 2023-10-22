import java.util.*; 
public class a1 {
    public static void main(String[] args)
    { Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt();
        int arr[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) {
                }
                else if(i+j==n-1){}
                else{
                    sum=sum+arr[i][j];
                }
            }

        }
    System.out.println(sum+"sum");
    }

    
}
