package divisormultipledecimal;

import java.io.*;
import java.util.*;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 & b == 0) break;
            if (a >= b & a % b == 0) {
                System.out.println("multiple");
            } else if (a <= b & b % a == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}
