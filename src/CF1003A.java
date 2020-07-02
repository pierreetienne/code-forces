import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CF1003A {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<N;++i){
            int val = Integer.parseInt(st.nextToken());
            if(map.get(val)==null)
                map.put(val,0);
            map.put(val,map.get(val)+1);
            max = Math.max(max, map.get(val));
        }
        sb.append(max).append("\n");
        System.out.print(new String(sb));
    }
}
