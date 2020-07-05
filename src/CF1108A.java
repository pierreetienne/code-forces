import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1108A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int[][] data = {{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())},
                    {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())}};

            if (data[0][0] != data[1][1])
                sb.append(data[0][0] + " " + data[1][1]).append("\n");
            else
                sb.append(data[0][1] + " " + data[1][1]).append("\n");
        }
        System.out.print(new String(sb));
    }
}
