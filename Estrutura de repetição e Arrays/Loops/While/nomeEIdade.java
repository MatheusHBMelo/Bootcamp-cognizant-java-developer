import java.util.Scanner;

public class nomeEIdade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name;
        int age = 0;

        while(true){
            System.out.println("Nome: ");
            name = sc.next();

            if (name.equals("0")){
                break;
            }
            
            System.out.println("Idade: ");
            age = sc.nextInt();
        }

        System.out.println("O loop foi finalizado!");

        sc.close();
    }
}