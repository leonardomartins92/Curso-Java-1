package classes;

public class Avaliação {
    private String descrição;
    private double valor;
    private String identificador;
    private static int id=1;

    public Avaliação(String descrição, double valor) {
        this.descrição = descrição;
        this.valor = valor;
        identificador="A"+id;
        id++;
    }

    @Override
    public String toString() {
        return "Avaliação{" +
                "descrição='" + descrição + '\'' +
                ", valor=" + valor +
                ", identificador='" + identificador + '\'' +
                '}';
    }

    public double getValor() {
        return valor;
    }

    public String getDescrição() {
        return descrição;
    }


 }
