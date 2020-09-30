package classes;

public class ProfessorSubstituto {
    String nome;
    String telefone;
    String email;
    String departamento;
    int horasAula;

    public ProfessorSubstituto(String nome, String telefone, String email, String departamento, int horasAula) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.departamento = departamento;
        this.horasAula = horasAula;
    }

    public String consulta(ProfessorSubstituto professor){
        return ("Professor: "+professor.nome+
                " - Telefone:"+professor.telefone+
                "\n("+professor.email+")\n"+
                professor.departamento+" - "+professor.horasAula+" aulas mensais\n");

    }
}
