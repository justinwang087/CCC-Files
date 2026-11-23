package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class CCC2010S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        if(N==0)return;

        TreeMap<Integer, ArrayList<String>> values = new TreeMap<>();

        while(N-->0){
            String[] in = reader.readLine().split(" ");
            int value = 2*Integer.parseInt(in[1])+3*Integer.parseInt(in[2])+Integer.parseInt(in[3]);

            values.putIfAbsent(value, new ArrayList<>());

            ArrayList<String> names = values.get(value);
            names.add(in[0]);

            values.put(value, names);
        }
        ArrayList<String> names = values.get(values.lastKey());
        if(names.size()>1){
            Collections.sort(names);
            System.out.println(names.get(0)+"\n"+names.get(1));
        }else if(values.size()>1){
            ArrayList<String> temp = values.get(values.lowerKey(values.lastKey()));
            Collections.sort(temp);
            System.out.println(names.get(0)+"\n"+temp.get(0));
        }else{
            System.out.println(names.get(0));
        }
    }
}
