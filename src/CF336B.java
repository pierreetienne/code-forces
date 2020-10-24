import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF336B {
 // NO pasa
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(String ln;(ln=in.readLine())!=null;){
            StringTokenizer st = new StringTokenizer(ln);
            int m = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            //  X1, Y1      X2  Y2
            // (0,  0) -> ( R,  R)
            double D = Math.sqrt((R*R)+(R*R));
            double sol = 0;


            double[] sum = new double[m];

            sum[0] = 2.;
            for(int i=1;i<m;++i){
                sum[i] = sum[i-1] + (2*(i+1));

            }


            for(int i=0;i<m;++i){

                int izq = i;
                int der = m - i - 1;

                sol += 2*R/m / m;
                if(izq >= 1){
                    sol += (2*R+D)/m / m;
                    izq--;
                    if(izq>0){
                       sol+=((sum[izq-1]*R)+(izq)*(2*D))/m / m;
                    }
                }
                //1418391.5459315027
                //
                if(der >= 1){
                    sol += (2*R+D)/m / m;
                    der--;
                    if(der>0){
                        sol+=((sum[der-1]*R)+(der)*(2*D))/m / m;
                    }
                }
            }



            System.out.println(sol);
            // 2R + (2R + D)+(4R + D)+(6R+D)
        }
    }

    //Version BigDecimal SI PASA
//    public static void main(String[] args) throws Exception {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        for (String ln; (ln = in.readLine()) != null; ) {
//            StringTokenizer st = new StringTokenizer(ln);
//            int m = Integer.parseInt(st.nextToken());
//            int R = Integer.parseInt(st.nextToken());
//            double D = Math.sqrt((R * R) + (R * R));
//            BigDecimal sol = new BigDecimal(0);
//            double[] sum = new double[m];
//            sum[0] = 2.;
//            for (int i = 1; i < m; ++i) {
//                sum[i] = sum[i - 1] + (2 * (i + 1));
//            }
//            for (int i = 0; i < m; ++i) {
//                int izq = i;
//                int der = m - i - 1;
//                sol = sol.add(new BigDecimal(2. * R));
//                if (izq >= 1) {
//                    sol = sol.add(new BigDecimal(2. * R + D));
//                    izq--;
//                    if (izq > 0) {
//                        sol = sol.add(new BigDecimal(sum[izq - 1] * R + (izq) * (2. * D)));
//                    }
//                }
//                if (der >= 1) {
//                    sol = sol.add(new BigDecimal(2. * R + D));
//                    der--;
//                    if (der > 0) {
//                        sol = sol.add(new BigDecimal(sum[der - 1] * R + (der) * (2. * D)));
//                    }
//                }
//            }
//            System.out.println(sol.divide(new BigDecimal(m), RoundingMode.HALF_UP).divide(new BigDecimal(m), RoundingMode.HALF_UP));
//        }
//    }
}
