package classes;

public class ProfessorEfetivo {
   String nome;
   String telefone;
   String email;
   String departamento;
   Regime regime;
   String dataContrataçao;

    public ProfessorEfetivo(String nome, String telefone, String email, String departamento, Regime regime, String dataContrataçao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.departamento = departamento;
        this.dataContrataçao = dataContrataçao;
    }

    public String consulta(){
        return ("Professor: "+this.nome+
                " - Telefone:"+this.telefone+
                "\n("+this.email+")\n"+
                this.departamento+" - "+regime.descrição+
                "\nSalário:"+this.regime.salario+
                "\nContratado em:"+this.dataContrataçao+"\n");
    }

}
