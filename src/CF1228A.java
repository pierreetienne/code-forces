import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF1228A {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());

        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        for(int i=l;i<=r;++i){
            Set<Integer> s = new TreeSet<>();
            String num = i+"";
            boolean ok = true;
            for(int j=0;j<num.length();++j){
                if(s.contains((int)num.charAt(j))){
                    ok = false;
                    break;
                }
                s.add((int) num.charAt(j));
            }
            if(ok){
                sb.append(i).append("\n");
                break;
            }
        }
        if(sb.length()==0)
            sb.append("-1\n");

        System.out.print(new String(sb));
    }
}
