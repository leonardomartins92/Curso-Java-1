package classes;

public class Avaliação {
    private String descrição;
    private int valor;
    private String identificador;
    private static int id=1;

    public Avaliação(String descrição, int valor) {
        try {

            if(valor<0 || valor >100){
                throw new Exception("Valor inválido para Avaliação ");
            }
            this.descrição = descrição;
            this.valor = valor;
            identificador = "A" + id;
            id++;
        }
        catch (Exception a){
            System.out.println(a.getMessage());
        }
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

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }


 }
