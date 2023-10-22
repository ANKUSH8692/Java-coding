import java.util.*;
public class l1 {
   
    public static void main(String[] args){
        student[] Arr;
        Arr  = new student[2];
        Arr[0] = new student(18,"ankush");
        Arr[1] = new student(19,"sunny");
        System.out.println("student data in student arr 0:");
        arr[0].display();
        System.out.println("student data");
        arr[1].display();
}}
class student{
    public int id;
    public String name;
    student(int id,String name){
        this.id=id;
        this.name=name;
    }
}