package classes;

import java.time.LocalDate;

public class ProfessorEfetivo extends Usuario {
    private String departamento;
    private Regime regime;
    private LocalDate dataContrataçao;

    public ProfessorEfetivo(String nome, String telefone, String email,SexoUsuario sexo,String departamento, Regime regime, LocalDate dataContrataçao) {
        super(nome,telefone,email,sexo);
        this.departamento=departamento;
        this.dataContrataçao = dataContrataçao;
        this.regime=regime;
    }

    public String descreve(){
        return ("Professor: "+super.descreve()+this.departamento+
                " - "+regime.getDescricao()+
                "\nSalário:"+regime.getSalario()+
                "\nContratado em:"+this.dataContrataçao+"\n");
    }

    public String tratamento(){
        String tratamento = super.tratamento();
        return "Prof. Efetiv"+tratamento;
    }

    public double calculoSalario(){
        return regime.getSalario();
    }

}
