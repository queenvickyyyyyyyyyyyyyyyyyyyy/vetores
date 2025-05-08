import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite 5 números: ");
            for(int i = 0; i < A.length; i++){
            System.out.println("Valores do vetor A: ");
            A[i] = in.nextInt();
        }
            for(int i = 0; i < A.length; i++){
                B[i] = A[i];
            }

        System.out.println("\nVetor A:");
        for(int i = 0; i < A.length; i ++){
            System.out.println("A["+i+"]=" + A[i]);
        }
        System.out.println("\nVetor B:");
        for(int i = 0; i < B.length; i ++){
            System.out.println("B["+i+"]=" + B[i]);
        }
    }
}
