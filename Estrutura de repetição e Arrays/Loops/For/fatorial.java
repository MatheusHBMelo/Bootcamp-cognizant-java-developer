import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;
        
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.print(fatorial +"! = "+ multiplicacao);

        sc.close();
    }
}