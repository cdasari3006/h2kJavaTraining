package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		String course = args[0];
		boolean isJavaCourse = (course.equals("Java"));
		
		/*if(isJavaCourse){
			System.out.println("This is java course");
			System.out.println("This is java course");
		}else{
			System.out.println("This is something else.");
		}*/
		String message = isJavaCourse ? "This is java course" : "This is something else.";
		System.out.println(message);
	}

}
