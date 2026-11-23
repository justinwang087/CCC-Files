package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CCC2023S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        StringTokenizer input = new StringTokenizer(reader.readLine());
        int[] M = new int[N];

        for(int i=0;i<N;i++) M[i] = Integer.parseInt(input.nextToken());

        for(int len = 1;len<=N;len++){
            int l=0, r=0;
            for(int i=0;i<len/2;i++){
                l+=M[i];
                r+=M[len-1-i];
            }
            int dif = Math.abs(l-r);

            for(int i=1;i<N-len;i++){
                l+=M[i+len/2]-M[i-1];
                r+=M[i+len]-M[i+(int)(Math.ceil(len/2.0))];
                dif = Math.min(Math.abs(l-r), dif);
            }
            System.out.println(dif);
        }
    }
}
