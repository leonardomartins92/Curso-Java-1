package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Relatorio {

    public static ArrayList crescente(Aluno aluno) {
        ArrayList<Disciplina> historico = aluno.getHistoricoDisciplina();
        ArrayList<Avaliação> listaAvaliação = new ArrayList<>();
        ArrayList<Avaliação> listaOrdenada = new ArrayList<>();

        for (Disciplina d : historico) {
            ArrayList<Avaliação> lista = d.getListaAvaliações();
            for (Avaliação av : lista) {
                listaAvaliação.add(av);
            }
        }

        Collections.sort(listaAvaliação, Relatorio.comparaValor);
        for(Avaliação av: listaAvaliação){
            listaOrdenada.add(av);
        }
        return listaOrdenada;
    }

    public static ArrayList decrescente(Aluno aluno) {
        ArrayList<Avaliação> listaOrdenada;
        listaOrdenada=Relatorio.crescente(aluno);
        Collections.reverse(listaOrdenada);
        return listaOrdenada;
    }

    public static Comparator<Avaliação> comparaValor = (v1, v2) -> {
       int valor1 = v1.getValor();
       int valor2 = v2.getValor();

       return valor1-valor2;
    };
}







