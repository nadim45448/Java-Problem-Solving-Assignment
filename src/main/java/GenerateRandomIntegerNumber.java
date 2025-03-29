import java.util.Arrays;
import java.util.Random;

public class GenerateRandomIntegerNumber {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i =0; i<10; i++){
            arr[i]= random.nextInt(1,100);
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            else if (arr[i]<min) {
                min = arr[i];

            }
        }
        System.out.print("Generated random array of 10 integers: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);


    }
}
