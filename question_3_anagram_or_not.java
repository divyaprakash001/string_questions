package assignment_3;

import java.util.Arrays;

public class question_3_anagram_or_not {
	static void isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean check = true;  
        if (s1.length() != s2.length()) {  
            check = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            check = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (check) {  
            System.out.println("Yes, " + s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println("Sorry, " + s1 + " and " + s2 + " are not anagrams");  
        }  
    } 

	public static void main(String[] args) {
//		question 3. anagram or not
		 isAnagram("Race", "Care");  
	        isAnagram("Internship", "Inter"); 

	}

}
