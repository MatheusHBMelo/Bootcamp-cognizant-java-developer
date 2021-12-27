import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(tabuada + "X" + i + " = " + (tabuada*i));
        }

        sc.close();
    }
}
