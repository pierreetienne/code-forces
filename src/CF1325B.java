import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF1325B {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            Set<Integer> s = new TreeSet<>();
            StringTokenizer st = new StringTokenizer(in.readLine());
            for(int i=0;i<N;++i){
                s.add(Integer.parseInt(st.nextToken()));
            }
            sb.append(s.size()).append("\n");
        }
        System.out.print(new String(sb));

    }
}
