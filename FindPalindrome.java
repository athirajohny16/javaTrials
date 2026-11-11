import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPalindrome {
    public static void main(String[] args){

        List<String> names = Arrays.asList("madam", "athira", "banana", "lulul");

        List<String> palindrome = checkPalindrome(names);

        System.out.println(palindrome);

    }

    public static List<String> checkPalindrome(List<String> names){
        return names.stream()
                .filter(str -> str.equals(new StringBuilder(str).reverse().toString()))
                .collect(Collectors.toList());
    }
    
}
