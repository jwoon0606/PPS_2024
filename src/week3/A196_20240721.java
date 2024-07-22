package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A196_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] nums = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i=0; i<size; i++){
            if(nums[i] == target)
                count++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");
        System.out.println(sb);
    }
}
