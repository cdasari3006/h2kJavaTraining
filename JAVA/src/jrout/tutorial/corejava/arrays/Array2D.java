package jrout.tutorial.corejava.arrays;

public class Array2D {

	public static void main(String[] args) {
		String age = "34";
		
		String personDetails[][] = {{"Rohan","23","6"},{"Daniel","25","5"},{"Raj","20","4"}};
		
		// Rohan : 23 : 6
		// Daniel : 25 : 5
		// Raj : 20 : 4
		
		int myAge = Integer.parseInt(age);
		
		int rohanDetail[] = {23,6};
		int danialDetail[] = {25,5};
		int rajDetail[] = {20,4};
		
		int studentDetails[][] = {rohanDetail, danialDetail, {20,4}};
		// Age = 23 , Height = 6
		// Age = 25 , Height = 5
		// Age = 20 , Height = 4
		
		System.out.println("rohan Age"+rohanDetail[0]);
		
		System.out.println("danial's Height "+danialDetail[1]);
		System.out.println(" studentDetails[1][1] Age "+studentDetails[1][1]);
//		System.out.println(myAge);
//		
//		int ages[] = {12,45,67};
		
		
		
	}
}
