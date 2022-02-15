package Q18MethodInheritance;

public class Main extends SubClass{

	public static void main(String[] args){
		
		SubClass test = new SubClass();
		
		System.out.println(test.checkUppercase("Hello"));
		System.out.println(test.convertLowerToUpper("thisisaTest"));
		System.out.println(test.convertStringToInt("24"));

	}
	

	

}
