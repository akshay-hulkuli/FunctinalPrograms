package com.bridgelabz.functionalprograms;

import java.util.*; 

public class ZeroSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Integers");
		int numberOfIntegers = sc.nextInt();
		int[] array = new int[numberOfIntegers];
		System.out.println("Enter the integers");
		for(int i=0;i< numberOfIntegers;i++) {
			array[i] = sc.nextInt();
		}
		int count = 0;
		ArrayList<ArrayList <Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<numberOfIntegers-2;i++) {
			for(int j=i+1;j<numberOfIntegers-1;j++) {
				for(int k=j+1;k<numberOfIntegers;k++) {
					if(array[i]+array[j]+array[k] == 0) {
						count++;
						ArrayList<Integer> triplet = new ArrayList<Integer>();
						triplet.add(array[i]);
						triplet.add(array[j]);
						triplet.add(array[k]);
						if(!list.contains(triplet)) list.add(triplet);
					}
				}
			}
		}
		
		System.out.println("the number of triplets found : "+ count);
		if(count >0) {
			System.out.println("The triplets are : ");
			for(int i=0;i<count;i++) System.out.println(list.get(i));
		}

	}

}
