package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Relatorio {

    public static ArrayList crescente(Aluno aluno) {
        ArrayList<Disciplina> historico = aluno.getHistoricoDisciplina();
        ArrayList listaAvaliação = new ArrayList<>();
        for (Disciplina d : historico) {
            ArrayList<Avaliação> lista = d.getListaAvaliações();
            for (Avaliação av : lista) {
                listaAvaliação.add(av);
            }
        }

        return listaAvaliação;
    }
}


