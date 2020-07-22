import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1167A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while(T-->0){
                int N = Integer.parseInt(in.readLine());
                String s = in.readLine();
                int index = -1;
                for(int i=0;i<s.length();++i){
                    if(s.charAt(i)=='8') {
                        index = i;
                        break;
                    }
                }
                if(index != -1 && s.length()-index>=11)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

    }
}
