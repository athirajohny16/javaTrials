

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(78,38,12,48,204,248,32,45,566,85,35);

        List<Integer> ascSortingWithJava8 = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Ascending sorting using java 8 : " + ascSortingWithJava8);

        List<Integer> descSortingWithJava8 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Descending sorting using java 8 : " + descSortingWithJava8);


    }

    
}
