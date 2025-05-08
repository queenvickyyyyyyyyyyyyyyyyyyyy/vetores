import java.util.Scanner;

public class elementos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int [8];
        int[]B = new int [8];

        System.out.println("Digite 8 números: ");
            for(int i = 0; i < A.length; i++){
            System.out.println("Valores do vetor A: ");
            A[i] = in.nextInt();
        }

            for(int i = 0; i < A.length; i++){
                B[i] = A[i] * 2;
        }

        System.out.println("\nVetor A: ");
            for(int i = 0; i < A.length; i++){
                System.out.println("A["+i+"]=" + A[i]);
            }

        System.out.println("\nVetor B: ");
            for(int i = 0; i < B.length; i++){
                System.out.println("B["+i+"]=" + B[i]);
            }
    }
}
