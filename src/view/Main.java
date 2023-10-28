package src.view;

import javax.swing.JOptionPane;
import src.model.*;

public class Main{
    public static final String JOGO = "Jokenpo";
    public static final String RODADA = "Número de jogos";
    public static final String JOGADA = "Escolha sua jogada";
    public static void main(String[] args) {

        int opcao;
        String sair = "";

        do{
            opcao = menu();
            switch(opcao){
                case 1:
                    playerXplayer();
                    break;
                case 2:
                    playerXCPU();
                    break;
                case 3:
                    CPUXCPU();
                    break;

                default:
                    sair = "Obrigado por jogar - _ -";
            }
            mostramsg(sair);
        }while(opcao != 4 && opcao > 0);
    }

    public static void playerXplayer(){
        int win1 = 0 ;
        int win2 = 0;
        int jogos = rodada();
        String vencedor = "";

        if(jogos == 1){          
            Jogador Player1 = new Jogador(jogada());
            Jogador Player2 = new Jogador(jogada());

            Coisa jogadaJogador1 = Player1.getJogada();
            Coisa jogadaJogador2 = Player2.getJogada();
            int resultado = jogadaJogador1.resultadConfronto(jogadaJogador2);

            if (resultado == 1) {
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nPlayer2 escolheu " +jogadaJogador2.getNome()+ "\nPlayer1 venceu";
            } else if (resultado == -1) {
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nPlayer2 escolheu " +jogadaJogador2.getNome()+ "\nPlayer2 venceu";
            } else {
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nPlayer2 escolheu " +jogadaJogador2.getNome()+ "\nEmpate";
            }

            mostramsg(vencedor);
        }
        else{
            for(int i = 0; i != 3; i++){
            Jogador Player1 = new Jogador(jogada());
            Jogador Player2 = new Jogador(jogada());

            Coisa jogadaJogador1 = Player1.getJogada();
            Coisa jogadaJogador2 = Player2.getJogada();
            int resultado = jogadaJogador1.resultadConfronto(jogadaJogador2);

            if (resultado == 1) {
                win1++;
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nPlayer2 escolheu " +jogadaJogador2.getNome()+ "\nPlayer1 venceu";
            } else if (resultado == -1) {
                win2++;
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nPlayer2 escolheu " +jogadaJogador2.getNome()+ "\nPlayer2 venceu";
            } else {
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nPlayer2 escolheu " +jogadaJogador2.getNome()+ "\nEmpate";
            }
            mostramsg(vencedor);
            }

            if(win1 > win2){
                vencedor = "Player1 venceu a melhor de 3 por " + win1 + " a " + win2;
            }
            else if(win1 < win2){
                vencedor = "Player2 venceu a melhor de 3 por " + win2 + " a " + win1;
            }
            else{
                vencedor = "A melhor de 3 terminou empatada";
            }

            mostramsg(vencedor);
        }
    }

    public static void playerXCPU(){
        int win1 = 0 ;
        int win2 = 0;
        int jogos = rodada();
        String vencedor = "";

        if(jogos == 1){          
            Jogador Player1 = new Jogador(jogada());
            Jogador CPU1 = new Jogador();

            Coisa jogadaJogador1 = Player1.getJogada();
            Coisa jogadaJogador2 = CPU1.getJogada();
            int resultado = jogadaJogador1.resultadConfronto(jogadaJogador2);

            if (resultado == 1) {
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nCPU1 escolheu " +jogadaJogador2.getNome()+ "\nPlayer1 venceu";
            } else if (resultado == -1) {
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nCPU1 escolheu " +jogadaJogador2.getNome()+ "\nCPU1 venceu";
            } else {
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nCPU1 escolheu " +jogadaJogador2.getNome()+ "\nEmpate";
            }

            mostramsg(vencedor);
        }
        else{
            for(int i = 0; i != 3; i++){
            Jogador Player1 = new Jogador(jogada());
            Jogador CPU1 = new Jogador();

            Coisa jogadaJogador1 = Player1.getJogada();
            Coisa jogadaJogador2 = CPU1.getJogada();
            int resultado = jogadaJogador1.resultadConfronto(jogadaJogador2);

            if (resultado == 1) {
                win1++;
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nCPU1 escolheu " +jogadaJogador2.getNome()+ "\nPlayer1 venceu";
            } else if (resultado == -1) {
                win2++;
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nCPU1 escolheu " +jogadaJogador2.getNome()+ "\nCPU1 venceu";
            } else {
                vencedor = "Player1 escolheu " +jogadaJogador1.getNome()+ "\nCPU1 escolheu " +jogadaJogador2.getNome()+ "\nEmpate";
            }
            mostramsg(vencedor);
            }

            if(win1 > win2){
                vencedor = "Player1 venceu a melhor de 3 por " + win1 + " a " + win2;
            }
            else if(win1 < win2){
                vencedor = "CPU1 venceu a melhor de 3 por " + win2 + " a " + win1;
            }
            else{
                vencedor = "A melhor de 3 terminou empatada";
            }
            mostramsg(vencedor);
        }
    }

