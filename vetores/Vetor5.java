import java.util.Scanner;

public class Vetor5 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int[] A = new int[10];
        int[] B = new int [10];

        System.out.println("Digite 10 números: ");
            for(int i = 0; i < A.length; i++){
                System.out.println("Digite os valores do vetor A: ");
                A[i] = in.nextInt();
            }

            for(int i = 0; i < A.length; i++){
                B[i] = A[i] * i;
            }

        System.out.println("\nVetor A: ");
            for(int i = 0; i < A.length; i++){
                System.out.println("A["+i+"]=" + A[i]);
            }
        
        System.out.println("\nVetor B: ");
            for(int i = 0; i < B.length; i++){
                System.out.println("B["+i+"]=" + B[i]);
            }

        in.close();
    }
}
