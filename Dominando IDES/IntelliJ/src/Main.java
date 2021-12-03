public class Main {
    public static void main(String[] args){
        Aviao av1 = new Aviao();

        av1.setMarca("KLM");
        av1.setModelo("777-200");
        av1.setPais("Holanda");
        av1.setCor("Azul");

        Aviao av2 = new Aviao("GOL", "737-700", "Brasil", "Laranja");

        System.out.printf("AV1 - Marca: %s| Modelo: %s| Pais: %s| Cor: %s%n", av1.getMarca(), av1.getModelo(), av1.getPais(), av1.getCor());
        System.out.printf("AV2 - Marca: %s| Modelo: %s| Pais: %s | Cor: %s", av2.getMarca(), av2.getModelo(), av2.getPais(), av2.getCor());
    }
}
