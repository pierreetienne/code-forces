import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1183A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(in.readLine());
        for(int i=num;;++i){
            String n = i+"";
            int sum = 0;
            for(int j=0;j<n.length();++j){
                sum += n.charAt(j)-'0';
            }

            if(sum%4==0){
                sb.append(i).append("\n");
                break;
            }
        }
        System.out.print(new String(sb));
    }
}
