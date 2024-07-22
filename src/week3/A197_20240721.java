package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A197_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for(int i=0; i<N; i++){
            basket[i] = i+1;
        }

        for(int b=0; b<M; b++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(basket[i]).append(" ");
        }
        sb.append("\n");
        System.out.print(sb);
    }
}

