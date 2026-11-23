package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CCC2020S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        ArrayList<Integer> times = new ArrayList<>();
        HashMap<Integer,Integer> pos = new HashMap<>();

        while(N-->0){
            StringTokenizer st = new StringTokenizer(reader.readLine());

            times.add(Integer.parseInt(st.nextToken()));
            pos.put(times.get(times.size()-1),Integer.parseInt(st.nextToken()));
        }
        Collections.sort(times);

        double max = 0;

        for(int i=1;i<times.size();i++){
            max=Math.max(max,Math.abs((double)(pos.get(times.get(i))-pos.get(times.get(i-1)))/(times.get(i)-times.get(i-1))));
        }
        System.out.println(max);
    }
}
