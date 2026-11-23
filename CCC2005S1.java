package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CCC2005S1 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 2);
        map.put("B", 2);
        map.put("C", 2);

        map.put("D", 3);
        map.put("E", 3);
        map.put("F", 3);

        map.put("G", 4);
        map.put("H", 4);
        map.put("I", 4);

        map.put("J", 5);
        map.put("K", 5);
        map.put("L", 5);

        map.put("M", 6);
        map.put("N", 6);
        map.put("O", 6);

        map.put("P", 7);
        map.put("Q", 7);
        map.put("R", 7);
        map.put("S", 7);

        map.put("T", 8);
        map.put("U", 8);
        map.put("V", 8);

        map.put("W", 9);
        map.put("X", 9);
        map.put("Y", 9);
        map.put("Z", 9);


        while(N-->0){
            String[] input = reader.readLine().split("");
            StringBuilder out = new StringBuilder();

            int i=0;

            for(String c : input){
                if(c.equals("-"))continue;
                if(Character.isDigit((c.charAt(0)))) out.append(c);
                else out.append(map.get(c));
                if(i==2||i==5)out.append("-");
                i++;
                if(i==10) break;
            }
            System.out.println(out);
        }
    }
}
