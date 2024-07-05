package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class A034_20240702 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
            num %= 42;
            if(!al.contains(num))
                al.add(num);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(al.size()).append("\n");

        System.out.print(sb);
    }
}

