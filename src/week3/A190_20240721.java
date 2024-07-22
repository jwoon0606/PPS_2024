package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A190_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());
        int price;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(dice1 == dice2 || dice2 == dice3 || dice1 == dice3){
            if(dice1 == dice2 && dice2 == dice3){
                price = 10000 + dice1 * 1000;
            }
            else{
                if(dice1 == dice2 || dice1 == dice3){
                    price = 1000 + dice1 * 100;
                }
                else{
                    price = 1000 + dice2 * 100;
                }
            }
        }
        else{
            if(dice1 >= dice2){
                if(dice1 >= dice3) price = dice1 * 100;
                else price = dice3 * 100;
            }
            else{
                if(dice2 >= dice3) price = dice2 * 100;
                else price = dice3 * 100;
            }
        }
        bw.write(String.valueOf(price));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
