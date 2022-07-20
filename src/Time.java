import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nomeTime;
    private List<Jogador> jogadores = new ArrayList<>();

    public Time(String nomeTime, List<Jogador> jogadores){
        this.nomeTime = nomeTime;
        this.jogadores = jogadores;
    }

    public void listarJogadores(Tipo posicao){

        System.out.println(nomeTime + " (" + posicao + "):\n");
        jogadores.stream().
                filter(f -> f.getPosicao() == posicao).
                map(e -> e.getNome()).
                forEach(System.out::println);
        System.out.println("===========================\n");
        
    }

}
