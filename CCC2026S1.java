package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2026S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long A = Long.parseLong(reader.readLine());
        long B = Long.parseLong(reader.readLine());
        long K = Long.parseLong(reader.readLine());
        int T = Integer.parseInt(reader.readLine());

        long D = Math.abs(A - B);

        long u = D / K;
        long r = D % K;

        long a = u + r;
        long b = u + 1 + (K - r);

        long min = Math.min(a, b);

        if (T == 1) {
            System.out.println(min);
        } else {
            long second = min + 2;

            if (a > min)second = Math.min(second, a);
            if (b > min)second = Math.min(second, b);
            if (K == 2 && D != 0)second = Math.min(second, min + 1);

            System.out.println(second);
        }
    }
}