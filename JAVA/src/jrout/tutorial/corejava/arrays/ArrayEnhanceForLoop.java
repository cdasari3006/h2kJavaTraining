package jrout.tutorial.corejava.arrays;

public class ArrayEnhanceForLoop {

	public static void main(String[] args) {
		int somethings[] = {3,4,5,7,5,6,7,8,9,90};
		
//		loopThruArrays(somethings);
		enhancedForLoop(somethings);
		
	}
	
	public static void enhancedForLoop(int array[]) {
		int index = 0;
		for(int val : array){
			System.out.println(val);
		}
	}
	
	public static void loopThruArrays(int array[]) {
		System.out.println("Lenght of Array = "+ array.length);
		for(int i = 0; i < array.length; i++){
			if(array[i] == 8){
				break;
			}
			System.out.println("index ["+ i +"] = "+array[i]);
		}
	}
}
