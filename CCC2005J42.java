package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2005J42 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int w = Integer.parseInt(reader.readLine()), h = Integer.parseInt(reader.readLine()),
                cw = Integer.parseInt(reader.readLine()), ch = Integer.parseInt(reader.readLine()),
                l = Integer.parseInt(reader.readLine());
        boolean[][] grid = new boolean[h][w];

        for(int i=0;i<h;i++){for(int j=0;j<w;j++){grid[i][j]=false;}}

        for(int i=0;i<ch;i++){
            for(int j=0;j<cw;j++){
                grid[i][j] = true;
                grid[i][w-j-1] = true;
                grid[h-i-1][j] = true;
                grid[h-i-1][w-j-1]=true;
            }
        }

        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int posH = 0, posW = cw, facing = 0;
        grid[posH][posW] = true;
        while(l-->0){
            if(isAble(posH, posW, dir[(facing+3)%4][0], dir[(facing+3)%4][1], grid)){
                facing=(facing+3)%4;
                posH+=dir[facing][0];
                posW+=dir[facing][1];
                grid[posH][posW] = true;
            }else if(isAble(posH, posW, dir[facing][0], dir[facing][1], grid)){
                posH+=dir[facing][0];
                posW+=dir[facing][1];
                grid[posH][posW] = true;
            }else if(isAble(posH, posW, dir[(facing+1)%4][0], dir[(facing+1)%4][1], grid)){
                facing=(facing+1)%4;
                posH+=dir[facing][0];
                posW+=dir[facing][1];
                grid[posH][posW] = true;
            }else{
                break;
            }
        }
        System.out.println((posW+1)+"\n"+(posH+1));
    }
    static boolean isAble(int posH, int posW, int dirH, int dirW, boolean[][] grid){
        return(posH+dirH>=0&&
                posH+dirH < grid.length&&
                posW+dirW>=0&&
                posW+dirW<grid[0].length&&
                !grid[posH+dirH][posW+dirW]
        );
    }
}
