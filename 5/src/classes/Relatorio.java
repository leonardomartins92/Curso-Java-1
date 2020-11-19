package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Relatorio {

    public static ArrayList crescente(Aluno aluno) {
        ArrayList<Disciplina> historico = aluno.getHistoricoDisciplina();
        ArrayList<Avaliacao> listaAvaliacao = new ArrayList<>();

        for (Disciplina d : historico) {
            ArrayList<Avaliacao> lista = d.getListaAvaliacoes();
            for (Avaliacao av : lista) {
                listaAvaliacao.add(av);
            }
        }

        Collections.sort(listaAvaliacao, Relatorio.comparaValor);

        return (ArrayList) listaAvaliacao.clone();
    }

    public static ArrayList decrescente(Aluno aluno) {
        ArrayList<Avaliacao> listaOrdenada;
        listaOrdenada=Relatorio.crescente(aluno);
        Collections.reverse(listaOrdenada);

       return (ArrayList) listaOrdenada.clone();
    }

    public static ArrayList alfabetico(Aluno aluno){
        ArrayList<Disciplina> historico = aluno.getHistoricoDisciplina();
        Collections.sort(historico, Relatorio.comparaAlfabetico);

        return (ArrayList) historico.clone();
    }

    private static Comparator<Avaliacao> comparaValor = (v1, v2) -> {
       int valor1 = v1.getValor();
       int valor2 = v2.getValor();

       return valor1-valor2;
    };

    private static Comparator<Disciplina> comparaAlfabetico = (disciplina1, disciplina2) -> {
        String nomeDisciplina1 = disciplina1.getDescricao().toUpperCase();
        String nomeDisciplina2 = disciplina2.getDescricao().toUpperCase();

        return nomeDisciplina1.compareTo(nomeDisciplina2);
    };
}







