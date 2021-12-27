import java.util.Random;

import java.util.random.*;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = aleatorio.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("\nAntecessor: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero-1) + " ");
        }

        System.out.println("\nNumeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessor: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero+1) + " ");
        }
    }
}
