public class Jogador {

    private String nomeJogador;
    private Tipo posicao;

    public Jogador(String nomeJogador, Tipo posicao){
        this.nomeJogador = nomeJogador;
        this.posicao = posicao;
    }

    public String getNome() {
        return nomeJogador;
    }

    public Tipo getPosicao() {
        return posicao;
    }

    
    
}
