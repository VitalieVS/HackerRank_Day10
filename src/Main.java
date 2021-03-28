import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    private static int consecutiveOneCount(StringBuilder binaryString) {
      int max = 0;
      int count = 0;
         for (int i = 0; i < binaryString.length(); i++) {
             if (binaryString.charAt(i) == '1') {
                 count++;
             } else {
                 if (count > max) {
                     max = count;
                     count = 0;
                 }
             }
         }

         return max;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            System.out.print(consecutiveOneCount(toBinary(n)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
