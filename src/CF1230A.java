import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1230A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a[] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        Arrays.sort(a);
        if (a[3] == a[2] + a[1] + a[0] || a[3] + a[0] == a[2] + a[1] || a[3] + a[1] == a[2] + a[0])
            sb.append("YES").append("\n");
        else
            sb.append("NO").append("\n");
        System.out.print(new String(sb));

    }
}
