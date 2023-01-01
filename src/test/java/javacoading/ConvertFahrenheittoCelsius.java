package javacoading;

import java.util.Scanner;

public class ConvertFahrenheittoCelsius {


private static Scanner in;

public static void main(String[] args) {
float temperatue;
in = new Scanner(System.in);

System.out.println("Enter temperatue in Fahrenheit"); temperatue = in.nextInt();

temperatue = ((temperatue - 32)*5)/9;

System.out.println("Temperatue in Celsius = " + temperatue);
		}
		}

	
	
