class StrDemo
{
 public static void main(String args[])
 {
  String S1 = "a program in java";
  String S2 = new String("I love it");
  char arr[]= {'A','A','R','I','S'};
  String S3 = new String(arr);
  System.out.println(S1);
  System.out.println(S2);
  System.out.println(S3);
  System.out.println("S1 and S2 joined ="+S1.concat(S2));
  System.out.println("length of S1 ="+S1.length());
  System.out.println(S1+"from"+S3);
  String p=S2.substring(0,7);
  String q=S3.substring(0,5);
  System.out.println(p+q);
  System.out.println("Upper S1 ="+S1.toUpperCase());
  System.out.println("Lower S1 ="+S1.toLowerCase());
 }
}
  
  

