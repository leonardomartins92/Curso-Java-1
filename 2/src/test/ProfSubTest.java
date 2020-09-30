package test;

import classes.ProfessorSubstituto;

public class ProfSubTest {
    public static void main(String[] args) {
        ProfessorSubstituto prof1 = new ProfessorSubstituto("maria","98127321","maria@hot","Matematica",
                20);
        ProfessorSubstituto prof2 = new ProfessorSubstituto("Filomena","12327321","filo@hot","Geografia",
                10);
        ProfessorSubstituto prof3 = new ProfessorSubstituto("Eduarda","971227321","duarda@hot","Fisica",
                40);

        System.out.println(prof1.consulta(prof1));
        System.out.println(prof1.consulta(prof2));
        System.out.println(prof1.consulta(prof3));


    }
}
