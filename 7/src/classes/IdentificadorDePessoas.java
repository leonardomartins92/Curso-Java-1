package classes;

public class IdentificadorDePessoas {

    public static String identificaPessoas(Object identificado) {
        if (identificado.getClass() == Aluno.class) {
            return "Aluno";
        }
        if (identificado.getClass() == ProfessorEfetivo.class) {
            return "Professor Efetivo";
        }
        if (identificado.getClass() == ProfessorSubstituto.class) {
            return "Professor Substituto";
        }
        else {
            return "Classe Desconhecida";
        }
    }
}
