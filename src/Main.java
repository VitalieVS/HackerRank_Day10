import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder toBinary(Long n) {
        StringBuilder result = new StringBuilder();
        Long currNumber = n;

        while (currNumber != 0) {
            result.append(currNumber % 2);
            currNumber /= 2;
        }
        return result.reverse();
    }

    private static int consecutiveOneCount(StringBuilder binaryString) {
        String[] result = binaryString.toString().split("0");
        int max = result[0].length();

        for (String elem : result) {
            if (elem.length() > max) max = elem.length();
        }

        return max;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Long n = Long.parseLong(br.readLine());
            System.out.print(consecutiveOneCount(toBinary(n)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
