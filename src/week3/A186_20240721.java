package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class A186_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(score >= 90)
            bw.write("A");
        else if(score >= 80)
            bw.write("B");
        else if(score >= 70)
            bw.write("C");
        else if(score >= 60)
            bw.write("D");
        else
            bw.write("F");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
