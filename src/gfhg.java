import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gfhg {


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[][] m = new int[6][6];
        for (int i = 0; i < m.length; ++i) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int j = 0; j < m.length; ++j) {
                m[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] pos = {{0, 0}, {0, 1}, {0, 2}, {1, 1}, {2, 0}, {2, 1}, {2, 2}};

        int max = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                int count = m[i][j]+ m[i][j+1]+m[i][j+2]
                                  + m[i+1][j+1]
                         + m[i+2][j]+ m[i+2][j+1]+m[i+2][j+2];
//                for(int p = 0;p<pos.length;++p){
//                    int[] val = pos[p];
//                    int dj = val[1]+j;
//                    int di = val[0]+i;
//                    count += m[di][dj];
//                }
                max = Math.max(max,count);
            }
        }
        System.out.println(max);
    }
}
