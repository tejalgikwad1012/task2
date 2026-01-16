package tejal;
import java.util.*;
public class task2 
{

	    public static void main(String[] args) 
	    {
	        // Declare primitive data types and explain memory usage
	        byte byteVar = 10; // 1 byte
	        short shortVar = 100; // 2 bytes
	        int intVar = 1000; // 4 bytes
	        long longVar = 10000L; // 8 bytes
	        float floatVar = 10.5f; // 4 bytes
	        double doubleVar = 100.5; // 8 bytes
	        char charVar = 'A'; // 2 bytes
	        boolean boolVar = true; // 1 byte

	        System.out.println("Primitive Data Types and Memory Usage:");
	        System.out.println("byte (1 byte): " + byteVar);
	        System.out.println("short (2 bytes): " + shortVar);
	        System.out.println("int (4 bytes): " + intVar);
	        System.out.println("long (8 bytes): " + longVar);
	        System.out.println("float (4 bytes): " + floatVar);
	        System.out.println("double (8 bytes): " + doubleVar);
	        System.out.println("char (2 bytes): " + charVar);
	        System.out.println("boolean (1 byte): " + boolVar);

	        // Use Scanner to accept multiple types of user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("\nEnter an integer:");
	        int userInt = scanner.nextInt();
	        System.out.println("Enter a float:");
	        float userFloat = scanner.nextFloat();
	        System.out.println("Enter a string:");
	        scanner.nextLine(); // Consume newline
	        String userString = scanner.nextLine();

	        // Implement basic arithmetic operations
	        int sum = userInt + (int) userFloat; // Type casting
	        System.out.println("\nSum of integer and float (type casted): " + sum);

	        // Demonstrate type casting between compatible and incompatible types
	        double doubleResult = (double) userInt; // Compatible
	        try
	        {
	            char charResult = (char) userInt; // Incompatible, but allowed with explicit cast
	            System.out.println("Integer to char cast: " + charResult);
	        } catch (Exception e)
	        {
	            System.out.println("Error in type casting.");
	        }

	        // Handle invalid input gracefully
	        try
	        {
	            System.out.println("\nEnter another integer:");
	            int invalidInput = scanner.nextInt();
	        } catch (Exception e) 
	        {
	            System.out.println("Invalid input! Please enter a valid integer.");
	            scanner.next(); // Clear invalid input
	        }

	        // Print formatted output
	        System.out.printf("\nFormatted output: User input integer = %d, float = %.2f, string = %s\n", userInt, userFloat, userString);

	        // Show difference between local, instance, and static variables
	        LocalVariableDemo localDemo = new LocalVariableDemo();
	        localDemo.showLocalVariable();
	        System.out.println("Instance variable: " + localDemo.instanceVar);
	        System.out.println("Static variable: " + StaticVariableDemo.staticVar);
	    }
}

	class LocalVariableDemo
	{
	    int instanceVar = 100; // Instance variable

	    void showLocalVariable() 
	    {
	        int localVar = 50; // Local variable
	        System.out.println("Local variable: " + localVar);
	    }
	}

	class StaticVariableDemo 
	   {
	    static int staticVar = 200; // Static variable
	   }
