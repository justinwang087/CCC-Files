package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CCC2021S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        double a = 0;

        int[] h = new int[N+1];
        int[] w = new int[N];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for(int i=0;i<N+1;i++)h[i]=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        for (int i=0;i<N;i++)w[i]=Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++)a+=(double)((h[i]+h[i+1])*w[i])/2;

        System.out.println(a);
    }
}
