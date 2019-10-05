package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		int rajuAge = 50;
		int rajuHeight = 6;
		// raju age shud > rohanAge and rajuH < rohanH and sum of rajH and rohanH shud be greather than 10
		// I am very happy
		
		int rohanAge = 40;
		int rohanHeight = 7;
		
		/*if((rajuAge > rohanAge) && (rohanHeight > rajuHeight)){
			System.out.println("I feel happy");
		}*/
		
		boolean isJava = true;
		
		System.out.println(" rajuAge != rohanAge "+ (rajuAge != rohanAge));
		System.out.println("rajuAge == rohanAge "+(rajuAge == rohanAge));
		
		System.out.println(" isJava "+isJava);
		
		boolean isSameAge = (rajuAge == rohanAge); // Shift + alt + R : Change Variable names
		System.out.println(isSameAge);
		
		if(isJava)
			System.out.println("We are in java session...");
		else
			System.out.println("We are in some other session");
		
		if(isSameAge) 
			System.out.println("Yes both are same");
		else
			System.out.println("Both are diferent");
		
		
		int totalAge = 0;
		
		if(isSameAge)
			totalAge = rajuAge + rohanAge;
		else
			totalAge = (rajuAge + rohanAge)/2;
		
		System.out.println("Total Age" + totalAge);
		
		
	}

}
