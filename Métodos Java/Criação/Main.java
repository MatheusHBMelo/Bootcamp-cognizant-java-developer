public class Main{
    public static void main(String[] args){
        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(18);
        Mensagem.obterMensagem(5);
        System.out.println("");

        // Calculadora
        System.out.println("Exercício calculadora");
        System.out.println(Calculadora.somar(3, 6));
        System.out.println(Calculadora.subtrair(9, 4));
        System.out.println(Calculadora.multiplicar(9, 5));
        System.out.println(Calculadora.dividir(6, 3));
        System.out.println("");

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcularEmprestimo(1000, 2);
        Emprestimo.calcularEmprestimo(1000, 3);
        Emprestimo.calcularEmprestimo(1000, 5);
        System.out.println("");
    }
}