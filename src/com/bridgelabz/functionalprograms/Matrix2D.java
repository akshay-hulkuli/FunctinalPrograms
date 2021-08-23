package com.bridgelabz.functionalprograms;

import java.util.*;
import java.io.*;

public class Matrix2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1:Integer matrix 2:Double matrix 3:Boolean matrix ");
		int option = sc.nextInt();
		System.out.println("Enter number of rows and columns");
		int m = sc.nextInt();
		int n= sc.nextInt();
		switch(option) {
			case 1 : 
				int[][] array1 = new int[m][n];
				System.out.println("Pls enter the elements");
				for(int i=0; i< m;i++) {
					for(int j =0; j< n;j++) {
						array1[i][j]= sc.nextInt();
					}
				}
				System.out.println("array elements are");
				for(int i=0; i< m;i++) {
					for(int j =0; j< n;j++) {
						System.out.print(array1[i][j]+" ");
					}
					System.out.println();
				}
				break;
			case 2:
				double[][] array2 = new double[m][n];
				System.out.println("Pls enter the elements");
				for(int i=0; i< m;i++) {
					for(int j =0; j< n;j++) {
						array2[i][j]= sc.nextDouble();
					}
				}
				System.out.println("array elements are");
				for(int i=0; i< m;i++) {
					for(int j =0; j< n;j++) {
						System.out.print(array2[i][j]+" ");
					}
					System.out.println();
				}
				break;
			case 3:
				boolean[][] array3 = new boolean[m][n];
				System.out.println("Pls enter the elements");
				for(int i=0; i< m;i++) {
					for(int j =0; j< n;j++) {
						array3[i][j]= sc.nextBoolean();
					}
				}
				System.out.println("array elements are");
				for(int i=0; i< m;i++) {
					for(int j =0; j< n;j++) {
						System.out.print(array3[i][j]+" ");
					}
					System.out.println();
				}
		}

	}

}
