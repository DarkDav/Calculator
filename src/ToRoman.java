import java.lang.StringBuilder;
import java.util.Scanner;

public class ToRoman {

    public static String toRomawi(int decimalNum)
    {


            StringBuilder oSB = new StringBuilder();
            int ribuan;
            int ratusan;
            int puluhan;
            int satuan;

            String[] ribu = {"","M","MM","MMM"};
            String[] ratus = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
            String[] puluh = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
            String[] satu = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

            ribuan  = decimalNum / 1000;
            ratusan = (decimalNum / 100 ) % 10;
            puluhan = (decimalNum / 10) % 10;
            satuan  = decimalNum % 10;

            oSB.append(ribu[ribuan]);
            oSB.append(ratus[ratusan]);
            oSB.append(puluh[puluhan]);
            oSB.append(satu[satuan]);

            return oSB.toString();
        }



    /*public static void main(String[] args) {
        // TODO Auto-generated method stub
        int     angka;
        String  romawi;

        System.out.print("Masukkan Angka: ");
        Scanner oScan = new Scanner(System.in);

        angka   = oScan.nextInt();

        romawi  = toRomawi(angka);
        System.out.print("Hasilnya: "+romawi);
    }*/

}