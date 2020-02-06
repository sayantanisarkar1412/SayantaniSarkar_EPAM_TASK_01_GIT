package sayantani.ece;


import java.util.*;
interface gift
{
double getw();
void setw(double w);
double getp();
void setp(double p);
String get_typ();
void set_typ(String t);

}


class sweets implements gift
{
double wt;
double prc;
String typ;
public void setw(double f)
{
 wt=f;
}   
public double getw()
{
 return wt;
}
public void setp(double p)
{
 prc=p;
}   
public double getp()
{
  return prc;
}
public void set_typ(String t)
{
  typ=t;
}
public String get_typ()
{
  return typ;
}

}

class cho extends sweets
{

public void display()
{
 System.out.println("Weight: "+ this.getw());
 System.out.println("Price: "+this.getp()); 
 System.out.println("type: "+this.get_typ());
}

}
class candy extends sweets
{
public void display()
{
 System.out.println("Weight: "+ this.getw());
 System.out.println("Price: "+this.getp()); 
 System.out.println("type: "+this.get_typ());
}
}

class Main
{

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    //For Chocolates
    System.out.println("Enter chocolate details:");
    cho obj=new cho();
    System.out.println("Enter chocolate wt:");
    double wi=sc.nextDouble();
    System.out.println("Enter chocolate price:");
    double pp=sc.nextDouble();
    System.out.println("Enter chocolate type:");
    String type=sc.next();
    obj.setw(wi);
    obj.setp(pp);
    obj.set_typ(type);
    obj.display();

    //For Candies
    System.out.println("Enter candiesdetails:");
    candy obj2=new candy();
    System.out.println("Enter candies wt:");
    wi=sc.nextDouble();
    System.out.println("Enter candies price:");
    pp=sc.nextDouble();
    System.out.println("Enter candies type:");
    type=sc.next();
    obj2.setw(wi);
    obj2.setp(pp);
    obj2.set_typ(type);
    obj2.display();


}

}