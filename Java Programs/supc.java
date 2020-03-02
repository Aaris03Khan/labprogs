class one
{
 int i;
 one(int i)
 {
  this.i=i;
 }
}
class Two
{
 int i;
 Two(int a,int b)
 {
  super(a);
  i=b;
 }
 void show()
 {
  System.out.println("Super class variable i:"+super.i);
  System.out.println("derived class variable i:"+i);
 }
}
class Supc
{
 public static void main(String args[])
 {
  Two t=new Two(5,4);
  t.show();
 }
}
