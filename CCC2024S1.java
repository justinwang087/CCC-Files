package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2024S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int[] h = new int[N];

        for(int i=0;i<N;i++)h[i]=Integer.parseInt(reader.readLine());

        int out = 0;
        int half = N/2;

        for(int i=0;i<half;i++)if(h[(half+i>N?half+i-N:half+i)]==h[i])out++;

        System.out.println(out*2);
    }
}