    public static void CPUXCPU(){
        int win1 = 0 ;
        int win2 = 0;
        String vencedor = "";
        int jogos = rodada();
        if(jogos == 1){          
            Jogador CPU1 = new Jogador();
            Jogador CPU2 = new Jogador();

            Coisa jogadaJogador1 = CPU1.getJogada();
            Coisa jogadaJogador2 = CPU2.getJogada();
            int resultado = jogadaJogador1.resultadConfronto(jogadaJogador2);

            if (resultado == 1) {
                vencedor = "CPU1 escolheu " +jogadaJogador1.getNome()+ "\nCPU2 escolheu " +jogadaJogador2.getNome()+ "\nCPU1 venceu";
                mostramsg(vencedor);
            } else if (resultado == -1) {
                vencedor = "CPU1 escolheu " +jogadaJogador1.getNome()+ "\nCPU2 escolheu " +jogadaJogador2.getNome()+ "\nCPU2 venceu";
                mostramsg(vencedor);
            } else {
                vencedor = "CPU1 escolheu " +jogadaJogador1.getNome()+ "\nCPU2 escolheu " +jogadaJogador2.getNome()+ "\nEmpate";
                mostramsg(vencedor);
            }
        }
        else{
            for(int i = 0; i != 3; i++){
            Jogador CPU1 = new Jogador();
            Jogador CPU2 = new Jogador();

            Coisa jogadaJogador1 = CPU1.getJogada();
            Coisa jogadaJogador2 = CPU2.getJogada();
            int resultado = jogadaJogador1.resultadConfronto(jogadaJogador2);

            if (resultado == 1) {
                win1++;
                vencedor = "CPU1 escolheu " +jogadaJogador1.getNome()+ "\nCPU2 escolheu " +jogadaJogador2.getNome()+ "\nCPU1 venceu";
                mostramsg(vencedor);
            } else if (resultado == -1) {
                win2++;
                vencedor = "CPU1 escolheu " +jogadaJogador1.getNome()+ "\nCPU2 escolheu " +jogadaJogador2.getNome()+ "\nCPU2 venceu";
                mostramsg(vencedor);
            } else {
                vencedor = "CPU1 escolheu " +jogadaJogador1.getNome()+ "\nCPU2 escolheu " +jogadaJogador2.getNome()+ "\nEmpate";
                mostramsg(vencedor);
            }
            }

            if(win1 > win2){
                vencedor = "CPU1 venceu a melhor de 3 por " + win1 + " a " + win2;
                mostramsg(vencedor);
            }
            else if(win1 < win2){
                vencedor = "CPU2 venceu a melhor de 3 por " + win2 + " a " + win1;
                mostramsg(vencedor);
            }
            else{
                vencedor = "A melhor de 3 terminou empatada";
                mostramsg(vencedor);
            }
        }
    }


    public static int menu() {
        Object menuOpcoes[] = {"", "Player 1 vs Player 2", "Player 1 vs CPU", "CPU 1 vs CPU 2", "Sair"};
        String resposta;
    
        resposta = (String) JOptionPane.showInputDialog(null, 
            "Selecione uma opção no menu.",
            JOGO,
            JOptionPane.QUESTION_MESSAGE,
            null,
            menuOpcoes,
            menuOpcoes[0]
        );
    
        if (resposta != null) {
            if (resposta.equals(menuOpcoes[1])) {
                return 1;
            } else if (resposta.equals(menuOpcoes[2])) {
                return 2;
            } else if (resposta.equals(menuOpcoes[3])) {
                return 3;
            } else {
                return 4;
            }
        } else {
            return -1; 
        }
    }
    

    public static int rodada(){
        Object menuOpcoes[] = {"","Confronto único", "Melhor de 3"};
        String resposta;

        resposta = (String) JOptionPane.showInputDialog(null, 
            "Selecione uma opção no menu.",
            RODADA,
            JOptionPane.QUESTION_MESSAGE,
            null,
            menuOpcoes,
            menuOpcoes[0]
        );
        
        if (resposta != null) {
        if(resposta.equals(menuOpcoes[1])){
            return 1;
        }else{
            return 2;
        } 
        } else {
            return -1; 
        } 
    }

    public static int jogada(){
        Object menuOpcoes[] = {"","Papel", "Pedra", "Tesoura"};
        String resposta;

        resposta = (String) JOptionPane.showInputDialog(null, 
            "Selecione uma opção no menu.",
            JOGADA,
            JOptionPane.QUESTION_MESSAGE,
            null,
            menuOpcoes,
            menuOpcoes[0]
        );
        
        if (resposta != null) {
        if(resposta.equals(menuOpcoes[1])){
            return 1;
        }else if(resposta.equals(menuOpcoes[2])){
            return 2;
        }else{
            return 3;
        }
        } else {       
            return -1; 
        } 
    }

    public static void mostramsg(String mensagem) {
        if (mensagem != null && !mensagem.isEmpty()) {
            JOptionPane.showMessageDialog(null, mensagem, JOGO, JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
