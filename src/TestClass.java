import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bufferedReader.readLine());

        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = Integer.valueOf(bufferedReader.readLine());
        }
        for (int i = n - 1; i > -1; i--) {
            System.out.println(digits[i]);
        }

    }
}
