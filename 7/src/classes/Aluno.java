package classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Usuario {

   public static ArrayList<Aluno> alunos=new ArrayList<>();
   private String matricula;
   private ArrayList<Disciplina> historicoDisciplina;
   private String rank;
   private static int id=1;
   private static int ano;
   private static int mudouAno;

   public Aluno(String nome, String telefone, String email, SexoUsuario sexo) {
        super(nome,telefone,email,sexo);
        alunos.add(this);
        LocalDate data= LocalDate.now();
        ano= data.getYear();
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
        int ira=0;
        for (Disciplina disc:historicoDisciplina) {
            ira+=disc.mediaAvaliacoes();
        }
        ira /=historicoDisciplina.size();
        return ira;
    }


    public String consultaDisciplina(Disciplina disciplina) {
        if (getHistoricoDisciplina().contains(disciplina)) {
            return "A matéria " + disciplina.getDescricao() + " existe no histórico";
        } else {
            return "A matéria " + disciplina.getDescricao() + " não existe no histórico";
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
           disc.add(d.getDescricao());
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
