package assignment_3;

public class question_8_count_special_characters {
// WAP to count number of special characters
//	methods
	public static void count(String s1)
	{
		int count = 0;
		for(int i=0; i<s1.length(); i++)
		{
			if((s1.charAt(i) >=32   && s1.charAt(i)<=47) ||
					(s1.charAt(i) >=58   && s1.charAt(i)<=64) || 
						(s1.charAt(i) >=123   && s1.charAt(i)<=126))  
			{
				count++;
			}
		}
		System.out.println("Special characters = " + count);
	}

	public static void main(String[] args) {
		
		String s1 =  "mynameisdivya@prakash.com";
		count(s1);
		
	}

}
