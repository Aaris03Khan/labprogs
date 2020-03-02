class Stringpalin
{
 public static void main(String args[])
 {
  String S1 = "java is";
  String S2 = new String("Good");
  char a[] = {'s','u','n','m','i','c','r','o','s'};
  String S3 = new String(a);
  System.out.println(S1);
  System.out.println(S2);
  System.out.println(S3);
  System.out.println("S1 and S2 joined = "+S1.concat(S2));
  System.out.println("length of S1 ="+S1.length());
  System.out.println(S1 +"from"+ S3);
  String p = S2.substring(0,4);
  String q = S3.substring(0,5);
  System.out.println("upper S1 ="+S1.toUpperCase());
  System.out.println("lower S1 ="+S1.toLowerCase());
 }
}
