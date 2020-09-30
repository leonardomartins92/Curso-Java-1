package classes;

public class Avaliação {
    String descrição;
    double valor;

    public Avaliação(String descrição, double valor) {
        this.descrição = descrição;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Avaliação{" +
                "descrição='" + descrição + '\'' +
                ", valor=" + valor +
                '}';
    }
}
