package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A189_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(m < 45){
            if(h < 1)
                bw.write((h + 24 - 1) + " " + (m + 60 - 45));
            else
                bw.write((h - 1) + " " + (m + 60 - 45));
        }
        else{
            bw.write(h + " " + (m - 45));
        }

        bw.newLine();
        bw.flush();
        bw.close();
    }
}
