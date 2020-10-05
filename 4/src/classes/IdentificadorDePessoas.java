package classes;

public class IdentificadorDePessoas {
    public static String identificaPessoas(Aluno aluno){
        return "Aluno";
    }
    public static String identificaPessoas(ProfessorEfetivo professor){
        return "Professor Efetivo";
    }
    public static String identificaPessoas(ProfessorSubstituto professor){
        return "Professor Substituto";
    }
}
