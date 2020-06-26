import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1367A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s = in.readLine();
            String ans = "";
            for(int i=0;i<s.length();i+=2){
                ans+=s.charAt(i);
            }
            ans += s.charAt(s.length()-1);
            sb.append(ans).append("\n");
        }
        System.out.print(new String(sb));
    }
}
