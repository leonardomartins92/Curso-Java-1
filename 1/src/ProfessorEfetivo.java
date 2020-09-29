public class ProfessorEfetivo {
   String nome;
   String telefone;
   String email;
   String departamento;
   Double salario;
   String dataContrataçao;

    public ProfessorEfetivo(String nome, String telefone, String email, String departamento, Double salario, String dataContrataçao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
        this.dataContrataçao = dataContrataçao;
    }

    public String consulta(ProfessorEfetivo professor){
        return ("Professor: "+professor.nome+
                " - Telefone:"+professor.telefone+
                "\n("+professor.email+")\n"+
                professor.departamento+" - Dedicação Exclusiva\n"+
                "Salário:"+professor.salario+
                "\nContratado em:"+professor.dataContrataçao);
    }

}
