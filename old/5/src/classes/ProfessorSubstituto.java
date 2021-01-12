package classes;

public class ProfessorSubstituto extends Usuario {
    private String departamento;
    private int horasAula;
    private static double valorAula;

    public ProfessorSubstituto(String nome, String telefone, String email, SexoUsuario sexo, String departamento, int horasAula) {
        super(nome,telefone,email,sexo);
        this.departamento=departamento;
        this.horasAula = horasAula;
    }

    public String descreve(){
        return ("Professor: "+super.descreve()+this.departamento+
                " - "+this.horasAula+" aulas mensais\nValor hora/aula:R$"+
                valorAula+"\n");
    }

   public static void setValorAula(double valorAula) {
        ProfessorSubstituto.valorAula = valorAula;
    }

    public String tratamento(){
        String tratamento = super.tratamento();
        return "Prof. Substitut"+tratamento;
    }

    public double calculaSalario(){
        return horasAula * valorAula;
    }
}
