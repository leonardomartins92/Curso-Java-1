package classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Usuario {

   public static ArrayList<Aluno> alunos=new ArrayList<>();
   private String matricula;
   public  Lista<Disciplina> historico;
   private static int id=1;
   private static int ano;
   private static int mudouAno;

   public Aluno(String nome, String telefone, String email, SexoUsuario sexo) {
        super(nome,telefone,email,sexo);
        alunos.add(this);
        LocalDate data= LocalDate.now();
        ano= data.getYear();
        this.historico=new Lista<>();

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
        for (Disciplina disc:historico.listar()) {
            ira+=disc.mediaAvaliacoes();
        }
        ira /=historico.listar().size();
        return ira;
    }

    public static void setAno(int ano) {
        Aluno.ano = ano;
    }

    public String tratamento(){
        String tratamento = super.tratamento();
        return "Prezad"+tratamento+" Alun"+tratamento;
    }
    public String listaDisciplinas(){
        ArrayList disc = new ArrayList();
        for (Disciplina d: historico.listar()){
            disc.add(d.getDescricao());
        }
        return "Disciplinas:"+disc;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

}
