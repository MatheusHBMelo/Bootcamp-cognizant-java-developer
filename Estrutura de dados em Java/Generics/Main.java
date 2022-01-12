public class Main {
    public static void main(String[] args) {

        //* Instanciando NÓ
        No<String> n1 = new No<>("Conteudo 1");

        No<String> n2 = new No<>("Conteudo 2");
        n1.setProximoNo(n2);

        No<String> n3 = new No<>("Conteudo 3");
        n2.setProximoNo(n3);

        No<String> n4 = new No<>("Conteudo 4");
        n3.setProximoNo(n4);

        No<String> n5 = new No<>("Conteudo 5");
        n4.setProximoNo(n5);

        //! n1 > n2 > n3 > n4 > n5 > null

        //* Resultados
        System.out.println(n1);
        System.out.println("\n"+ n1.getProximoNo());
        System.out.println("\n"+ n1.getProximoNo().getProximoNo());
        System.out.println("\n"+ n1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println("\n"+ n1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        System.out.println("\n"+ n1.getProximoNo().getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
