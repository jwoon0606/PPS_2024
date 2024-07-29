package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A111_20240728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc;
        double x;
        tc = Integer.parseInt(br.readLine());
        while(tc-- != 0){
            x = Double.parseDouble(br.readLine());
            double res = Math.pow(2.0,x)-1;
            System.out.println(res);
        }
    }
}
