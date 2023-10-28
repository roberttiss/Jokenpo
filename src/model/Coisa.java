package src.model;

public abstract class Coisa {

    private String nome;

    // Construtor da classe Coisa que recebe um nome como parâmetro(pedra,papel,tesoura)
    public Coisa(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome da coisa(pedra,papel,tesoura)
    public String getNome() {
        return nome;
    }

    // Método abstrato para calcular o resultado do confronto com outra coisa (player ou cpu)
    // A implementação deste método será fornecida nas subclasses.
    public abstract int resultadConfronto(Coisa player2);
}
