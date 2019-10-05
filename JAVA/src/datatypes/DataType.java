package datatypes;
// Ctrl +shift + F : this is for formatting.
public class DataType {
	private int age = 90;
	
	public static void main(String[] args) {
		
		byte age1 = 50;
		byte age2 = 40;
		
		short age1Copy = age1;
//		System.out.println("age1Copy "+age1Copy);
		
		int height = 50;
		byte byteHeight = (byte)height;
		
		System.out.println(height); // 0050
		height = 78;
		System.out.println(height); // 0050
		
		float physicsMark = 45.5f;
		
		int phyCopyMark =  (int)physicsMark;
		// Type mismatch: cannot convert from float to int
//		physicsMark 45.5
	//	 phyCopyMark 45
		 
//		System.out.println("physicsMark "+physicsMark);
//		System.out.println(" phyCopyMark "+phyCopyMark);
		
		char male = 'm';
		char female = 'f';
//		System.out.println("hello");
		
//		System.out.println( age1+age2); // sysout
//		System.out.println("DataType.main()"); // systrace

		boolean isThisJavaCourse = true;
		
		String name = "R";
//		System.out.println(name);
	}
}
