package classes;

public class Avaliação {
    String descrição;
    double valor;
    String identificador;
    static int id=1;

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
                '}';
    }
}
