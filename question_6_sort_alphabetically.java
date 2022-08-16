package assignment_3;

import java.util.Arrays;

public class question_6_sort_alphabetically {
	public static void alphaSort(String s1)
	{
		char []arr = s1.toCharArray();
        int swap;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (char) swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		

		alphaSort("iNeuron");
		
		

	}

}
