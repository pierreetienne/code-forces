import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1285A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        in.readLine();
        String n = in.readLine();
        int l = 0;
        for(int i=0;i<n.length();++i){
            if(n.charAt(i) == 'L')
                l++;
        }
        int r = n.length() - l;
        int d = 0;
        if(l > 0 ){
            d += l + 1;
        }

        if(r == n.length())
            d++;
        d += r;
        sb.append(d).append("\n");


        System.out.print(new String(sb));
    }
}
