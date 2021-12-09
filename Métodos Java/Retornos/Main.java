public class Main{
    public static void main(String[] args){
        // Retorna int
        System.out.println(Retorno.somarNumeros(15, 30));
        System.out.println("");

        // Retorna String
        System.out.println(Retorno.retornarNome("Alexandre Caetano"));
        System.out.println("");

        // Retorna Char
        System.out.println(Retorno.letraNome('D'));
        System.out.println("");

        // Retorna Float
        System.out.println(Retorno.descontaSalario(5000f, 1540f));
        System.out.println("");

        // Retorna Double
        System.out.println(Retorno.somarDinheiro(3.50, 15.48));
        System.out.println("");

        // Retorna Long
        System.out.println(Retorno.juntaCpf(12345678911l));
        System.out.println("");

        // Retorna VOID
        Retorno.nomeCompleto();
    }
}