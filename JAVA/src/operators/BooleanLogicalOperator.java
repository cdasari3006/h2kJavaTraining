package operators;

public class BooleanLogicalOperator {

	// Ctrl + shift + R : to open a file
	public static void main(String[] args) {
		int rajuAge = 50;
		int rajuHeight = 6;
		// raju age shud > rohanAge and rajuH < rohanH and sum of rajH and rohanH shud be greather than 10
		// I am very happy
		
		int rohanAge = 40;
		int rohanHeight = 7;
		
		
		if((rohanHeight > rajuHeight++) & (rajuAge == rohanAge)){
			System.out.println("I feel happy");
		}
		
		System.out.println("Rohan Height ="+ rajuHeight);
		
		
		/*if((rajuAge > rohanAge) && (rohanHeight > rajuHeight)){
			System.out.println("I feel happy");
			if((rohanHeight == rajuHeight)){
				System.out.println("Heights are same");
			}
		}else {
			System.out.println("Not Happy");
		}*/
		
		/*if((rajuAge > rohanAge) || (rohanHeight < rajuHeight)){
			System.out.println("I feel happy");
			if((rohanHeight == rajuHeight)){
				System.out.println("Heights are same");
			}
		}else {
			System.out.println("Not Happy");
		}*/
	}

}
