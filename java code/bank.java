import java.util.*;
class account{
    public String name;
    public double accno;
    public double rate;
    public double mrate;
    public double amount;
     public void setname(String name){
        this.name=name;
    }
    public void setacc(Double accno){
        this.accno=accno;
    }
    public void setrate(double rate){
        mrate=rate/12;
    }
    public void setamount(Double amount){
        this.amount=amount;
    }
    public String getname(){
        return name;
    }
    public double getamount(){
        return amount;
    }
    public double getrate(){
        return rate;
    }
    public double getpayment(){
        return (amount*mrate)/(1-(1/Math.pow(1+rate,12)))
    }
}
public class bank {
    account acc=new account();
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the name");
    String Name=scan.nextLine();
    System.out.println("enter the account no.");
    Double accno=scan.nextDouble();
    System.out.println("enter the amount");
    Double amount=scan.nextDouble();
    System.out.println("enter the rate");
    Double rate=scan.nextDouble();
    acc.setname(Name);
    


    
}
