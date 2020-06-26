import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1325A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            sb.append(1 + " " + (N - 1)).append("\n");
        }
        System.out.print(new String(sb));
    }
}
