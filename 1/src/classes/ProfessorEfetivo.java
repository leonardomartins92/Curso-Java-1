package classes;

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

    public String consulta(){
        return ("Professor: "+this.nome+
                " - Telefone:"+this.telefone+
                "\n("+this.email+")\n"+
                this.departamento+" - Dedicação Exclusiva\n"+
                "Salário:"+this.salario+
                "\nContratado em:"+this.dataContrataçao+"\n");
    }

}
