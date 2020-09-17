import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] parts = s.split(" ");

            String operator = parts[1];

            if (Number.isArabic(parts)) {
                ArabicCalc arabicCalc = new ArabicCalc();
                System.out.println(arabicCalc.calculate(parts[0], parts[2], operator));
            } else {
                RomanCalc romanCalc = new RomanCalc();
                System.out.println(romanCalc.calculate(parts[0], parts[2], operator));

            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("NO WAY! " + e.getMessage());
        }
    }
}




