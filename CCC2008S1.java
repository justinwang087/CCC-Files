package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CCC2008S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> temps = new HashMap<>();
        ArrayList<Integer> temperature = new ArrayList<>();

        String s;

        do{
            s = reader.readLine();
            String[] temp = s.split(" ");
            if(temp[1].charAt(0)=='-'){
                temps.put(Integer.parseInt(temp[1].substring(1))*-1,temp[0]);
                temperature.add(Integer.parseInt(temp[1].substring(1))*-1);
            }
            else{
                temps.put(Integer.parseInt(temp[1]),temp[0]);
                temperature.add(Integer.parseInt(temp[1]));
            }
        }while(!s.split(" ")[0].equals("Waterloo"));
        Collections.sort(temperature);
        System.out.println(temps.get(temperature.get(0)));
    }
}
