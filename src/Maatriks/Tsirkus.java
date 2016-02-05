package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad alt vasakult ja jõuavad üles vasakule.
 *
 * Näide 5*5 laual:
 * 30 29 28 27 26
 * 21 22 23 24 25
 * 20 19 18 17 16
 * 11 12 13 14 15
 * 10 9  8  7  6
 * 1  2  3  4  5
 */
public class Tsirkus {

    public static void main(String[] args) {
        int[][] maatrix = new int[10][10];
        for (int i = 0; i < maatrix.length; i++) {
            for (int j = 0; j < maatrix.length; j++) {
                if (i > j) {
                    maatrix[i][j] = maatrix.length - i;
                } else {
                    maatrix[i][j] = maatrix.length + j;
                }

            }
        }
            printMaatriks(maatrix);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] maatrix) {
        for (int i = 0; i < maatrix.length; i++) {
            System.out.println(Arrays.toString(maatrix[i]));
        }
        System.out.println("");
    }
}
