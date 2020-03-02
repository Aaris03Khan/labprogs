import java.io.*;
class Employee
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter Employee ID : ");
  int id = Integer.parseInt(br.readLine());
  System.out.print("Enter Employee Name : ");
  String name = br.readLine();
  System.out.print("Enter Employee Gender : ");
  String gend = br.readLine();
  System.out.print("Enter Employee Salary: ");
  float sal = Float.parseFloat(br.readLine());
  System.out.println("Employee ID : "+id);
  System.out.println("Employee Name : "+name);
  System.out.println("Employee Gender : "+gend);
  System.out.println("Employee Salary : "+sal);
 }
}
