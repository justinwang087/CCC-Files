package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CCC2024S2 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int T = Integer.parseInt(input[0]), N = Integer.parseInt(input[1]);
        boolean size;
        HashMap<String, Integer> chars;
        StringBuilder out = new StringBuilder();

        while(T-->0){
            input = reader.readLine().split("");
            chars=new HashMap<>();

            for(String character : input)chars.put(character, chars.getOrDefault(character, 0)+1);
            size = chars.get(input[0]) == 1;
            int i;
            for(i=1;i<N;i++){
                if((chars.get(input[i])==1&&!size)|| (chars.get(input[i])>1&&size)) size=!size;
                else{break;}
            }
            if(i==N) out.append("T\n");
            else out.append("F\n");
        }
        System.out.println(out);
    }
}
