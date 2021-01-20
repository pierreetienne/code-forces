import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CF1426C {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    public static void main(String[] args) throws Exception {

        Map<String, List<Integer>> data = new HashMap<>();
        data.put("10", List.of(1,2,3,4));
        data.remove("10", List.of(1,2));
        System.out.println("data " + data);

        System.out.println(minimum_index(new int[]{1,1,3}));


//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        for (String ln; (ln = in.readLine()) != null; ) {
//            int T = Integer.parseInt(ln);
//            while (T-- > 0) {
//                int n = Integer.parseInt(in.readLine());
//                int min = Integer.MAX_VALUE;
//                for (int i = 1; i <100245; ++i) {
//                    int aux2 = (n - 1) / i;
//                    min = Math.min(aux2 + (i), min);
//                }
//                System.out.println(n == 1 ? 0 : (min - 1));
//            }
//        }
    }


}

