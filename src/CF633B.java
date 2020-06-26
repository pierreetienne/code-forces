import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF633B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String ln = in.readLine();

        int T = Integer.parseInt(ln);
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int s = Integer.parseInt(in.readLine());
            int[] d = new int[s];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int i = 0; i < s; ++i) {
                d[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(d);
            int[] sol = new int[s];
            int index = (int) Math.floor(s / 2);
            for (int i = index, j = 0; i >= 0; --i) {
                if (i == index) {
                    if (s % 2 != 0) {
                        sol[j++] = d[i];
                    } else {
                        sol[j++] = d[i - 1];
                        sol[j++] = d[i];
                        i--;
                    }
                } else {
                    sol[j++] = d[i];
                    sol[j++] = d[s - i - 1];
                }
            }

            for (int i = 0; i < s; ++i) {
                if (i == 0)
                    sb.append(sol[i]);
                else
                    sb.append(" ").append(sol[i]);

            }
            sb.append("\n");
        }
        System.out.println(new String(sb));
    }
}
