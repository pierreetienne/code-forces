import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CF2A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(in.readLine());
        Map<String, Integer> map = new TreeMap<>();
        List<Object[]> list = new ArrayList<>();
        String winner = "";

        for (int i = 0; i < C; ++i) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            String name = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            if (map.get(name) == null) {
                map.put(name, 0);
            }
            int saved = map.get(name);
            int total = saved + value;
            map.put(name, total);
            list.add(new Object[]{name, value});
        }
        Set<String> winners = new TreeSet<>();
        Integer max = null;
        for (String key : map.keySet()) {
            if (max == null)
                max = map.get(key);
            max = Math.max(max, map.get(key));
        }

        for (String key : map.keySet()) {
            if (max.equals(map.get(key)))
                winners.add(key);
        }
        Map<String, Integer> m2 = new TreeMap<>();
        for (int i = 0; i < list.size(); ++i) {
            String name = (String) list.get(i)[0];
            int value = (int) list.get(i)[1];

            if (m2.get(name) == null) {
                m2.put(name, 0);
            }

            int total = m2.get(name) + value;
            m2.put(name, total);
            if (total >= max && winners.contains(name)) {
                winner = name;
                break;
            }
        }


        System.out.println(winner);

    }
}
