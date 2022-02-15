package Q18MethodInheritance;

public class SubClass extends SuperClass{
	
	public SubClass() {
		
	}
	@Override
	public boolean checkUppercase(String input) {
		//changing input string to char array
		
		char[] charArr = input.toCharArray();
		for(char c : charArr) {
			if(Character.isUpperCase(c))
				return true;
		}
		return false;
		
	}

	@Override
	public String convertLowerToUpper(String input) {
		String output = input.toUpperCase();
		return output;
	}

	@Override
	public int convertStringToInt(String input) {
		int output = Integer.parseInt(input);
		// This takes a string and parses it into an integer
		output += 10;
		return output;
		
	}
}
