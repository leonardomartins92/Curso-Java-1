package test;
import classes.Aluno;
import classes.ProfessorSubstituto;
import classes.ProfessorEfetivo;

public class Test {
    public static void main(String[] args) {
        Aluno aluno1=new Aluno("Leo","9998-1212","email@contato");
        System.out.println(aluno1.consulta(aluno1));
        ProfessorEfetivo prof1=new ProfessorEfetivo("Pedro","123-123","prof@gmail",
                "Informatica",4000.0,"01/10/1990");
        System.out.println(prof1.consulta(prof1));
        ProfessorSubstituto prof2 = new ProfessorSubstituto("Antonio","3221-1232","prof@hotmail",
                "Ciencias", 20);
        System.out.println(prof2.consulta(prof2));
    }
}