import java.util.Scanner;

public class maiorEMedia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int contador = 0;

        do{
            System.out.println("Numero: ");
            numero = sc.nextInt();

            soma = numero + soma;

            if (numero > maior){
                maior = numero;
            }
            contador += 1;

        }while(contador < 5);

        System.out.println("Maior: "+ maior);
        System.out.println("Média: "+ (soma/5));

        sc.close();
    }
}