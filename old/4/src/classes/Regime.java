package classes;

public class Regime {
    private String descrição;
    private double salario;

    public Regime(String descrição, double salario) {
        this.descrição = descrição;
        this.salario = salario;
    }

    public String getDescrição() {
        return descrição;
    }

    public double getSalario() {
        return salario;
    }
}
