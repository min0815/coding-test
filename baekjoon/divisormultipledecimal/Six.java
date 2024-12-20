package divisormultipledecimal;

import java.io.*;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                n = n / i;
                sb.append(i).append("\n");
            }
        }

        if (n != 1) sb.append(n);

        System.out.print(sb);
    }
}