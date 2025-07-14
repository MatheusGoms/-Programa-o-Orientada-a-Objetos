1. Pilares da POO
Abstração: Refere-se à habilidade de modelar objetos do mundo real no código, capturando apenas as características relevantes. Por exemplo, um "Carro" pode ser representado em termos de atributos como marca, modelo, ano e métodos como acelerar() e frear().

Encapsulamento: Diz respeito a esconder os detalhes internos de um objeto, permitindo o acesso a eles apenas por meio de métodos públicos (getters e setters). Isso ajuda a proteger os dados e a manter a integridade do objeto.

Herança: Permite que uma classe herde atributos e métodos de outra classe, promovendo reutilização de código. Por exemplo, uma classe Caminhao pode herdar características de uma classe Veiculo.

Polimorfismo: É a capacidade de um objeto se comportar de diferentes maneiras dependendo do contexto. Em Java, isso é alcançado por meio de métodos sobrescritos (overriding) e sobrecarregados (overloading).


Como o Exemplo Aplica os Pilares da POO?
Abstração:

A classe Veiculo captura as características essenciais de um veículo (marca, modelo, ano, preço).
As subclasses Carro e Moto estendem essa abstração, adicionando atributos específicos como numeroDePortas e temBagageiro.
Encapsulamento:

Os atributos são privados (private) e acessados por meio de métodos públicos (getters e setters), garantindo controle sobre os dados.
Herança:

Carro e Moto herdam os atributos e métodos de Veiculo, reutilizando o código base.
Polimorfismo:

O método exibirDetalhes() é sobrescrito (overridden) em Carro e Moto, permitindo que objetos dessas classes se comportem de maneira diferente ao serem chamados pelo tipo base Veiculo.


Saída do Código:

Detalhes do Carro:
Marca: Toyota
Modelo: Corolla
Ano: 2022
Preço: R$ 120000.0
Número de Portas: 4

Detalhes da Moto:
Marca: Honda
Modelo: CB500
Ano: 2023
Preço: R$ 35000.0
Tem Bagageiro: Sim
