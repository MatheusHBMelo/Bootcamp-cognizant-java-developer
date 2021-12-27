import java.util.Scanner;

public class parEImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero = 0, qtdNumeros = 0;
        int pares = 0, impares = 0;

        System.out.println("Digite a quantidade de numeros: ");
        qtdNumeros = sc.nextInt();

        int count = 0;

        do{
            System.out.println("Numero: ");
            numero = sc.nextInt();

            if (numero % 2 == 0){
                pares += 1;
            }else{
                impares += 1;
            }

            count++;
        }while(count < qtdNumeros);

        System.out.println("PARES: "+ pares);
        System.out.println("IMPARES: "+ impares);

        sc.close();
    }
}
