package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ranking {
    public static void calculaRanking(Aluno aluno) {
        if (aluno.getHistoricoDisciplina().isEmpty()) {
            return;
        } else {
            if(!Aluno.alunos.contains(aluno)) {
                Aluno.alunos.add(aluno);
            }
            double ira = aluno.calculaIra();
            if (ira >= 89) {
                aluno.setRank("A");
            } else if (ira > 69 && ira < 89) {
                aluno.setRank("B");
            } else {
                aluno.setRank("C");
            }
        }
    }

    public static ArrayList<Aluno> listaRanking(){
        return Aluno.alunos;

    }

    public static String consultaRanking(Aluno aluno){
       return aluno.getRank();
    }

    public static void atualizaRanking(){
       ArrayList<Aluno> listaAlunos=Aluno.alunos;
       for (Aluno a:listaAlunos){
            calculaRanking(a);
       }
    }
}
