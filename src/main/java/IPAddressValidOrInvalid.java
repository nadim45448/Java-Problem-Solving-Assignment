import java.util.Scanner;

public class IPAddressValidOrInvalid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String ip = input.nextLine();

        String[] parts = ip.split("\\.");
        if (parts.length == 4 && !parts[0].equals("0") && parts[0].length()>1){
            System.out.println("Output: Valid IP");
        }
        else {
            System.out.println("Output: Invalid IP");
        }
    }
}
