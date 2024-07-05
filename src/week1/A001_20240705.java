package week1;

import java.util.Arrays;

public class  A001_20240705{
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int i = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                j++;
                i++;
            } else
                j++;
        }

        return count;
    }
}