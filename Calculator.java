import java.util.*;
import java.lang.*;
import java.io.*;
class Calculator
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two numbers");
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      System.out.println("Choose operation to be formed ");
      System.out.println("1.Addition");
      System.out.println("2.Multiplication");
      System.out.println("3.Subtraction");
      System.out.println("4.Division");
      int choice=sc.nextInt();
      switch(choice)
      {
          case 1: int k1=num1+num2;
                   System.out.println("Sum of "+num1+" and "+num2+" is "+k1);
                   break;
          case 2: int k2=num1-num2;
                   System.out.println("Difference of "+num1+" and "+num2+" is "+k2); 
                   break;
          case 3: int k3=num1*num2;
                   System.out.println("Product of "+num1+" and "+num2+" is "+k3); 
                   break; 
          case 4: int k4=num1/num2;
                   System.out.println("Division of "+num1+" and "+num2+" is "+k4);       
                   break;
          default:  System.out.println("No operation");
                     break;                           
      }
    }
}