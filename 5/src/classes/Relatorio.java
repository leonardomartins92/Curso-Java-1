package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Relatorio {

    public static ArrayList crescente(Aluno aluno) {
        ArrayList<Disciplina> historico = aluno.getHistoricoDisciplina();
        ArrayList<Avaliação> listaAvaliação = new ArrayList<>();

        for (Disciplina d : historico) {
            ArrayList<Avaliação> lista = d.getListaAvaliações();
            for (Avaliação av : lista) {
                listaAvaliação.add(av);
            }
        }

        Collections.sort(listaAvaliação, Relatorio.comparaValor);
        return listaAvaliação;
    }

    public static ArrayList decrescente(Aluno aluno) {
        ArrayList<Avaliação> listaOrdenada;
        listaOrdenada=Relatorio.crescente(aluno);
        Collections.reverse(listaOrdenada);
        return listaOrdenada;
    }

    public static ArrayList alfabetico(Aluno aluno){
        ArrayList<Disciplina> historico = aluno.getHistoricoDisciplina();
        Collections.sort(historico, Relatorio.comparaAlfabetico);
        return historico;
    }

    public static Comparator<Avaliação> comparaValor = (v1, v2) -> {
       int valor1 = v1.getValor();
       int valor2 = v2.getValor();

       return valor1-valor2;
    };

    public static Comparator<Disciplina> comparaAlfabetico = (disciplina1, disciplina2) -> {
        String nomeDisciplina1 = disciplina1.getDescrição().toUpperCase();
        String nomeDisciplina2 = disciplina2.getDescrição().toUpperCase();

        return nomeDisciplina1.compareTo(nomeDisciplina2);
    };
}







