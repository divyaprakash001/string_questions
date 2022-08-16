package assignment_3;

public class question_1_reverse {

	public static void main(String[] args) {
//		question 1. WAP to reverse a String(iNeuron)
		String input = "iNeuron";
		String output = "";
		
		for(int i=input.length()-1; i>=0; i--)
		{
			output = output + input.charAt(i);
		}
		System.out.println(input);
		System.out.println(output);

		

		

		
		
		
		
	}

}
