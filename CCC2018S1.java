package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCC2018S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int[] V = new int[N];

        for(int i=0;i<N;i++){
            V[i]=Integer.parseInt(reader.readLine());
        }

        Arrays.sort(V);

        double min=Double.MAX_VALUE;

        for(int i=1;i<N-1;i++){
            double temp = (V[i] - V[i - 1]) / 2.0 + (V[i + 1] - V[i]) / 2.0;
            if(min>temp)min=temp;
        }

        System.out.printf("%.1f",min);
    }
}
