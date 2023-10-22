package a;
class Add
{
    int a,b;
    Add()
    {
       a=b = 0;
    }
    Add(int len)
    {
        a= b = len;
    }
    Add(int x, int y)
    {
        a = x;
        b= y;
    }   
    int sum()
    {
        return a+b;
    }
}
public class l1 {
    public static void main(String[] args){
        Add obj1 = new Add();
        Add obj2 = new Add(5);
       Add obj3 = new Add(5,10);
        
        int result;
        result = obj1.sum();
        System.out.println(" sum of values in obj1= " + result);

      result = obj2.sum();
        System.out.println(" sum of values in obj2= " + result);

        result = obj3.sum();
        System.out.println(" sum of values in obj3= " + result);

    }
    
}
