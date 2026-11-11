public class LargestNumberInArray{

    public static void main(String[] args) {
        
          int[] arr = {67,92,12,78,35,83};
          int max = arr[0];

          for(int n : arr){
            if(n > max){
                max = n;
            }
          }

          System.out.println("Largest number in the array is : "+max);
    }
}