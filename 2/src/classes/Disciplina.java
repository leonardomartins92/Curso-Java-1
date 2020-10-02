package classes;
import java.util.ArrayList;

public class Disciplina {
    String descrição;
    ArrayList<Avaliação> listaAvaliações;
    String identificador;
    double media;
    static int id=1;

    public Disciplina(String descrição, ArrayList<Avaliação> lista) {
        this.descrição = descrição;
        this.listaAvaliações = lista;
        identificador="D"+id;
        id++;

    }

    public double mediaAvaliações(){
        media=0;
        for (Avaliação avaliação:listaAvaliações) {
          media+=avaliação.valor;
        }
        media /=listaAvaliações.size();
        return media;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "descrição='" + descrição + '\'' +
                ", listaAvaliações=" + listaAvaliações +
                ", identificador='" + identificador + '\'' +
                '}';
    }
}
