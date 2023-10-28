package src.model;

public class Papel extends Coisa {
    
    // Construtor da classe Papel que chama o construtor da classe base (Coisa) com o nome "Papel"
    public Papel(){
        super("Papel");
    }

    // Método sobrescrito que calcula o resultado de um confronto com outra coisa (player ou cpu)
    // Retorna 1 se player2 for do tipo Pedra (Papel vence Pedra)
    // Retorna -1 se player2 for do tipo Tesoura (Tesoura vence Papel)
    // Retorna 0 para empate
    @Override
    public int resultadConfronto(Coisa player2){
        if (player2 instanceof Pedra) {
            return 1;
        } else if (player2 instanceof Tesoura) {
            return -1;
        } else {
            return 0;
        }
    }
}
