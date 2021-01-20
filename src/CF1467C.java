import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CF1467C {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int[] N = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            Map<Integer, Integer> a = new TreeMap<>();
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N[0]; ++i) {
                int val = Integer.parseInt(st.nextToken());
                if (a.get(val) == null) {
                    a.put(val, 0);
                }
                a.put(val, a.get(val) + 1);
            }
            Map<Integer, Integer> b = new TreeMap<>();
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N[1]; ++i) {
                int val = Integer.parseInt(st.nextToken());
                if (b.get(val) == null) {
                    b.put(val, 0);
                }
                b.put(val, b.get(val) + 1);
            }
            Map<Integer, Integer> c = new TreeMap<>();
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N[2]; ++i) {
                int val = Integer.parseInt(st.nextToken());
                if (c.get(val) == null) {
                    c.put(val, 0);
                }
                c.put(val, c.get(val) + 1);
            }



        }
    }
}
