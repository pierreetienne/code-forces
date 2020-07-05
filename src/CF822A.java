import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF822A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        sb.append(fact(Math.min(a,b))).append("\n");
        System.out.print(new String(sb));
    }

    static long fact (long n ){
        if(n == 1)
            return 1;
        return fact(n-1) * n;
    }
}
