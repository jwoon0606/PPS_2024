package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A051_20240705{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sec = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};

        int totalSec = 0;
        for(byte val : br.readLine().getBytes()){
            totalSec += sec[(int)val - 'A'];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(totalSec).append("\n");
        System.out.print(sb);
    }
}