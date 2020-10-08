package classes;

import java.util.List;
import java.util.stream.Collectors;

public class Ranking {
    public static void calculaRanking(Aluno aluno) {
        if (aluno.getHistoricoDisciplina().isEmpty()) {
            return;
        } else {
            Aluno.setAlunos(aluno);
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

    public static List<Aluno> listaRanking(){
        return Aluno.getAlunos().stream().distinct().collect(Collectors.toList());

    }

    public static String consultaRanking(Aluno aluno){
       return aluno.getRank();
    }
}
