package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2005J4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int w = Integer.parseInt(reader.readLine()), h = Integer.parseInt(reader.readLine()),
                cw = Integer.parseInt(reader.readLine()), ch = Integer.parseInt(reader.readLine()),
                steps = Integer.parseInt(reader.readLine());

        reader.close();

        boolean[][] visit = new boolean[w][h];

        for(int i=0;i<cw;i++){
            for(int j=0;j<ch;j++){
                visit[i][j] = true;
                visit[w-1-i][j] = true;
                visit[i][h-1-j] = true;
                visit[w-1-i][h-1-j] = true;
            }
        }

        int c = cw, r = 0, dir = 0;

        visit[c][r] = true;

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        while(steps-->0){
            int lc = c+dc[(dir+3)%4];
            int lr = r+dr[(dir+3)%4];

            if(isValid(lr, lc, w, h, visit)){
                c = lc;
                r = lr;
                dir = (dir+3)%4;
                visit[c][r] = true;
                continue;
            }

            lc = c+dc[dir];
            lr = r+dr[dir];

            if(isValid(lr, lc, w, h, visit)){
                c = lc;
                r = lr;
                visit[c][r] = true;
                continue;
            }

            lc = c+dc[(dir+1)%4];
            lr = r+dr[(dir+1)%4];

            if(isValid(lr, lc, w, h, visit)){
                c = lc;
                r = lr;
                dir = (dir+1)%4;
                visit[c][r] = true;
                continue;
            }

            break;
        }
        System.out.println((c+1)+"\n"+(r+1));
    }
    static boolean isValid(int r, int c, int w, int h, boolean[][] visit){
        return r>=0 && c>=0 && r<h && c<w && !visit[c][r];
    }
}
