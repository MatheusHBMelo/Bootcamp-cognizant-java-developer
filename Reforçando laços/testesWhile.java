import java.util.Scanner;

public class testesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Crie um programa para ler 4 notas e mostrar a média delas.
        double soma = 0.0, nota = 0.0, media = 0.0;
        int contador = 0;

        while(contador < 4){
            System.out.println("Digite uma nota: ");
            nota = sc.nextDouble();

            soma = soma + nota;
            contador++;
        }
        media = soma / contador;
        System.out.println("Média: "+ media);

        //2. Faça um programa que lê caracteres até que o usuário digite a letra z.
        char letra = '\0';

        while (letra != 'z'){
            System.out.println("Digite uma letra: ");
            letra = sc.next().charAt(0);
        }
        System.out.println("Letra (Z) detectada - Código cancelado!");

        //3. Escreva um aplicativo que mostre todos os números ímpares de 1 até 100.
        int count = 0;
        while (count <= 100){
            if (count % 2 != 0){
                System.out.println(count);
            }
            count++;
        }

        //4. Escreva um aplicativo que mostre todos os números pares de 1 até 100. 
        int contador2 = 0;
        while (contador2 <= 100){
            if (contador2 % 2 == 0){
                System.out.println(contador2);
            }
            contador2++;
        }
    }
}
