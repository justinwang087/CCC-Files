package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CCC2023J2 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> SHU = new HashMap<>();
        SHU.put("Poblano", 1500);
        SHU.put("Mirasol", 6000);
        SHU.put("Serrano",	15500);
        SHU.put("Cayenne",	40000);
        SHU.put("Thai",	75000);
        SHU.put("Habanero",125000);

        int N = Integer.parseInt(reader.readLine());

        int out = 0;
        while(N-->0){
            out+=SHU.get(reader.readLine());
        }
        System.out.println(out);
    }
}
