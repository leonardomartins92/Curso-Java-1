package classes;

import java.util.ArrayList;
import java.util.Calendar;

public class Aluno extends Usuario {

   public static ArrayList<Aluno> alunos=new ArrayList<>();
   private String matricula;
   private ArrayList<Disciplina> historicoDisciplina;
   private int ira;
   private String rank;
   private static int id=1;
   private static int ano;
   private static int mudouAno;

   public Aluno(String nome, String telefone, String email, SexoUsuario sexo) {
        super(nome,telefone,email,sexo);
        // Linha abaixo foi removida apenas para testes de mudança de ano de forma manual
        // ano=Calendar.getInstance().get(Calendar.YEAR);
        this.historicoDisciplina=new ArrayList<>();
        if (ano != mudouAno){
            id=1;
        }
        this.matricula=ano+"-"+id;
        id++;
        mudouAno=ano;
    }

    public String descreve(){
        return ("Aluno: "+super.descreve()+this.matricula );
    }

    public int calculaIra(){
       ira=0;
        for (Disciplina disc:historicoDisciplina) {
            ira+=disc.mediaAvaliações();
        }
        this.ira /=historicoDisciplina.size();
        return ira;
    }

    public String consultaDisciplina(Disciplina disciplina) {
        if (getHistoricoDisciplina().contains(disciplina)) {
            return "A matéria " + disciplina.getDescrição() + " existe no histórico";
        } else {
            return "A matéria " + disciplina.getDescrição() + " não existe no histórico";
        }
    }

    public void adicionaDisciplina(Disciplina disciplina){
        historicoDisciplina.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){
        historicoDisciplina.remove(disciplina);

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

    public String tratamento(){
        String tratamento = super.tratamento();
        return "Prezad"+tratamento+" Alun"+tratamento;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", ira=" + ira +
                ", rank='" + rank + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


}
