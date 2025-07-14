public class LojaDeVeiculos {
    public static void main(String[] args) {
        // Criar objetos
        Veiculo carro = new Carro("Toyota", "Corolla", 2022, 120000, 4);
        Veiculo moto = new Moto("Honda", "CB500", 2023, 35000, true);

        // Exibir detalhes (Polimorfismo em ação)
        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();

        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
    }
}
