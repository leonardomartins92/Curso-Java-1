package classes;
import java.util.ArrayList;

public class Disciplina {
    String descrição;
    ArrayList<Avaliação> listaAvaliações = new ArrayList<Avaliação>();
    String identificador;
    static int id=1;

    public Disciplina(String descrição, ArrayList<Avaliação> listaAvaliações) {
        this.descrição = descrição;
        this.listaAvaliações = listaAvaliações;
        identificador="D"+id;
        id++;

    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "descrição='" + descrição + '\'' +
                ", listaAvaliações=" + listaAvaliações +
                '}';
    }
}
