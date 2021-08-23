package com.bridgelabz.functionalprograms;

public class Distance {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		System.out.println("the point is:("+x+","+y+")");
		double distance = Math.sqrt((x*x)+(y*y));
		System.out.println("Distance from the origin is : "+distance);

	}

}
