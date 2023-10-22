class A{
    int i;
    private int j;
    void set(int x,int y){
        i=x;
        j=y;
        System.out.print(i,j);
    }

}
class m extends A{
    int total;
    void t(){
        total=i+j;
    }
}
public class prac1 {
    public static void main(String[] args){
        A ob = new A();
        ob.set(10,20);
        

    }
    
    
}
