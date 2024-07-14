package week2;

import java.util.ArrayList;
import java.util.List;

public class A014_20240714 {
    public List<String> summaryRanges(int[] nums) {
        List<String> L = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && (nums[i + 1] - nums[i]) == 1) i++;
            sb.append(start);
            if (nums[i] != start) sb.append("->").append(nums[i]);
            L.add(sb.toString());
            sb.setLength(0);
        }
        return L;
    }
}
