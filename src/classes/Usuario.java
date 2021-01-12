package classes;

import static classes.SexoUsuario.FEMININO;

public abstract class Usuario  {
    protected String nome;
    protected String telefone;
    protected String email;

    public String getNome() {
        return nome;
    }

    protected SexoUsuario sexo;

    protected Usuario(String nome, String telefone, String email, SexoUsuario sexo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }

    protected String descreve (){
        return this.nome+" - Telefone:"+this.telefone+"\n("+this.email+")\n";
    }

    protected String tratamento(){
        if (sexo==FEMININO){
            return "a";
        }
        else{
            return "o";
        }
    }
}
