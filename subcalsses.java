public class Carro extends Veiculo {
    private int numeroDePortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, double preco, int numeroDePortas) {
        super(marca, modelo, ano, preco); // Chama o construtor da classe base
        this.numeroDePortas = numeroDePortas;
    }

    // Getter e Setter
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o método da classe base
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}

public class Moto extends Veiculo {
    private boolean temBagageiro;

    // Construtor
    public Moto(String marca, String modelo, int ano, double preco, boolean temBagageiro) {
        super(marca, modelo, ano, preco);
        this.temBagageiro = temBagageiro;
    }

    // Getter e Setter
    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tem Bagageiro: " + (temBagageiro ? "Sim" : "Não"));
    }
}
