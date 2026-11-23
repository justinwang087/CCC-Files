package CCCPractice;

import java.io.*;
import java.util.StringTokenizer;

public class CCC2017S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int[] Sw = new int[N+1];
        int[] Sem = new int[N+1];

        StringTokenizer S = new StringTokenizer(reader.readLine());

        for(int i=1;i<=N;i++){
            Sw[i]=Sw[i-1]+Integer.parseInt(S.nextToken());
        }

        S = new StringTokenizer(reader.readLine());

        for(int i=1;i<=N;i++){
            Sem[i]=Sem[i-1]+Integer.parseInt(S.nextToken());
        }

        for(int i=N;i>=0;i--){
            if(Sw[i]==Sem[i]){
                System.out.println(i);
                return;
            }
        }
    }
}
