package com.junit;
import java.util.Scanner;

public class TempConversion {
	public static void main(String[] args) {
		tempratureConverter();
	}
	public static void tempratureConverter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which Operation you want to perform");
		System.out.println("1.Celsius to Fahrenheit");
		System.out.println("2.Fahrenheit to Celsius");
		int num=sc.nextInt();
		switch (num) {
			case 1:
				System.out.println("Enter the celsious : ");
				double celsious=sc.nextDouble();
				double fahrenheit=((celsious * 9/5) +32);
				System.out.println("Fahrenheit teamprature is " +fahrenheit);
				break;
			case 2:
				System.out.println("Enter the Fahrenheit : ");
				double Fahrenheit=sc.nextDouble();
                double celcius=((Fahrenheit-32)*5/9);        
                System.out.println("Celcius Teamprature is " +celcius);
				break;
			default:
				System.out.println("Only two operations");
				System.out.println("So please enter 1 or 2");
		}
	}
}


