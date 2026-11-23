package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2018J5 {
    static boolean valid(int[][] a, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + 1 < N && a[i][j] >= a[i + 1][j]) return false;
                if (j + 1 < N && a[i][j] >= a[i][j + 1]) return false;
            }
        }
        return true;
    }

    static void print(int[][] a, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        int[][] grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(input[j]);
            }
        }

        if (N == 1) {
            System.out.println(grid[0][0]);
            return;
        }

        int[][] temp = new int[N][N];

        if (valid(grid, N)) {
            print(grid, N);
            return;
        }

        for (int j = 0; j < N; j++)
            for (int i = N - 1; i >= 0; i--)
                temp[j][N - 1 - i] = grid[i][j];

        if (valid(temp, N)) {
            print(temp, N);
            return;
        }

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                temp[N - 1 - i][N - 1 - j] = grid[i][j];

        if (valid(temp, N)) {
            print(temp, N);
            return;
        }

        for (int j = N - 1; j >= 0; j--)
            for (int i = 0; i < N; i++)
                temp[N - 1 - j][i] = grid[i][j];

        print(temp, N);
    }
}
