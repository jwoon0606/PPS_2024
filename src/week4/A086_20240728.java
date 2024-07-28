package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A086_20240728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        String[] toFindNum = new String[N - M + 1];
        HashMap<String, Integer> numStrHM = new HashMap<>();
        for (int i = 0, n = M; i < toFindNum.length; n++, i++) {
            int first = n / 10;
            int last = n % 10;
            String numStr = (first == 0) ? words[last] : (words[first] + " " + words[last]);
            toFindNum[i] = numStr;
            numStrHM.put(numStr, n);
        }

        Arrays.sort(toFindNum);

        for (int i = 0, j = 1; i < toFindNum.length; i++, j++) {
            bw.write(numStrHM.get(toFindNum[i]) + " ");
            if (j % 10 == 0) {
                bw.write("\n");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}