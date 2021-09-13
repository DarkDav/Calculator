import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a, b, c;

        try {

            String[] s = reader.readLine().split(" ");
            a = s[0];
            b = s[1];
            c = s[2];
            String[] romans = new String[]{"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            int x = s.length;
            if (x > 3) {
                throw new Exception();
            }

            if (Arrays.asList(romans).contains(s[0])) {

                if (b.equals("+")) {
                    RomanNumeral rom = RomanNumeral.valueOf(a);
                    RomanNumeral rows = RomanNumeral.valueOf(c);
                    int da = rom.getValue() + rows.getValue();
                    String H;
                    System.out.println(H = ToRoman.toRomawi(da));
                    if (da >= 101) {
                        throw new Exception();
                    }
                }
                if (b.equals("-")) {
                    RomanNumeral rom = RomanNumeral.valueOf(a);
                    RomanNumeral rows = RomanNumeral.valueOf(c);
                    int da = rom.getValue() - rows.getValue();
                    String H;
                    System.out.println(H = ToRoman.toRomawi(da));
                    if (da <= 0) {
                        throw new Exception();
                    }
                }

                if (b.equals("*")) {
                    RomanNumeral rom = RomanNumeral.valueOf(a);
                    RomanNumeral rows = RomanNumeral.valueOf(c);
                    int da = rom.getValue() * rows.getValue();
                    String H;
                    System.out.println(H = ToRoman.toRomawi(da));
                    if (da >= 101) {
                        throw new Exception();
                    }
                }

                if (b.equals("/")) {
                    RomanNumeral rom = RomanNumeral.valueOf(a);
                    RomanNumeral rows = RomanNumeral.valueOf(c);
                    int da = rom.getValue() / rows.getValue();
                    //System.out.println(RomanNumeral.toStr(da));
                    String H;
                    System.out.println(H = ToRoman.toRomawi(da));
                    if (da <= 0) {
                        throw new Exception();
                    }
                }
            } else {
                int q = Integer.parseInt(a);
                int w = Integer.parseInt(c);
                if (q > 10 || q == 0 || w > 10 || w == 0) {
                    throw new Exception();
                }

                if (b.equals("+")) {
                    int d;
                    System.out.println(d = q + w);
                }
                if (b.equals("-")) {
                    int d;
                    System.out.println(d = q - w);
                }
                if (b.equals("*")) {
                    int d;
                    System.out.println(d = q * w);
                }
                if (b.equals("/")) {
                    int d;
                    System.out.println(d = q / w);
                }
            }
        } catch (Exception t) {

            System.out.println("Throws Exception");
        }


    }
}

