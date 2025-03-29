import java.util.Arrays;
import java.util.Scanner;

public class FindCGPAUsingBinarySearch {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpa);
        System.out.println(Arrays.toString(cgpa));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter CGPA: ");
        double targetCGPA = input.nextDouble();

        int low = 0;
        int high = cgpa.length - 1;
        boolean flag = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (cgpa[mid] == targetCGPA) {
                System.out.println("Input CGPA " + targetCGPA + " is present at index " + mid);
                flag = true;
                break;
            }
            else if (targetCGPA > cgpa[mid]) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        if (flag == false) {
            System.out.println("Input CGPA " + targetCGPA + " is not present in the array");
        }


    }
}
