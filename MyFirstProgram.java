import java.util.Scanner;
public class MyFirstProgram
{
  public static void main(String[] args) 
  {
    System.out.print("Hello World!");
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first integer: ");
    int first;
    first = input.nextInt();
    System.out.print("Enter second integer: ");
    int second = input.nextInt();
    double a = 5;
    //a++;
    int sum = first + second;
    System.out.printf("Sum is %d\n" , sum);
    
 // System.out.println(Math.abs(a));
  //String word = "Java";
 // System.out.print( word.charAt(1) );
 // System.out.print( a * 0);
      //float taxRate = 0.05;
      System.out.print((double) 3 / 2);
      

 }
}