import java.util.Scanner;

public class Vetor12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++){
            System.out.print("A["+i+"]: ");
            A[i] = in.nextInt();
            soma += A[i]; 
        }

        System.out.println("\nSoma dos números: " + soma);

        in.close();
    }
}
