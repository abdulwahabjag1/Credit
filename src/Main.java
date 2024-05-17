import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, enter a credit card number: ");
        Scanner input = new Scanner(System.in);
        System.out.println(Credit.findDigits(input.nextLong()) + " digits");
    }
}