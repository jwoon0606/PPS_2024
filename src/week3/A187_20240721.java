package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class A187_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            bw.write(String.valueOf(1));
        }
        else{
            bw.write(String.valueOf(0));
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
