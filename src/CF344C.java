import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF344C {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        double a = Long.parseLong(st.nextToken());
        double b = Long.parseLong(st.nextToken());
        long ans = 0;
        while (a != b) {
            double val = a / b;
            if (val < 1) {
                b = b - a;
                ans++;
            } else if (val > 1) {
                a = a - b;
                ans++;
            }
        }
        ans+=a;

        sb.append(ans).append("\n");
        System.out.print(new String(sb));
    }

}
