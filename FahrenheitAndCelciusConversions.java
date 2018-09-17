//Program: Temperature Conversion  Program
//File: FahrenheitAndCelciusConversions.java
//Summary: Converts Fahrenheit to Celcius and then will convert Celcius to Fahrenheit
//Author: Brennan M. Schwamb
//Date: September 15, 2018

import java.util.Scanner;

public class FahrenheitAndCelciusConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	System.out.print("Enter a degree in Fahrenheit: ");
double fahrenheit = input.nextDouble();

//Convert Fahrenheit to Celsius
double ConvertedTemperature = (5.0/9) * (fahrenheit - 32);
System.out.println(fahrenheit + " Fahrenheit is " +
ConvertedTemperature + " in Celsius "); 

System.out.print("Enter a degree in Celsius: ");
double celsius = input.nextDouble();

//Convert Celsius to Fahrenheit
ConvertedTemperature = (celsius * 9/5) + 32;
System.out.println(celsius + " Celsius is " + 
ConvertedTemperature + " in Celsius ");
	
	}
}

