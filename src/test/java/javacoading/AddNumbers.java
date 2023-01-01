package javacoading;
import java.math.BigInteger;
import java.util.Scanner;
class AddNumbers{
private static Scanner in;

public static void main(String[] arguments) {
int number1,number2,sum;
	in = new Scanner(System.in);
	System.out.println("this is first number ");
number1 =in.nextInt();
System.out.println("this is second number ");
number2 =in.nextInt();



sum = number1+number2;

System.out.println("Result of addition = " + sum);
}
 

}