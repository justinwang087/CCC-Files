package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CCC2016S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] cs = reader.readLine().toCharArray();

        HashMap<Character, Integer> f = new HashMap<>();
        HashMap<Character, Integer> s = new HashMap<>();

        for(char c : cs)f.put(c,f.getOrDefault(c,0)+1);

        cs = reader.readLine().toCharArray();

        for(char c : cs)s.put(c,s.getOrDefault(c,0)+1);

        for(char c : s.keySet()){
            if(c=='*')continue;
            if(f.get(c)==null){System.out.println('N');return;}
            if(f.get(c)<s.get(c)){System.out.println('N');return;}
        }
        System.out.println('A');
    }
}
