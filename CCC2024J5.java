package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2024J5 {
    static int R,C;
    static int[][] grid;
    static boolean[][] visit;

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        R = Integer.parseInt(reader.readLine());
        C = Integer.parseInt(reader.readLine());

        grid = new int[R][C];
        visit = new boolean[R][C];

        for(int i=0;i<R;i++){
            String input = reader.readLine();
            for(int j=0;j<C;j++){
                if(input.charAt(j)=='S')grid[i][j]=1;
                else if(input.charAt(j)=='M')grid[i][j]=5;
                else if(input.charAt(j)=='L')grid[i][j]=10;
            }
        }

        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());

        System.out.println(dfs(A,B));
    }

    static int dfs(int r, int c){
        int out = grid[r][c];
        visit[r][c]=true;

        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};

        for(int i=0;i<4;i++){
            if(canMove(r+dir[i][0], c+dir[i][1])) out+=dfs(r+dir[i][0], c+dir[i][1]);
        }
        return out;
    }
    static boolean canMove(int r, int c){
        return(r>=0 &&
                r<R &&
                c>=0 &&
                c<C &&
                !visit[r][c] &&
                grid[r][c] !=0
        );
    }
}
