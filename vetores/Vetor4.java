import java.util.Scanner;

public class Vetor4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] A = new int[15];
        double[] B = new double[15];
      

        System.out.println("Digite 15 números: ");
            for(int i = 0; i < A.length; i++){
                System.out.println("Valores do vetor A: ");
                A[i] = in.nextInt();
            }

            for(int i = 0; i < A.length; i++){
                B[i] = Math.sqrt(A[i]);
            }

        System.out.println("\nVetor A:");
            for(int i = 0; i < A.length; i++){
                System.out.println("A["+i+"]=" + A[i]);
            }

        System.out.println("\nVetor B:");
            for(int i = 0; i < A.length; i++){
                System.out.println("B["+i+"]=" + B[i]);
            }

        in.close();
    }
}