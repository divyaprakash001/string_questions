public class print_repeated_characters_in_string_5 {
    public static void main(String[] args) {
        String arr1 = "iNeuron Assignment to print repeated character";
        int count;
        
        char arr[] = arr1.toCharArray();

        System.out.println("Duplicate characters in a given arr: ");

        for(int i = 0; i <arr.length; i++) {
            count = 1;
            for(int j = i+1; j <arr.length; j++) {
                if(arr[i] == arr[j] && arr[i] != ' ') {
                    count++;
                    arr[j] = '0';
                }
            }
            if(count > 1 && arr[i] != '0')
                System.out.println(arr[i]);
        }
    }
}
