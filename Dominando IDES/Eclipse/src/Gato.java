public class Gato {
	private String nome;
	private String raca;
	private int idade;
	
	public Gato() {
		
	}
	
	public Gato(String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	
	// Gettera and Setters
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//ToString
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", raca=" + raca + ", idade=" + idade + "]";
	}
}
