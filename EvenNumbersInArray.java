import java.util.Arrays;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {67,388,83,38,29,30,27};

        //if needed to add even numbers to seperate array
        int[] even = new int[arr.length];
        int index = 0;
     

        for(int n : arr){
            if(n % 2 == 0){
                System.out.println(n + " is an even number");
                
                //if needed to add even numbers to seperate array
                even[index] = n;
                index ++;
            }
        }

        System.out.println("Array with only even numbers : " + Arrays.toString(even));
    }
}
