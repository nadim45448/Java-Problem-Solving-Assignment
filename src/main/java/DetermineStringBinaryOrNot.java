import java.util.Scanner;

public class DetermineStringBinaryOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String st = input.nextLine();
        boolean flag = false;

        for (char ch : st.toCharArray()){
            if(ch != '0' && ch != '1' ){
                flag=false;
                break;
            }
            else {
                flag = true;
            }
        }
        System.out.println("Output: "+ flag);
    }
}
