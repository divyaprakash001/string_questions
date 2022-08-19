package assignment_3;

public class question_4_pangram_or_not {

	public static void main(String[] args) {
		String str = "The best part of my life is i am keen to learning new technology.";
	      boolean[] listOfAlphabets = new boolean[str.length()];
	      int index = 0;
	      int mark = 1;
	      for (int i = 0; i < str.length(); i++) {
	         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
	            index = str.charAt(i) - 'A';
	         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	            index = str.charAt(i) - 'a';
	      }
	         listOfAlphabets[index] = true;
	   }
	   for (int i = 0; i <= 25; i++) {
	      if (listOfAlphabets[i] == false)
	      mark = 0;
	   }
	   System.out.print("String: " + str);
	   System.out.println();
	   if (mark == 1)
	      System.out.print("\nThe given string is a pangram.");
	   else
	      System.out.print("The given string is not a pangram.");
	   
	   
	   }
	
	}


