package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class CCC2000S3 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        ArrayList<String> key = new ArrayList<>();
        ArrayList<String>[] aj = new ArrayList[N];


        for(int i=0;i<N;i++){
            ArrayList<String> temp = new ArrayList<>();
            aj[i]=temp;
            String r = reader.readLine();
            String s;
            do{
                s = reader.readLine();
                String[] arr = s.split("HREF=\"");
                for(int j=1;j<arr.length;j++){
                    aj[i].add(arr[j].substring(0,arr[j].indexOf("\"")));
                }
            }while(!s.contains("</HTML>"));
            key.add(r);
        }

        for(int i=0;i<N;i++){
            for (String s : aj[i]) System.out.println("Link from " + key.get(i) + " to " + s);
        }

        String s1,s2;


        while(!(s1= reader.readLine()).equals("The End")){
            boolean[] visited = new boolean[N];
            boolean canReach = false;
            s2 = reader.readLine();

            ArrayDeque<String> q = new ArrayDeque<>();
            q.add(s1);

            while(!q.isEmpty()){
                String curr = q.pop();
                if(curr.equals(s2)){System.out.println("Can surf from "+s1+" to "+s2+".");canReach=true;break;}
                int i = key.indexOf(curr);
                if(i!=-1&&!visited[i]){
                    visited[i] = true;
                    q.addAll(aj[i]);
                }
            }
            if(!canReach)System.out.println("Can't surf from "+s1+" to "+s2+".");
        }
    }
}
