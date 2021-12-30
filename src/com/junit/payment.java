package com.junit;
import java.util.Scanner;

public class payment {
	public static void payment(double Y,double P,double R) {
		double n = 12 * Y;
		double r = R / 12*100;
		double payment =(P*r)/(1-Math.pow(1+r,-n));
		System.out.println("Monthly payment is :" +Math.round(payment));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to pay-off : ");
		double Y = sc.nextDouble();
		System.out.println("Enter a principle loan amount: ");
		double P = sc.nextDouble();
		System.out.println("Enter a percentage of interest: ");
		double R =  sc.nextDouble();
		payment(Y,P,R);
	}
}
