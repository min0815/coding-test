package timecomplexity;

import java.io.*;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((long) (n - 1) * n / 2);
        System.out.println(2);
    }
}