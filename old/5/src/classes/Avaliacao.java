package classes;

public class Avaliacao {
    private String descricao;
    private int valor;
    private String identificador;
    private static int id=1;

    public Avaliacao(String descricao, int valor) {
        try {
            if(valor<0 || valor >100){
                throw new Exception("Valor inválido para Avaliação ");
            }
            this.descricao = descricao;
            this.valor = valor;
            identificador = "A" + id;
            id++;
        }
        catch (Exception a){
            a.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Avaliação{" +
                "descrição='" + descricao + '\'' +
                ", valor=" + valor +
                ", identificador='" + identificador + '\'' +
                '}'+'\n';
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }


 }
