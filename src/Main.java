import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        int numeros[] = new int[20];
        Scanner scanner = new Scanner(System.in);
        int numerosPares = 0;

        for(int i =0;i<20;i++){
            System.out.println("Digite um numero ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0 ){
                numerosPares = numerosPares + 1;
            }
        }
        System.out.println("Quantos numeros pares foram digitados: " + numerosPares);
    }
}