public class Emprestimo {
    public static void calcularEmprestimo(double valor, int taxa){
        if (taxa == 2){
            double valorFinal = valor + (valor * 0.25);

            System.out.println("VALOR TOTAL PARA DUAS PARCELAS: R$"+ valorFinal);
        } else if (taxa == 3){
            double valorFinal = valor + (valor * 0.45);

            System.out.println("VALOR TOTAL PARA TRÊS PARCELAS: R$"+ valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
