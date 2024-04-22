import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class HowOldAreYou {
    private static int age;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Year.now());
        Year time = Year.now();
        System.out.println(time.getValue());
        try {
            System.out.println("何歳ですか?");
            String line = reader.readLine();
            if(line!="q"||line!="e"){
            int age = Integer.parseInt(line);
            if (age < 6) {
                System.out.println("令和");// 2019
            } else if (6 <= age && age < 35) {
                System.out.println("平成");// 1989
            } else if (age >= 36 && age < 96) {
                System.out.println("昭和");// 1928

            }
            System.out.println("あなたは" + age + "歳ですね。");
            System.out.println("あなたは2030年、" + +(2030 - time.getValue() + age) + "歳ですね。");
        } catch (IOException e) {
            System.out.println(e);
        }
        }
    }
}
