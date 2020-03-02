class Super
{
 public static void main(String args[])
 {
  Two t = new Two();
  t.show();
 }
}
class One
{
 int i=10;
 void show()
 {
  System.out.println("Super class variable i: "+i);
 }
}
class Two
{ 
 int i=20;
 void show()
 {
  System.out.println("derived class variable i:"+i);
 }
}
