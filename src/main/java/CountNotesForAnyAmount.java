import java.util.Scanner;

public class CountNotesForAnyAmount {
    public static void main(String[] args) {

        int [] notes={1000,500,200,100,50,20,10,5,2,1};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = input.nextInt();
        for (int note : notes){
            if(amount>=note){
                int count = amount/note;
                System.out.println(note + " "+ count);
                amount-=count*note;
            }
        }
    }
}
