package classes;

import java.util.ArrayList;

public class Ranking {

    public static ArrayList<Aluno> rankA = new ArrayList<>();
    public static ArrayList<Aluno> rankB = new ArrayList<>();
    public static ArrayList<Aluno> rankC = new ArrayList<>();

    public static ArrayList listaRanking(){
        Ranking.atualizaRanking();
        ArrayList<Aluno> listaAlunos=Aluno.alunos;
        ArrayList ranking=new ArrayList();

        for (Aluno a:listaAlunos){
          ranking.add(a.nome +": "+ consultaRanking(a));
        }
        return ranking;

    }

    public static String consultaRanking(Aluno aluno){
        Ranking.atualizaRanking();
        if (rankA.contains(aluno)){
            return "A";
        }
        else if (rankB.contains(aluno)){
            return "B";
        }
        else if (rankC.contains(aluno)){
            return "C";
        }
        else {
            return "Sem Rank";
        }
    }

    public static void atualizaRanking(){
       ArrayList<Aluno> listaAlunos=Aluno.alunos;
       rankA.clear();
       rankB.clear();
       rankC.clear();

       for (Aluno a:listaAlunos){
           if (a.getHistoricoDisciplina().isEmpty()) {
               Aluno.alunos.remove(a);
               return;
           }
           int ira = a.calculaIra();
           if (ira >= 89) {
              rankA.add(a);
           }
           else if (ira >= 69) {
              rankB.add(a);
           }
           else {
               rankC.add(a);
           };
       }
    }
}
