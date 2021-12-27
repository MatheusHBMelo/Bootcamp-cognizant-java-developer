import java.util.Scanner;

public class consoantes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] consoante = new String[6];
        int qtdConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = sc.nextLine();

            if( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") | 
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
                    consoante[count] = letra;
                    qtdConsoantes++;
            }
            count++;

        }while(count < consoante.length);

        System.out.println("Consoantes: "+ qtdConsoantes);

        for ( String soConsoante : consoante ){

            if (soConsoante != null){
                System.out.print(soConsoante + "");
            }
                
        }

        sc.close();
    }
}
