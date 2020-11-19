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
            System.out.println(a.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Avaliação{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", identificador='" + identificador + '\'' +
                '}';
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }


 }
