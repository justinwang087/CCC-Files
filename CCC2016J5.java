package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CCC2016J5 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());

        StringTokenizer input = new StringTokenizer(reader.readLine());
        ArrayList<Integer> dmoj = new ArrayList<>();
        for(int i=0;i<N;i++) dmoj.add(Integer.parseInt(input.nextToken()));

        input = new StringTokenizer(reader.readLine());
        ArrayList<Integer> peg = new ArrayList<>();
        for(int i=0;i<N;i++) peg.add(Integer.parseInt(input.nextToken()));

        Collections.sort(dmoj);
        Collections.sort(peg);

        if(test==2) Collections.reverse(peg);

        int out = 0;

        for(int i=0;i<N;i++) out+=Math.max(peg.get(i), dmoj.get(i));

        System.out.print(out);
    }
}
