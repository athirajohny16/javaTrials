
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> normalMethod = usingNormalForLoop(numbers);
        System.out.println("Result using normal method : " + normalMethod);

        List<Integer> java8Method = usingJava8(numbers);
        System.out.println("Result using java 8 : " + java8Method);

    }

    private static List<Integer> usingNormalForLoop(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }

        return result;
    }

    private static List<Integer> usingJava8(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> (n % 2 == 0))
                .collect(Collectors.toList());
    }

}
