package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2002S3 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        boolean[][] g = new boolean[r][c];
        for(int i=0;i<r;i++){
            char[] chars = reader.readLine().toCharArray();
            for(int j=0;j<c;j++)g[i][r]= chars[j] == 'X';
        }

        int N = Integer.parseInt(reader.readLine());
        int[] dirx = {1,0,-1,0};
        int[] diry = {0,-1,0,1};


    }
}
