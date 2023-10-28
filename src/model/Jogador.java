package src.model;
import java.util.Random;

public class Jogador {

    private Coisa jogada;  // Atributo que representa a jogada do jogador

    // Construtor padrão que cria um jogador com uma jogada aleatória.
    public Jogador(){
        this.jogada = sorteioJogada();
    }
    
    // Construtor que permite criar um jogador com uma jogada específica com base no número fornecido.
    public Jogador(int num){
        switch (num){
            case 1:
                this.jogada = new Papel();
                break;

            case 2:
                this.jogada = new Pedra();
                break;

            case 3:
                this.jogada = new Tesoura();
                break;
        }
    }

    // Método para obter a jogada do jogador.
    public Coisa getJogada() {
        return jogada;
    }

    // Método privado que gera uma jogada aleatória para a cpu.
    private Coisa sorteioJogada(){
        Random random = new Random();
        int num = random.nextInt(3) + 1;

        if(num == 1){
            return new Papel();
        }
        else if(num == 2){ 
            return new Pedra();
        }
        else{ 
            return new Tesoura();
        }
    }
}
