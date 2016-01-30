package jrout.tutorial.corejava.arrays;

public class ArrayWhileDoWhile {

	public static void main(String[] args) {
		int somethings[] = {3,4,5,7,5,6,7,8,9,90};
		whileLoop(somethings);
	}
	
	public static void whileLoop(int array[]) {
		
		int i = 0;
		boolean isTrue = true;
		
		while(i < array.length){
			System.out.println(array[i]);
			i++;
		}
	}
	
	public static void doWhileLoop(int array[]) {
		int i = 0;
		do {
			System.out.println(array[i]);
			i++;
		} while (i < array.length);
	}
	
	public static void enhancedForLoop(int array[]) {
		int index = 0;
		for(int val : array) {
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
	
	public static void infiniteLoop(){
		/*while(true){
			System.out.println("77777");
		}*/
		
		for(;;){
			break;
		}
		
	}
}
