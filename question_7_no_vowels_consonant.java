package assignment_3;

public class question_7_no_vowels_consonant {
	
	public static void vowelConsoCount(String s1)
	{
		
		int vCount=0;   
		int cCount = 0;
		s1 = s1.toLowerCase();   //convert to lowerCase to easily compare
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' )
			{
				vCount++;
			}
			else if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				cCount++;
			}
		}
		System.out.println("The length of the string is " + s1.length());
		System.out.println("Vowels = " + vCount + "\nConsonant = " + cCount);
	}

	public static void main(String[] args) {
		String s1 = "My name is Divya Prakash. I am a java developer.";
		vowelConsoCount(s1);

		
	}

}
