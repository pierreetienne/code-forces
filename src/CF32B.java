import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF32B {
    public static void main(String[] args) throws  Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = in.readLine();
        String ans = "";
        for(int i=0;i<line.length();++i){
            char c = line.charAt(i);
            if(c == '.'){
                ans+="0";
            }else if(i+1 < line.length() && c=='-' && line.charAt(i+1)=='.'){
                ans+="1";
                ++i;
            }else if(i+1 < line.length() && c=='-' && line.charAt(i+1)=='-'){
                ans+="2";
                ++i;
            }
        }
        sb.append(ans).append("\n");
        System.out.print(new String(sb));

    }
}
