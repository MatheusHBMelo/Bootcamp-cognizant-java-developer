public class Aviao {
    // Atributos
    private String marca;
    private String modelo;
    private String pais;
    private String cor;

    // Contrutores
    public Aviao(){

    }

    public Aviao(String marca, String modelo, String pais, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.pais = pais;
        this.cor = cor;
    }

    // Getters and Setters
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    // ToString
    @Override
    public String toString() {
        return "Aviao{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pais='" + pais + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    // Métodos
    public void decolar(){
        System.out.println("O avião está decolando!");
    }

    public void pousar(){
        System.out.println("O avião está pousando!");
    }
}
