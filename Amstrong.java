import java.math.*; 
class Amstrong
{
 public static void main(String args[])
  {
   int number = 5, sum = 0, rem = 0, cube = 0, temp;
   temp = number;
   while (number != 0)
    {
        rem = number % 10;
        cube = Math.pow(rem, 3);
        sum = sum + cube;
        number = number / 10;
    }
    if (sum == temp)
        System.out.println("The given no is armstrong no");
    else
        System.out.println("The given no is not a armstrong no");
  }
}
