package Lista08;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int numeMaiorQue10 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Coloque um número: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > 10 ) {
                    numeMaiorQue10++;
                }
            }
        }
        System.out.println("Existem "+numeMaiorQue10+" números maiores do que 10.");
    }
}