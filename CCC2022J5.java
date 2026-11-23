package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CCC2022J5 {

    static int N, T;
    static int[] tr, tc;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(reader.readLine());
        T = Integer.parseInt(reader.readLine());

        tr = new int[T];
        tc = new int[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            tr[i] = Integer.parseInt(st.nextToken());
            tc[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        for (int i = -1; i < T; i++) {
            int r = (i == -1) ? 1 : tr[i] + 1;
            if (r > N) continue;

            for (int j = -1; j < T; j++) {
                int c = (j == -1) ? 1 : tc[j] + 1;
                if (c > N) continue;

                int maxSize = Math.min(N - r + 1, N - c + 1);

                for (int k = 0; k < T; k++) {
                    if (tr[k] >= r && tc[k] >= c) {
                        int limit = Math.max(tr[k] - r, tc[k] - c);
                        maxSize = Math.min(maxSize, limit);
                    }
                }

                ans = Math.max(ans, maxSize);
            }
        }

        System.out.println(ans);
    }
}
