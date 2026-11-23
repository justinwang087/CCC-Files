package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class CCC2010J5 {
    static class Pair<F, S>{
        public final F first;
        public final S second;
        private int hashCode;

        public Pair(F first, S second){
            this.first=first;
            this.second=second;
            this.hashCode= Objects.hash(first, second);
        }

        @Override
        public boolean equals(Object o){
            if(this ==o) return true;
            if(o==null||getClass()!=o.getClass())return false;
            Pair<Integer, Integer> that = (Pair<Integer, Integer>) o;
            return first==that.first && second==that.second;
        }

        @Override
        public int hashCode(){
            return this.hashCode;
        }
    }

    static final int N = 9;
    static Pair<Integer, Integer> A;
    static Pair<Integer, Integer> B;
    static boolean[][] visit;
    static Queue<Pair<Integer, Integer>> q;

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        A = new Pair<>(Integer.parseInt(input[0]), Integer.parseInt(input[1]));

        input = reader.readLine().split(" ");
        B = new Pair<>(Integer.parseInt(input[0]), Integer.parseInt(input[1]));

        visit = new boolean[N][N];

        for(int i=0;i<N;i++){for(int j=0;j<N;j++){visit[i][j] = false;}}

        q = new LinkedList<>();

        System.out.println(bfs());
    }

    static int bfs(){
        q.add(A);
        Pair<Integer, Integer> placement = A;
        int output = 0;

        while(!placement.equals(B)){
            output++;

            int length = q.size();

            for(int i=0;i<length;i++){
                placement = q.remove();

                if(visit[placement.first-1][placement.second-1]){continue;}
                visit[placement.first-1][placement.second-1] = true;

                if(placement.equals(B)){output--;break;}

                if(placement.first+2<N&&placement.second+1<N){
                    q.add(new Pair<>(placement.first+2, placement.second+1));
                }
                if(placement.first+2<N&&placement.second-1>0){
                    q.add(new Pair<>(placement.first+2, placement.second-1));
                }
                if(placement.first-2>0&&placement.second+1<N){
                    q.add(new Pair<>(placement.first-2, placement.second+1));
                }
                if(placement.first-2>0&&placement.second-1>0){
                    q.add(new Pair<>(placement.first-2, placement.second-1));
                }
                if(placement.first+1<N&&placement.second+2<N){
                    q.add(new Pair<>(placement.first+1, placement.second+2));
                }
                if(placement.first-1>0&&placement.second+2<N){
                    q.add(new Pair<>(placement.first-1, placement.second+2));
                }
                if(placement.first+1<N&&placement.second-2>0){
                    q.add(new Pair<>(placement.first+1, placement.second-2));
                }
                if(placement.first-1>0&&placement.second-2>0){
                    q.add(new Pair<>(placement.first-1, placement.second-2));
                }
            }
        }

        return output;
    }
}
