import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1102A {

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        long ans = (N*(N+1))/2;
        if(ans%2==0)
            sb.append("0\n");
        else
            sb.append("1\n");
        System.out.print(new String(sb));

    }
}
