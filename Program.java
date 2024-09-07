import java.util.Scanner;


//Your code here
public class Program8{ 
     
    public static void main(String[] args) { 
     Scanner scanner = new Scanner(System.in); 
        
    //Declare veriages 
    
    
    //Reading the variables 
    System.out.println("Enter number 1: ");
    int number1 = scanner.nextInt();
    System.out.println("Enter number 2: ");
    int number2 = scanner.nextInt();
    
     System.out.println("Original numbers are " + number1 + " and " + number2);
    
    
    // Calculate the numbers
    int sum = number1 + number2;
    System.out.println("Sum = " + sum);
    
    int difference = number1 - number2 ;
    
    System.out.println("Difference = " + difference);
    
    int product = number1  * number2;
    
    System.out.println("Product = " + product);
    
    double average = (number1 + number2)/2.0;
    
    System.out.println("Average = " + average);
    
    int absolute = Math.abs(difference);
    
    System.out.println("Absolute value = " + absolute);
    
    int max = 0;
    int min = 0;
    
    if(number1 > number2)
    {
        max = number1;
        min = number2;
    }
    else
    {
        max = number2;
        min = number1;
    }
    
    System.out.println("Maximum = " + max);
    
    System.out.println("Minimum = " + min);
    
  }
}
//Paste console output below:
/*


*/
