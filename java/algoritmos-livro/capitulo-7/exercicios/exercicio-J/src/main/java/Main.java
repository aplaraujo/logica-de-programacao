import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux, fat;
        int[] grupoA = new int[15];
        int[] grupoB = new int[15];
        int[] grupoC = new int[15];
        int[] grupoD = new int[15];
        int[] grupoE = new int[15];

        fat = 1;

        for (i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        System.out.println("===========================");

        for (i = 0; i < 15; i++) {
            System.out.print("B[" + i + "]: ");
            grupoB[i] = sc.nextInt();
        }

        for (i = 0; i < 15; i++) {
            grupoC[i] = grupoA[i] + grupoA[i];
        }

        for (i = 0; i < 15; i++) {
            fat = fat * grupoB[i];
            grupoD[i] = fat;
        }

        for (i = 0; i < 15; i++) {
            grupoE[i] = (grupoC[i] - grupoD[i]) + (grupoA[i] + grupoB[i]);
        }

        for (i = 0; i < 14; i++) {
            for (j = i+1; j < 15; j++) {
                if (grupoE[i] > grupoE[j]) {
                    aux = grupoE[i];
                    grupoE[i] = grupoE[j];
                    grupoE[j] = aux;
                }
            }
        }

        System.out.println("===========================");
        System.out.println("==== Vetor E ordenado =====");

        for (i = 0; i < 15; i++) {
            System.out.print(grupoE[i] + " ");
        }

        sc.close();
    }
}