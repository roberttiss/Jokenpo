package src.model;

public class Tesoura extends Coisa {
    
    // Construtor da classe Tesoura que chama o construtor da classe base (Coisa) com o nome "Tesoura"
    public Tesoura() {
        super("Tesoura");
    }

    // Método sobrescrito que calcula o resultado de um confronto com outra coisa (player ou cpu)
    // Retorna 1 se player2 for do tipo Papel (Tesoura vence Papel)
    // Retorna -1 se player2 for do tipo Pedra (Pedra vence Tesoura)
    // Retorna 0 para empate
    @Override
    public int resultadConfronto(Coisa player2) {
        if (player2 instanceof Papel) {
            return 1;
        } else if (player2 instanceof Pedra) {
            return -1;
        } else {
            return 0;
        }
    }
}


