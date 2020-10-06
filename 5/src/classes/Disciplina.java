package classes;
import java.util.ArrayList;

public class Disciplina {
    private String descrição;
    private  ArrayList<Avaliação> listaAvaliações;
    private String identificador;
    private double media;
    private static int id=1;

    public Disciplina(String descrição) {
        this.descrição = descrição;
        this.listaAvaliações = new ArrayList<>();
        identificador="D"+id;
        id++;
        this.media=this.mediaAvaliações();
    }

    public double mediaAvaliações(){
        media=0;
        for (Avaliação avaliação:listaAvaliações) {
          media+=avaliação.getValor();
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
                ", media=" + media +
                '}';
    }

    public String consultaAvaliação(Avaliação avaliação) {
        if (listaAvaliações.contains(avaliação)) {
            return "A avaliação " + avaliação.getDescrição() + " existe na lista";
        } else {
            return "A avaliação " + avaliação.getDescrição() + " não existe na lista";
        }

    }

    public void adicionaAvaliação(Avaliação avaliação){
        listaAvaliações.add(avaliação);
    }

    public void removeAvaliação(Avaliação avaliação){
        listaAvaliações.remove(avaliação);
    }

    public String listaAvaliações(){
        ArrayList av = new ArrayList();
        for (Avaliação avaliação: listaAvaliações){
            av.add(avaliação.getDescrição());
        }
        return "Avaliações:"+av;
    }

    public String getDescrição() {
        return descrição;
    }

    public ArrayList<Avaliação> getListaAvaliações() {
        return listaAvaliações;
    }

}
