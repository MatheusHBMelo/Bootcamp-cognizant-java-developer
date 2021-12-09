public class Calcular {

    // Área retângulo
    public static double calcularArea(double base, double altura){
        return base * altura;
    }

    // Área quadrado
    public static double calcularArea(double lado){
        return lado *= lado;
    }

    // Área do trapézio
    public static double calcularArea(double Base, double base, double altura){
        return ((Base + base)*altura) / 2;
    }
}
