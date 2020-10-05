package test;

import classes.ProfessorSubstituto;

public class ProfSubTest {
    public static void main(String[] args) {

        //Criação de professores
        ProfessorSubstituto prof1 = new ProfessorSubstituto("Pedro","98127321","droo@hot","Masculino","Matematica",
                20);
        ProfessorSubstituto prof2 = new ProfessorSubstituto("Filomena","12327321","filo@hot","Feminino","Geografia",
                10);
        ProfessorSubstituto prof3 = new ProfessorSubstituto("Eduarda","971227321","duarda@hot","feminino","Fisica",
                40);

        //Declaração do valor hora/aula
        ProfessorSubstituto.setValorAula(50.0);

        //Consulta
        System.out.println(prof1.descreve());
        System.out.println(prof2.descreve());
        System.out.println(prof3.descreve());
        System.out.println("\n");

        //Teste do tratamento
        System.out.println(prof1.tratamento());
        System.out.println(prof2.tratamento());
        System.out.println("\n");

        //Calculo Salario
        System.out.println("O salario é:"+prof1.calculaSalario());
        System.out.println("O salario é:"+prof2.calculaSalario());
        System.out.println("\n");
    }
}
