import java.util.Random;

public class GenerateRandomPassword {
    public static void main(String[] args) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digit = "0123456789";
        String specialChars = "!@#$%^&*()_+[]{}|;:,.<>?";
        String allChars = uppercase + lowerCase + digit + specialChars;

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        password.append(uppercase.charAt(random.nextInt(uppercase.length())));
        password.append(lowerCase.charAt(random.nextInt(password.length())));
        password.append(digit.charAt(random.nextInt(digit.length())));
        password.append(specialChars.charAt(random.nextInt(specialChars.length())));

        for (int i = 4; i<8; i++){
            password.append(allChars.charAt(random.nextInt(allChars.length())));

        }
        // shuffle
        for (int i = 0; i<password.length(); i++){
            int index = random.nextInt(password.length());
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(index));
            password.setCharAt(index, temp);


        }
        System.out.println("Generated password: "+ password.toString());



    }
}
