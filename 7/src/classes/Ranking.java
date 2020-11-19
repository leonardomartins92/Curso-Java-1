package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ranking {

    public static Map<Aluno, Rank> rank = new HashMap();

    public static ArrayList listaRanking(){
        Ranking.atualizaRanking();
        ArrayList listaRanking= new ArrayList();
        Set<Aluno> listaAlunos=rank.keySet();
        for(Aluno a:listaAlunos ){
            listaRanking.add(a.getNome()+": "+consultaRanking(a));
        }
        return listaRanking;
    }

    public static Rank consultaRanking(Aluno aluno){
        Ranking.atualizaRanking();
        return rank.get(aluno);

    }

    public static void atualizaRanking(){
        ArrayList<Aluno> listaAlunos=Aluno.alunos;

        for (Aluno a:listaAlunos){
            if (a.historico.listar().isEmpty()) {
                rank.remove(a);
                return;
            }
            int ira = a.calculaIra();
            if (ira >= 89) {
                rank.put(a,Rank.A);
            }
            else if (ira >= 69) {
                rank.put(a,Rank.B);
            }
            else {
                rank.put(a,Rank.C);
            };
        }
    }


}
