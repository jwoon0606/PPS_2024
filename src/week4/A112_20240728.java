package week4;

import java.util.Scanner;
import java.util.Arrays;


public class A112_20240728 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Min;

        int[] unit = new int[M];
        int[] pack = new int[M];
        for(int i=0; i<M; i++){
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }
        Arrays.sort(unit);
        Arrays.sort(pack);


        Min = Math.min(((N/6)+1)*pack[0], N*unit[0]);
        Min = Math.min(Min, ((N/6))*pack[0] + (N%6)*unit[0]);

        System.out.println(Min);
    }
}
