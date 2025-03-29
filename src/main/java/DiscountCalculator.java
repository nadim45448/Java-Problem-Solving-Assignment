import java.util.Arrays;

public class DiscountCalculator {
    public static void main(String[] args) {
        String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = str.split(" ");

        double laptopPrice = Double.parseDouble(arr[1]);
        double mousePrice = Double.parseDouble(arr[2]);
        double mouseQuantity = Double.parseDouble(arr[3]);
        double discountPercentage = Double.parseDouble(arr[4]);

        double beforeDiscountPrice = laptopPrice + (mousePrice * mouseQuantity);
        double discount = beforeDiscountPrice * (discountPercentage / 100);
        double finalPrice = beforeDiscountPrice - discount;

        System.out.println("Laptop price: " + laptopPrice + " tk");
        System.out.println("Mouse price: " + mousePrice + " tk");
        System.out.println("Mouse quantity: "+ mouseQuantity);
        System.out.println("Total price before discount: " + beforeDiscountPrice + " tk");
        System.out.println("Discount amount (" + discountPercentage + "%): " + discount + " tk");
        System.out.println("Final price after discount: " + finalPrice + " tk");






    }

}
