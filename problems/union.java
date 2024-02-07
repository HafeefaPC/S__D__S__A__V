package problems;

// union of two arrays
import java.util.*;

public class union {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] != b[j]) {
                if (a[i] < b[j]) {
                    union.add(a[i]);
                    i++;
                } else {
                    union.add(b[j]);
                    j++;
                }
            } else {
                union.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            union.add(a[i]);
            i++;
        }

        while (j < b.length) {
            union.add(b[j]);
            j++;
        }

        for (int k = 0; k < union.size() - 1; k++) {
            if (union.get(k) == (union.get(k + 1))) {
                union.remove(k + 1);
                k--;
            }
        }

        return union;
    }
}
