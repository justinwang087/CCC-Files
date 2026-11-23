package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC2023J5 {
    static String word;
    static int R,C;
    static char[][] grid;
    static int[][] dir;

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        word = reader.readLine();
        R = Integer.parseInt(reader.readLine());
        C = Integer.parseInt(reader.readLine());

        grid = new char[R][C];

        ArrayList<ArrayList<Integer>> starts = new ArrayList<>();

        for(int i=0;i<R;i++){
            String input = reader.readLine();
            for(int j=0;j<C;j++){
                grid[i][j]=input.charAt(j*2);
                if(input.charAt(j*2)==word.charAt(0)){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    starts.add(temp);
                }
            }
        }
        dir = new int[][]{{1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}};
        int out = 0;

        for(ArrayList<Integer> start: starts){
            for(int i=0;i<8;i++){
                out+=search(start.get(0), start.get(1), 0, false, i);
            }
        }
        System.out.println(out);
    }

    static int search(int r, int c, int letter, boolean turned, int direction){
        if(grid[r][c]==word.charAt(letter))letter++;
        else return 0;

        if (letter==word.length()) return 1;

        int out = 0;

        for(int i=0;i<8;i++){
            if(i==direction){
                if(can(r+dir[i][0], c+dir[i][1]))out+=search(r+dir[i][0], c+dir[i][1], letter, turned, i);
            }else if(!turned&&letter!=1&&((i+(8-direction))%8==2||(i+(8-direction))%8==6)){
                if(can(r+dir[i][0], c+dir[i][1])) out+=search(r+dir[i][0], c+dir[i][1], letter, true, i);
            }
        }
        return out;
    }
    static boolean can(int r, int c){
        return r>=0&&r<R&&c>=0&&c<C;
    }
}
