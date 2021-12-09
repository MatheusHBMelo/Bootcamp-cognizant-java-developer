public class Main {
    public static void main(String[] args){

    // Calculado área do quadrado
    System.out.println("Área do quadrado: ");
    System.out.println(Calcular.calcularArea(2));
    System.out.println(Calcular.calcularArea(3));
    System.out.println(Calcular.calcularArea(5));
    System.out.println("");

    // Calculado área do retângulo
    System.out.println("Área do retângulo: ");
    System.out.println(Calcular.calcularArea(5, 6));
    System.out.println(Calcular.calcularArea(8, 5));
    System.out.println(Calcular.calcularArea(4, 2));
    System.out.println("");

    // Calculado área do trapézio
    System.out.println("Área do trapézio: ");
    System.out.println(Calcular.calcularArea(5, 3, 2));
    System.out.println(Calcular.calcularArea(10, 5, 3));
    System.out.println(Calcular.calcularArea(15, 10, 5));
    System.out.println("");
    } 
}
