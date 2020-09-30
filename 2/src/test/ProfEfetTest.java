package test;

import classes.ProfessorEfetivo;

public class ProfEfetTest {
    public static void main(String[] args) {

    ProfessorEfetivo prof1= new ProfessorEfetivo("Hilton", "32234123","hilt@gmail","Informatica",
            7000.0,"01/10/1990");
    ProfessorEfetivo prof2= new ProfessorEfetivo("Antonio", "32234198","pro@gmail","Portugues",
            8000.0,"01/10/1980");
    ProfessorEfetivo prof3= new ProfessorEfetivo("Ricardo", "322387753","rik@gmail","Ciencias",
            5000.0,"01/10/1995");

        System.out.println(prof1.consulta(prof1));
        System.out.println(prof1.consulta(prof2));
        System.out.println(prof1.consulta(prof3));

}
}