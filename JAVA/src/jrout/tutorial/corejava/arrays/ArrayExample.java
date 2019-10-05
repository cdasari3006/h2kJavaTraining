package jrout.tutorial.corejava.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int age1 = 34;
		int age2 = 45;
		int age3 = 56;
		
		int ages[] = {age1,age2,age3};
		
//		System.out.println(ages.length);
		
//		System.out.println(ages[0]);
		
//		System.out.println(ages[0] + "  " + ages[1] +" "+ ages[2]);
		
		int heights[] = {4,7,8};
		int somethings[] = {3,4,5,7,5,6,7,8,9,90};
/*		System.out.println(heights[2]);
		heights[3] = 4;  // Run this program...
		System.out.println(heights[2]);
*/		
//		printFirstThreeIndexes(heights);
//		printFirstThreeIndexes(somethings);
		loopThruArrays(heights);
		loopThruArrays(somethings);
		
		boolean has7 = has7Init(somethings);
	}
	
	public static void loopThruArrays(int array[]){
		System.out.println("Lenght of Array = "+ array.length);
		for(int i = 0; i < array.length; i++){
			if(array[i] == 8){
				break;
			}
			System.out.println("index ["+ i +"] = "+array[i]);
		}
	}
	
	public static void printFirstThreeIndexes(int array[]){
		System.out.println(" length = "+array.length);
		System.out.println("First value =" + array[0]);
		System.out.println("Second value =" + array[1]);
		System.out.println("Third value =" + array[2]);
	}
	
	public static boolean has7Init(int array[]){
		
		return true;
	}
}
