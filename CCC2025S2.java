package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class CCC2025S2 {
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
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        ArrayList<Pair<Long, Character>> cipher = new ArrayList<>();
        long length = 0;

        char c = input.charAt(0);
        StringBuilder tempL=new StringBuilder();
        for(int i=1;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                long temp=Long.parseLong(tempL.toString());
                length+=temp;
                cipher.add(new Pair<>(temp, c));
                c = input.charAt(i);
                tempL=new StringBuilder();
            }else{
                tempL.append(input.charAt(i));
            }
        }
        long temp=Long.parseLong(tempL.toString());
        length+=temp;
        cipher.add(new Pair<>(temp, c));

        long pos = Long.parseLong(reader.readLine())%length;
        for(Pair<Long, Character> ch : cipher){
            if(ch.first>pos){ System.out.println(ch.second);break;}
            else pos-=ch.first;
        }
    }
}
