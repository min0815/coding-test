package generalmath;

import java.io.*;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 2;
        for (int i = 0; i < n; i++) {
            result = result * 2 - 1;
        }
        System.out.println(result * result);
    }
}
