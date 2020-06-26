import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1337A {

//    public static void main(String[] args) throws Exception {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int T = Integer.parseInt(in.readLine());
//        while (T-- > 0) {
//            StringTokenizer st = new StringTokenizer(in.readLine());
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//            int C = Integer.parseInt(st.nextToken());
//            int D = Integer.parseInt(st.nextToken());
//            boolean found = false;
//            for (int i = A; i >= A && i <= B && !found; ++i) {
//                for (int j = Math.max(C - i + 1, B); j >= B && j <= C && !found; ++j) {
//                    for (int p = Math.max(j - i + 1, C); p >= C && p <= D && !found; ++p) {
//                        if (i + p > j && j + p > i && i + j > p) {
//                            found = true;
//                            sb.append(i + " " + j + " " + p).append("\n");
//                        }
//                    }
//
//                }
//            }
//        }
//        System.out.print(new String(sb));
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            sb.append(B+ " "+C+" "+C+"\n");
        }
        System.out.print(new String(sb));
    }
}
