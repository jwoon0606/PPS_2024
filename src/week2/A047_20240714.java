package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A047_20240714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(byte b : br.readLine().getBytes()){
            sb.append((char)b);
            if(++i == 10){
                i = 0;
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}

