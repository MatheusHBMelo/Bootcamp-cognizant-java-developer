import java.util.Scanner;

public class nota {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma nota: ");
            int nota = sc.nextInt();

            if (nota < 0 | nota > 10){
                System.out.println("Valor inválido!");
                break;
            }
        }
        sc.close();
    }
}
