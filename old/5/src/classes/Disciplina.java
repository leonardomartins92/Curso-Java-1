package classes;
import java.util.ArrayList;

public class Disciplina {
    private String descricao;
    private  ArrayList<Avaliacao> listaAvaliacoes;
    private String identificador;

    private static int id=1;

    public Disciplina(String descricao) {
        this.descricao = descricao;
        this.listaAvaliacoes = new ArrayList<>();
        identificador="D"+id;
        id++;

    }

    public double mediaAvaliacoes(){
       int media=0;
        for (Avaliacao avaliacao:listaAvaliacoes) {
          media+=avaliacao.getValor();
        }
        media /=listaAvaliacoes.size();
        return media;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "descricao='" + descricao + '\'' +
                ", listaAvaliacoes=" + listaAvaliacoes +
                ", identificador='" + identificador + '\''+
                '}'+'\n';
    }

    public String consultaAvaliacao(Avaliacao avaliacao) {
        if (listaAvaliacoes.contains(avaliacao)) {
            return "A avaliacao " + avaliacao.getDescricao() + " existe na lista";
        } else {
            return "A avaliacao " + avaliacao.getDescricao() + " não existe na lista";
        }

    }

    public void adicionaAvaliacao(Avaliacao avaliacao){
        listaAvaliacoes.add(avaliacao);
    }

    public void removeAvaliacao(Avaliacao avaliacao){
        listaAvaliacoes.remove(avaliacao);
    }

    public String listaAvaliacoes(){
        ArrayList av = new ArrayList();
        for (Avaliacao avaliacao: listaAvaliacoes){
            av.add(avaliacao.getDescricao());
        }
        return "Avaliacoes:"+av;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

}
