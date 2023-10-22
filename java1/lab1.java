import java.util.*;
interface area{
    public void dim();
    public void area();

}
class rectangle implements area{
    int l,b,area;
    public void dim()
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter the length");
    l=s.nextInt();
    b=s.nextInt();
}
public void area(){
    area=l*b;
    System.out.println("area of rectangle"+area);
}
}
class Square implements area{
    int l,area;
    public void dim(){
        Scanner so=new Scanner(System.in);
        System.out.println("enter the length");
        l=so.nextInt();
    }
    public void area(){
        area=l*l;
        System.out.println("area of square"+area);
    }
}

public class lab1 {
    public static void main(String[] args){
       rectangle obj=new rectangle();
       obj.dim();
       obj.area();
       Square obj1=new Square();
       obj1.dim();
       obj1.area();


       
        
    }
}
