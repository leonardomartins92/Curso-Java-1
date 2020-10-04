package classes;

import java.util.ArrayList;
import java.util.Calendar;

public class Aluno {
   private String nome;
   private String telefone;
   private String email;
   private String matricula;
   private ArrayList<Disciplina> historicoDisciplina;
   private double ira;
   private static int id=1;
   private static int ano;
   private static int mudouAno; //valor que salva ano da ultima matricula realizada para verificação

    public Aluno(String nome, String telefone, String email) {
        // Linha abaixo foi removida apenas para testes de mudança de ano de forma manual
        // ano=Calendar.getInstance().get(Calendar.YEAR);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.historicoDisciplina=new ArrayList<>();
        if (ano != mudouAno){
            id=1;
        }
        this.matricula=ano+"-"+id;
        id++;
        mudouAno=ano;
    }

    public String consulta(){
        return ("Aluno: "+this.nome+" - Telefone:"+this.telefone+"\n("+this.email+")\n"+this.matricula );
    }

    public double calculaIra(){
       ira=0;
        for (Disciplina disc:historicoDisciplina) {
            ira+=disc.mediaAvaliações();
        }
        ira /=historicoDisciplina.size();
        return ira;
    }

    public String consultaDisciplinas(Disciplina disciplina) {
        if (getHistoricoDisciplina().contains(disciplina)) {
            return "A matéria " + disciplina.getDescrição() + " existe no histórico";
        } else {
            return "A matéria " + disciplina.getDescrição() + " não existe no histórico";
        }

    }

    public boolean adicionaDisciplina(Disciplina disciplina){
        getHistoricoDisciplina().add(disciplina);
        return true;
    }

    public boolean removeDisciplina(Disciplina disciplina){
        historicoDisciplina.remove(disciplina);
        return true;
    }

    public String listaDisciplinas(){
       ArrayList disc = new ArrayList();
       for (Disciplina d: historicoDisciplina){
           disc.add(d.getDescrição());
       }
       return "Disciplinas:"+disc;
    }

    public static void setAno(int ano) {
        Aluno.ano = ano;
    }

    public ArrayList<Disciplina> getHistoricoDisciplina() {
        return historicoDisciplina;
    }

}
