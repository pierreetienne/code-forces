import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF1382A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                Set<Integer> a = new TreeSet<>();
                st = new StringTokenizer(in.readLine());
                for (int i = 0; i < N; ++i) {
                    a.add(Integer.parseInt(st.nextToken()));
                }
                st = new StringTokenizer(in.readLine());
                int sol = -1;
                for (int i = 0; i < M; ++i) {
                    int v = Integer.parseInt(st.nextToken());
                    if (a.contains(v) && sol == -1)
                        sol = v;
                }
                if(sol == -1)
                    System.out.println("NO");
                else{
                    System.out.println("YES\n1 "+sol);
                }
            }
        }
    }
}
