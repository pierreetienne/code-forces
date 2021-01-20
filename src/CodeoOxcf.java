import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeoOxcf {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine()), C = 1;
        while (N-- > 0) {
            int s = Integer.parseInt(in.readLine());
            int[] v = new int[s];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int i = 0; i < s; ++i) {
                v[i] = Integer.parseInt(st.nextToken());
            }
            int max = v[s - 1];
            String sol = "-1";
            for (int i = s - 2; i >= 0; --i) {
                if (v[i] < max) {
                    sol = max + " " + sol;
                } else {
                    sol = -1 + " " + sol;
                }
                max = Math.max(max, v[i]);
            }
            System.out.println("Case #" + (C++) + ": " + sol);
        }
    }
}

