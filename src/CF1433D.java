import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CF1433D {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                int n = Integer.parseInt(in.readLine());
                StringTokenizer st = new StringTokenizer(in.readLine());
                int[] gangs = new int[n];
                for (int i = 0; i < n; ++i) {
                    int value = Integer.parseInt(st.nextToken());
                    gangs[i] = value;
                }

                int district = gangs[0];
                List<int[]> sol = new ArrayList<>();
                for (int i = 0; i < n; ++i) {
                    if (gangs[i] != district) {
                        sol.add(new int[]{1, i + 1});
                    }
                }

                if (sol.size() == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    for (int i = 1; i < n; ++i) {
                        if (gangs[i] == district) {
                            sol.add(new int[]{sol.get(0)[1], i + 1});
                        }
                    }
                    for (int[] x : sol) {
                        System.out.printf("%d %d\n", x[0], x[1]);
                    }
                }
            }
        }
    }
}

