package classes;

public class Aluno {
    String nome;
    String telefone;
    String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String descreve(){

        return ("Aluno: "+this.nome+
                " - Telefone:"+this.telefone+
                "\n("+this.email+")\n" );
    }


}
