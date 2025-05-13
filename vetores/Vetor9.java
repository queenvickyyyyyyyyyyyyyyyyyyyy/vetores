import java.util.Scanner;

public class Vetor9 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int[] A = new int [10];
        int[] B = new int [10];
        int[] C = new int [10];

        System.out.println("Digite 10 números: ");
            for(int i = 0; i < A.length; i++){
                System.out.println("Digite os números do vetor A: ");
                A[i] = in.nextInt();
            }

        System.out.println("Digite 10 números: ");
            for(int i = 0; i < B.length; i++){
                System.out.println("Digite os números do vetor B: ");
                B[i] = in.nextInt();
            }

            for(int i = 0; i < A.length; i++){
                C[i] = A[i] / B[i];
            }

        System.out.println("\nVetor A: ");
            for(int i = 0; i < A.length; i++){
                System.out.println("A["+i+"]=" + A[i]);
            }

        System.out.println("\nVetor B: ");
            for(int i = 0; i < B.length; i++){
                System.out.println("B["+i+"]=" + B[i]);
            }

        System.out.println("\nVetor C: ");
            for(int i = 0; i < C.length; i++){
                System.out.println("C["+i+"]=" + C[i]);
            }
    }
}
