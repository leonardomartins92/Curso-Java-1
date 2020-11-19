package classes;

import java.util.ArrayList;

public class Disciplina {
    private String descricao;
    public Lista<Avaliacao> avaliacoes;
    private String identificador;
    private static int id=1;

    public Disciplina(String descricao) {
        this.descricao = descricao;
        this.avaliacoes=new Lista<>();
        identificador="D"+id;
        id++;
    }

    public double mediaAvaliacoes(){
        int media=0;
        for (Avaliacao avaliacao:avaliacoes.listar()) {
          media+=avaliacao.getValor();
        }
        media /=avaliacoes.listar().size();
        return media;
     }

    @Override
    public String toString() {
        return "Disciplina{" +
                "descricao='" + descricao + '\'' +
                ", identificador='" + identificador + '\'' +
                '}';
    }
    public String listaAvaliacoes(){
        ArrayList av = new ArrayList();
        for (Avaliacao avaliacao: avaliacoes.listar()){
            av.add(avaliacao.getDescricao());
        }
        return "Avaliacoes:"+av;
    }

    public String getDescricao() {
        return descricao;
    }

}
