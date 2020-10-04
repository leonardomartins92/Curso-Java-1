package classes;

public class ProfessorSubstituto {
    private String nome;
    private String telefone;
    private String email;
    private String departamento;
    private int horasAula;
    private static double valorAula;

    public ProfessorSubstituto(String nome, String telefone, String email, String departamento, int horasAula) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.departamento = departamento;
        this.horasAula = horasAula;
    }


    public String consulta(){
        return ("Professor: "+this.nome+
                " - Telefone:"+this.telefone+
                "\n("+this.email+")\n"+
                this.departamento+" - "+this.horasAula+" aulas mensais\nValor hora/aula:R$"+
                valorAula+"\n");

    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public static double getValorAula() {
        return valorAula;
    }

    public static void setValorAula(double valorAula) {
        ProfessorSubstituto.valorAula = valorAula;
    }
}
