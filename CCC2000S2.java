package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class CCC2000S2 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#");

        int N = Integer.parseInt(reader.readLine());

        ArrayList<Double> streams = new ArrayList<>();

        for(int i=0;i<N;i++) streams.add(Double.parseDouble(reader.readLine()));

        String input;

        while(!(input=reader.readLine()).equals("77")){
            int index = Integer.parseInt(reader.readLine())-1;
            if(input.equals("99")){
                int per = Integer.parseInt(reader.readLine());

                streams.add(index, streams.get(index)*per/100.0);
                streams.set(index+1, streams.get(index+1)*(1-per/100.0));
            }else{
                streams.set(index, streams.get(index)+streams.get(index+1));
                streams.remove(index+1);
            }
        }
        for(double d : streams)System.out.print(df.format(d)+" ");
    }
}
