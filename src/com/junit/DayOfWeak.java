package com.junit;
import java.util.Scanner;

public class DayOfWeak {
	
	static void dayweek(int d, int m, int y) {
		int y1=y-(14-m)/12;
		int x=y1+(y1/4)-(y1/100)+(y1/400);
		int m1=m+12*((14-m)/12)-2;
		int d1=((d+x+(31*m1)/12)%7);
		System.out.println(d1);
		switch (d1) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Some Thing went wrong");
			}

		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date");
		int d =sc.nextInt();
		System.out.println("Enter the month");
	    int m =sc.nextInt();
		System.out.println("Enter the year");
	    int y =sc.nextInt();
		dayweek(d,m,y);
		
	}
}

