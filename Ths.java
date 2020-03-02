class Ths
{
 public static void main(String args[])
 {
  Person p = new Person("Aaris",18);
  p.talk();
 }
}
class Person
{
 String name;
 int age;
 Person(String name,int age)
 {
  this.name = name;
  this.age = age;
 }
 void talk()
 {
  System.out.println("name: "+name);
  System.out.println("age: "+age);
 }
}
