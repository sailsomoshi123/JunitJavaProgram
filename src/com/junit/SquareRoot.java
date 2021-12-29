package com.junit;
import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number");
	      double number = sc.nextDouble();
	      double sum=squareoot(number);
	      System.out.println(sum);
	}
	static double squareoot(double c) {
	       double epsilon = 1e-15;
	       double t = c;
	       while (Math.abs(t - c / t) > epsilon * t) {
	    	   t = (c / t + t) / 2.0;
	       }
		return t;
	 }
}


