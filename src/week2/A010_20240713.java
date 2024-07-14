package week2;

public class A010_20240713 {
    public int solution(String s) {
        int answer = 0;

        int len = s.length();
        if (len == 1)
            return 1;

        answer = len;

        for (int step = 1; step <= len / 2; step++) {
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, step);
            int count = 1;

            for (int i = step; i < len; i += step) {
                int end = Math.min(i + step, len);
                String current = s.substring(i, end);

                if (current.equals(prev)) {
                    count++;
                } else {
                    if (count > 1) {
                        compressed.append(count).append(prev);
                    } else {
                        compressed.append(prev);
                    }
                    prev = current;
                    count = 1;
                }
            }

            if (count > 1) {
                compressed.append(count).append(prev);
            } else {
                compressed.append(prev);
            }

            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}
