package classes;
import java.util.ArrayList;

public class Disciplina {
    String descrição;
    ArrayList<Avaliação> listaAvaliações = new ArrayList<Avaliação>();

    public Disciplina(String descrição, ArrayList<Avaliação> listaAvaliações) {
        this.descrição = descrição;
        this.listaAvaliações = listaAvaliações;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "descrição='" + descrição + '\'' +
                ", listaAvaliações=" + listaAvaliações +
                '}';
    }
}
