package classes;

public class Usuario  {
    protected String nome;
    protected String telefone;
    protected String email;
    protected String sexo;

    public Usuario(String nome, String telefone, String email, String sexo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo.toLowerCase();
    }

    protected String descreve (){
        return this.nome+" - Telefone:"+this.telefone+"\n("+this.email+")\n";
    }

    protected String tratamento(){
        if (sexo.equals("feminino")){
            return "a";
        }
        else{
            return "o";
        }
    }


}
