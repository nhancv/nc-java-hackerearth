import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }
        for (int i = n - 1; i > -1; i--) {
            System.out.println(digits[i]);
        }

    }
}
