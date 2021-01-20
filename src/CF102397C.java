import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF102397C {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            StringTokenizer st = new StringTokenizer(ln);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            String line = in.readLine();

            for (int i = 0; i < line.length(); ++i) {
                if (line.charAt(i) == 'U'){
                    y++;
                } else if ( line.charAt(i) == 'D'){
                    y--;
                } else if ( line.charAt(i) == 'L') {
                    x--;
                } else {
                    x++;
                }
            }
            System.out.println(x + " " + y);

        }

    }
}
