class Mythread  extends Thread 
{
 public void run()
 {
  for(int i=1;i<=10;i++)
   System.out.println("i:"+i);
 }
 }
class Demo3
{ 
 public static void main(String args[])
 {
  Mythread mt=new Mythread();
  Thread t=new Thread(mt,"Aaris");
  t.start();
 }
}
