package classes;

import java.util.ArrayList;

public class Ranking {

     public static ArrayList<Aluno> listaRanking(){
        return Aluno.alunos;

    }

    public static String consultaRanking(Aluno aluno){
       return aluno.getRank();
    }

    public static void atualizaRanking(){
       ArrayList<Aluno> listaAlunos=Aluno.alunos;
       for (Aluno a:listaAlunos){
           if (a.getHistoricoDisciplina().isEmpty()) {
               return;
           }
           double ira = a.calculaIra();
           if (ira >= 89) {
               a.setRank("A");
           } else if (ira > 69 && ira < 89) {
               a.setRank("B");
           } else {
               a.setRank("C");
           }
       }
    }
}
