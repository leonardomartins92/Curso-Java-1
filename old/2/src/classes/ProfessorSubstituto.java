package classes;

public class ProfessorSubstituto {
    String nome;
    String telefone;
    String email;
    String departamento;
    int horasAula;
    public static double valorAula;

    public ProfessorSubstituto(String nome, String telefone, String email, String departamento, int horasAula) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.departamento = departamento;
        this.horasAula = horasAula;
    }

    public String descreve(){
        return ("Professor: "+this.nome+
                " - Telefone:"+this.telefone+
                "\n("+this.email+")\n"+
                this.departamento+" - "+this.horasAula+" aulas mensais\nValor hora/aula:R$"+
                valorAula+"\n");

    }
}
