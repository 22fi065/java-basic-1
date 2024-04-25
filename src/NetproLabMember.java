import java.util.Random;

public class NetproLabMember {

    static int[][] keturon = new int[15][3];

    public static void main(String[] args) {
        int i = 0;
        int otoko;
        Random random = new Random(-10);
        Random randomIwai = new Random(-3);
        int randomSum;
        int randomA;
        double hontou = 1;
        for (; i < 15; i++) {
            // for(int bunrui=0;bunrui<2;bunrui++)
            // keturon[i][bunrui]
            // }
            randomSum = random.nextInt(10);
            randomA = randomIwai.nextInt(3);
            keturon[i][0] = 110 + randomSum;
            keturon[i][1] = 20 + i;
            keturon[i][2] = 10 + randomA;
            System.out.println("全校:" + keturon[i][0] + "岩井拳" + keturon[i][2] + "+i:" + i);

            otoko = keturon[i][0] - (keturon[i][0] * keturon[i][1]) / 100;
            long kakeru = 1;
            long kakeruotoko = 1;
            float a = 0;
            float b = 0;
            while (keturon[i][2] > a) {

                kakeru *= (keturon[i][0] - a);
                a++;
                kakeru /= a;
                // System.out.println("全校生徒岩井健の組み合わせ" + kakeru + "," + keturon[1][00] + "C" +
                // a);
            }

            while (keturon[i][2] > b) {
                kakeruotoko *= (otoko - b);
                b++;
                kakeruotoko /= b;
                // System.out.println("男" + otoko + "," + kakeruotoko);
            }
            hontou *= (double) kakeruotoko / kakeru;
            System.out.println("全員男" + kakeruotoko + "全体自傷" + kakeru
                    + "組み合わせ" + (double) kakeruotoko / kakeru);
        }
        System.out.println("組み合わせ" + hontou);
    }
}