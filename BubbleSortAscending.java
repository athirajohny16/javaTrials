
import java.util.Arrays;
import java.util.List;

/*Bubble Sort compares two adjacent elements and swaps them if they are in the wrong order.
here we have 2 loops i & j
i - outer loops, controls how many passes are performed.
j- inner loop - compares two adjacent element
swapping logic used - 
int temp = a;
a = b;
b = temp;
 */
public class BubbleSortAscending {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(78, 38, 12, 48, 204, 248, 32, 45, 566, 85, 35);

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        System.out.println(numbers);
    }
}
