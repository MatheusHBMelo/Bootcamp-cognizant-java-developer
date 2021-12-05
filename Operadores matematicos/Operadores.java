public class Operadores {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        float valor;

        //Adição
        valor = a + b;
        System.out.println("SOMA: "+ valor);

        //Subtração
        valor = a - b;
        System.out.println("SUBTRAÇÃO: "+ valor);

        //Multiplicação
        valor =  a * b;
        System.out.println("MULTIPLICAÇÃO: "+ valor);

        //Divisão
        valor = (float) a / b;
        System.out.println("DIVISÃO: "+ valor);

        //Modulo
        valor = a % b;
        System.out.println("MODULO: "+ valor);
        System.out.println("");

        // ++ e --
        valor = 15;
        System.out.println("VALOR: "+ valor);

        valor++;
        System.out.println("VALOR: "+ valor);

        valor--;
        System.out.println("VALOR: "+ valor);
        System.out.println("");

        // += | -= | *= | /= | %=
        valor = 10;
        System.out.println("VALOR: "+ valor);

        valor += 1;
        System.out.println("VALOR: "+ valor);

        valor -= 1;
        System.out.println("VALOR: "+ valor);

        valor *= 2;
        System.out.println("VALOR: "+ valor);

        valor /= 2;
        System.out.println("VALOR: "+ valor);

        valor %= 3;
        System.out.println("VALOR: "+ valor);
    }
}
