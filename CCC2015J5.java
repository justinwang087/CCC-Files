package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2015J5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int J = Integer.parseInt(reader.readLine()), A = Integer.parseInt(reader.readLine());
        int[] jerseys = new int[J];

        for(int i=0;i<J;i++){
            String temp = reader.readLine();
            if(temp.equals("S")) jerseys[i]=1;
            else if (temp.equals("M")) jerseys[i]=2;
            else jerseys[i]=3;
        }

        int out = 0;
        for(int i=0;i<A;i++){
            String[] input = reader.readLine().split(" ");
            int size, num = Integer.parseInt(input[1])-1;
            if(input[0].equals("S")) size=1;
            else if (input[0].equals("M")) size=2;
            else size=3;

            if(jerseys[num]>=size){
                jerseys[num]=0;
                out++;
            }
        }
        System.out.println(out);
    }
}
