package week2;

import java.util.ArrayList;
import java.util.List;

public class A002_20240713 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> T = new ArrayList<>();

        List<Integer> zeroRow = new ArrayList<>();
        zeroRow.add(1);
        T.add(zeroRow);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = T.get(rowNum - 1);

            row.add(1);
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);

            T.add(row);
        }

        return T;
    }
}