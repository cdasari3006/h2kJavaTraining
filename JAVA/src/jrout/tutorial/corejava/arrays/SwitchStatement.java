package jrout.tutorial.corejava.arrays;

public class SwitchStatement {

	public static void main(String[] args) {
		int months[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		switchStatment(months);
	}
	
	public static void switchStatment(int array[]) {
		for(int val : array) {
			switch (val) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Feb");
				break;
			case 3:
				System.out.println("Mar");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			default:
				System.out.println("Don't Know");
				break;
			}
		}
	}
	public static void ifElseStatment(int array[]) {
		for(int val : array) {
			if(val == 1) { 
				System.out.println("January");
			}else if(val == 2) {
				System.out.println("Feb");
			}else if(val == 3) { 
				System.out.println("March");
			}else if(val == 4) {
				System.out.println("April");
			}else if(val == 5) { 
				System.out.println("May");
			}else{
				System.out.println("Don't Know");
			}
		}
	}
	
}
