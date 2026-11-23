package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2021J5 {
    public static void main (String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int R  = Integer.parseInt(reader.readLine()), C = Integer.parseInt(reader.readLine()), T = Integer.parseInt(reader.readLine());

        boolean[] rows = new boolean[R];
        boolean[] cols = new boolean[C];

        while(T-->0){
            String[] input = reader.readLine().split(" ");
            int temp = Integer.parseInt(input[1])-1;
            if(input[0].equals("R")){
                rows[temp] = !rows[temp];
            }else{
                cols[temp] = !cols[temp];
            }
        }

        int out = 0, rf = 0;
        for(int i=0;i<R;i++){
            if(rows[i]){
                out+=C;
                rf++;
            }
        }
        for(int i=0;i<C;i++){
            if(cols[i]){
                out+=R-2*rf;
            }
        }

        System.out.print(out);
    }
}
