package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2022S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int max = N/4;
        int out = 0;

        for(int i=0;i<=max;i++)if((N-4*i)%5==0)out++;
        System.out.println(out);
    }
}
