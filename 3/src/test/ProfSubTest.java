package test;

import classes.ProfessorSubstituto;

public class ProfSubTest {
    public static void main(String[] args) {

        //Criação de professores
        ProfessorSubstituto prof1 = new ProfessorSubstituto("maria","98127321","maria@hot","Matematica",
                20);
        ProfessorSubstituto prof2 = new ProfessorSubstituto("Filomena","12327321","filo@hot","Geografia",
                10);
        ProfessorSubstituto prof3 = new ProfessorSubstituto("Eduarda","971227321","duarda@hot","Fisica",
                40);

        //Declaração do valor hora/aula
        ProfessorSubstituto.setValorAula(50.0);

        //Consulta
        System.out.println(prof1.consulta());
        System.out.println(prof2.consulta());
        System.out.println(prof3.consulta());


    }
}
