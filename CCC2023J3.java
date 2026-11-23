package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC2023J3 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] days = new int[5];
        int T = Integer.parseInt(reader.readLine());

        while(T-->0){
            String a = reader.readLine();
            for(int i=0;i<5;i++){
                if(a.charAt(i)=='Y') days[i]++;
            }
        }
        ArrayList<Integer> day = new ArrayList<>();
        day.add(0);
        for(int i=1;i<5;i++){
            if(days[day.get(0)]<days[i]){
                day.clear();
                day.add(i);
            }else if(days[day.get(0)]==days[i]){
                day.add(i);
            }
        }
        String out = "";
        for(int i = 0;i<day.size();i++){
            if(i>0) out+=",";
            out+=day.get(i)+1;
        }
        System.out.println(out);
    }
}
