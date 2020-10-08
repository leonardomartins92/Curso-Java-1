package classes;

public class Avaliação {
    private String descrição;
    private int valor;
    private String identificador;
    private static int id=1;

    public Avaliação(String descrição, int valor) {
        if(valor<0 || valor>100){
            throw new IllegalArgumentException("O valor da Avaliação deve ser entre 0 e 100");
        }
        this.descrição = descrição;
        this.valor = valor;
        identificador="A"+id;
        id++;
    }

    private String ErroValorAvaliação(){
        return "Erro: valor da Avaliação deve estar entre 0 e 100";
    }

    @Override
    public String toString() {
        return "Avaliação{" +
                "descrição='" + descrição + '\'' +
                ", valor=" + valor +
                ", identificador='" + identificador + '\'' +
                '}';
    }

    public int getValor() {
        return valor;
    }

    public String getDescrição() {
        return descrição;
    }


 }
