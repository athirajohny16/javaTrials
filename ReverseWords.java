import java.util.Arrays;
import java.util.Scanner;



public class ReverseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
  

        String reversed = reverseWords(s);
        System.out.println("Reversed string is : " + reversed);

        sc.close();
    }

    private  static String reverseWords(String s){

        String words[] = s.split(" ");
        System.out.println("words: " + Arrays.toString(words));

        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            System.out.println("i -"+ i + ", words: " + words[i] );
            result.append(words[i]).append(" ");
        }

        return result.toString();
    }
    
}
