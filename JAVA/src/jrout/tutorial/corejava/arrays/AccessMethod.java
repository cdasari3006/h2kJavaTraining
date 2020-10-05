package jrout.tutorial.corejava.arrays;

public class AccessMethod {

	public static void main(String[] args) {
		System.out.println(printMe("Jayram") + " your Sum is "+ add(3,4));
	}
	
	/*public static void printMe(String name){
		System.out.println("Hello "+ name);
	}*/
	
	public static String printMe(String name){
		return ("Hello "+ name);
	}
	public static int add(int a, int b){
		return a + b;
	}
	
	// Hello Jayram your sum is 7
	
	
}
