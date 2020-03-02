import java.util.*;
class Scan
{
 public static void main(String args[])
 {
  Scanner Sc = new Scanner(System.in);
  System.out.println("Enter Employee ID, Name, Gender & Salary :");
  int Eid = Sc.nextInt();
  String EName = Sc.next();
  String Egen = Sc.next();
  float Esal = Sc.nextFloat();
  System.out.println("Employee Id :"+Eid+"\nEmployee Name :"+EName+"\nEmployee Gender :"+Egen+"\nEmployee Salary :"+Esal);
 }
}
