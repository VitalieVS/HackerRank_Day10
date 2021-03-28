import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 5 -> 101

public class Main {

    private static StringBuilder toBinary(int n) {
        StringBuilder result = new StringBuilder();
        int currNumber = n;

        while (currNumber != 0) {
            result.append(currNumber % 2);
            currNumber /= 2;
        }
        return result.reverse();
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            System.out.print(toBinary(n));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
