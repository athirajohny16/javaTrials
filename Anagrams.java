
import java.util.Arrays;
import java.util.Scanner;

//write a program to check whether two strings are anagrams or not

/*solution:Anagrams are two strings that contain the same letters,the same number of times, but in a different order. For example,
EAT AND TEA, SILENT AND LISTEN.
step 1 : check the length of both strings, if they are not equal then they are not anagrams.
Step 2 : if length matches, arrange the letters in alpahetical order. eg. EAT AND TEA, -> AET AND AET
Step 3: What if the legth is same but the letters are not same, then they are not anagrams. eg. EAT AND TEE, -> AET AND EET
*/ 

public class Anagrams{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        boolean result = checkIfAnagram(str1,str2);
        if(result){
            System.out.println("Given strings are anagrams");
        }else{
            System.out.println("Given strings are not anagrams.");
        }

        }
    }

    private static  boolean checkIfAnagram(String str1,String str2){
        //step 1 - compare length
        if(str1.length() != str2.length()){
            return false;
        }
        //step 2 - sort both arrays alphabetically
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //step 3 - compare both arrays
        return Arrays.equals(arr1, arr2);
    }
}