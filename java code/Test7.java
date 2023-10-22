import java.util.Scanner;
// DAta incapsulation...

class Student{
    public int rollno;
    public String name;
    Scanner sc= new Scanner(System.in);
    public void getrollno(){
        System.out.println("Enter your rollno and name:");
        rollno=sc.nextInt();
        name=sc.nextLine();
    }
    
    void putrollno(){
        System.out.println("Roll no:="+rollno);
        System.out.println("Name="+name);

    }
}
class Marks extends Student{
    protected int m1,m2,m3;
    void getmarks(){
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
void putmarks(){
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);
    }
}
class Result extends Marks{
    private float total;
    float avg;
    void compute_display(){
        total=m1+m2+m3;
        System.out.println("Total Marks:"+total);
    }
    void average(){
        avg=total/3;
        System.out.println("Average Marks :"+avg);
    }
}
class Test7{
    public static void main(String[] args) {
        Result r =new Result();
        r.getrollno();
        r.getmarks();
        r.putrollno();
        r.putmarks();
        r.compute_display();
        r.average();
    }
}
