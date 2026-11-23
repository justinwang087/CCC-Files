package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2023J4 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String[] top = reader.readLine().split(" ");
        String[] bot = reader.readLine().split(" ");

        int out = 0;
        for(int i=0;i<N;i++){
            if(top[i].equals("1")){
                out+=3;
                if(i!=0&&top[i-1].equals("1")) out-=2;
            }
        }
        for(int i=0;i<N;i++){
            if(bot[i].equals("1")){
                out+=3;
                if(i!=0&&bot[i-1].equals("1")) out-=2;
                if(i%2==0&&top[i].equals("1")) out-=2;
            }
        }
        System.out.print(out);
    }
}
