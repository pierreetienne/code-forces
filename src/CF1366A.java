import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF1366A {


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int p = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (p <= 0 || d <= 0)
                System.out.println(0);
            else {
                int max = Math.max(p,d);
                int min = Math.min(p,d);

                int sol = 0;
                Set<Integer> visited = new TreeSet<>();
                int win = Math.min(p, d);
                while(true) {
                    visited.add(win);
                    int winX = win * 2;
                    int winY = win;
                    if (winX <= max && winY <= min ) {
                        sol = Math.max(win, sol);
                        win++;
                    } else {
                        win--;
                    }
                    if(visited.contains(win)|| win < 0)
                        break;
                }
                System.out.println(sol);



            }

        }
    }


}
