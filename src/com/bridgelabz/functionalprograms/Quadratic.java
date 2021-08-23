package com.bridgelabz.functionalprograms;

import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0,b=0,c=0;
		System.out.println("Enter the value of a b and c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int delta = b*b - 4*a*c;
		if(delta < 0) {
			System.out.println("Roots are not real"); 
			return;
		}
		double root1 = (-b+Math.sqrt(delta))/(2*a);
		double root2 = (-b-Math.sqrt(delta))/(2*a);
		System.out.println("root1 : "+root1+" root2 : "+root2);

	}

}
