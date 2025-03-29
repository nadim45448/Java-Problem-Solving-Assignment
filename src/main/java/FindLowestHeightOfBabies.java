import java.util.Scanner;

public class FindLowestHeightOfBabies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] heights = new int[10];
        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i<10; i++){
            heights[i] = input.nextInt();
        }
        int lowest = heights[0];
        int secondLowest = heights[0];
        for (int height : heights){
            if(height < lowest){
                secondLowest = lowest;
                lowest = height;
            } else if (height < secondLowest && height != lowest) {
                secondLowest=height;

            }
        }
        System.out.println("The two lowest heights of babies are: "+lowest +" and " + secondLowest);
    }
}
