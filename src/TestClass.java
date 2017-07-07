import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] digits = new int[10];
        for (int i = 0; i < s.length(); i++) {
            digits[s.charAt(i) - 48]++;
        }
        for (int i = 0; i < digits.length; i++) {
            System.out.println(i + " " + digits[i]);
        }

    }
}
