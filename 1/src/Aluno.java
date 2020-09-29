public class Aluno {
    String nome;
    String telefone;
    String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String consulta(Aluno aluno){
        return ("Aluno: "+aluno.nome+" - Telefone:"+aluno.telefone+"\n("+aluno.email+")" );
    }


}
