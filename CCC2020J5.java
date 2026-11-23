package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class CCC2020J5 {
    static int R,C;
    static HashMap<Integer, ArrayList<Integer>> map;

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        R = Integer.parseInt(reader.readLine()); C = Integer.parseInt(reader.readLine());

        map = new HashMap<>();

        int target = 0;

        for(int i=0;i<R;i++){
            String[] input = reader.readLine().split(" ");
            for(int j=0;j<C;j++){
                int value = Integer.parseInt(input[j]);
                if(i==0&&j==0) target = value;
                ArrayList<Integer> temp = map.getOrDefault(value, new ArrayList<>());
                temp.add((i+1)*(j+1));

                map.put(value, temp);
            }
        }

        System.out.println(bfs(target)? "yes":"no");
    }
    static boolean bfs(int target){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        boolean[] visit = new boolean[R*C+1];
        q.add(R*C);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int value = q.remove();

                if(visit[value]) continue;
                visit[value] = true;

                if(value==target) return true;

                q.addAll(map.getOrDefault(value, new ArrayList<>()));
            }
        }
        return false;
    }
}
