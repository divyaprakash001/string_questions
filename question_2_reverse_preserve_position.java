package assignment_3;

public class question_2_reverse_preserve_position {

	public static void main(String[] args) {
//		Question 2. WAP to reverse "Think Twice" to "Kniht eciwt"
		String s1 = "Think Twice";
		String s2 = "";
		
		String [] arr = s1.split(" ");
		
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=arr[0].length()-1; j>=0; j--)
			{
				s2 = s2 + arr[0].charAt(j);
			}
			for(int j=arr[1].length()-1; j>=0; j--)
			{ 
				s2 = s2 + arr[1].charAt(j);
			}
		}
		System.out.println(s1);
		System.out.println(s2);

	}

}
