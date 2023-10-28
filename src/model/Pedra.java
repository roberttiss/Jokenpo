package src.model;

public class Pedra extends Coisa{

    // Construtor da classe Pedra que chama o construtor da classe base (Coisa) com o nome "Pedra"
    public Pedra(){
        super("Pedra");
    }

    // Método sobrescrito que calcula o resultado de um confronto com outra coisa (player ou cpu)
    // Retorna 1 se player2 for do tipo Tesoura (Pedra vence Tesoura)
    // Retorna -1 se player2 for do tipo Papel (Papel vence Pedra)
    // Retorna 0 para empate
    @Override
    public int resultadConfronto(Coisa player2){
        if (player2 instanceof Tesoura) {
            return 1;
        } else if (player2 instanceof Papel) {
            return -1;
        } else {
            return 0;
        }
    }
}

