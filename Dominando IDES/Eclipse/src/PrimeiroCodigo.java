
public class PrimeiroCodigo {

	public static void main(String[] args) {
		Gato gato1 =  new Gato();
		
		gato1.setNome("Tom");
		gato1.setRaca("American");
		gato1.setIdade(3);
		
		Gato gato2 =  new Gato("James", "African", 4);
		
		System.out.printf("O primeiro gato se chama %s, ele é da raça %s e possui %d anos.%n", gato1.getNome(), gato1.getRaca(), gato1.getIdade());
		System.out.printf("O segundo gato se chama %s, ele é da raça %s e possui %d anos.", gato2.getNome(), gato2.getRaca(), gato2.getIdade());
	}
}
