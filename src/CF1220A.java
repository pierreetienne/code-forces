import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1220A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        in.readLine();
        String s = in.readLine();
        int z = 0;
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'z')
                z++;
            if (s.charAt(i) == 'n')
                n++;
        }

        String ans = "";
        for (int i = 0; i < n; ++i) {
            if (i == 0)
                ans += "1";
            else
                ans += " 1";
        }

        for (int i = 0; i < z; ++i) {
            if (ans.length() == 0)
                ans += "0";
            else
                ans += " 0";
        }
        sb.append(ans).append("\n");
        System.out.print(new String(sb));
    }
}
