package classes;

import java.util.ArrayList;
import java.util.Calendar;

public class Aluno {
    String nome;
    String telefone;
    String email;
    String matricula;
    ArrayList<Disciplina> historico = new ArrayList<Disciplina>();
    static int id=1;
    public static int ano;
    static int mudouAno; //valor que salva ano da ultima matricula realizada para verificação

    public Aluno(String nome, String telefone, String email) {
        // Linha abaixo fora apenas para testes de mudança de ano de forma manual
        // ano=Calendar.getInstance().get(Calendar.YEAR);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        if (ano != mudouAno){
            id=1;
        }
        this.matricula=ano+"-"+id;
        id++;
        mudouAno=ano;
    }

    public String consulta(Aluno aluno){
        return ("Aluno: "+aluno.nome+" - Telefone:"+aluno.telefone+"\n("+aluno.email+")\n"+aluno.matricula );
    }


}
