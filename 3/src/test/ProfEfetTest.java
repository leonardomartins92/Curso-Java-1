package test;

import classes.ProfessorEfetivo;
import classes.Regime;

public class ProfEfetTest {
    public static void main(String[] args) {
       //Criação dos Tipos de regimes
        Regime regime1 = new Regime("Efetivo", 5000);
        Regime regime2 = new Regime("20 aulas", 3000);

        //Criação de professores
        ProfessorEfetivo prof1= new ProfessorEfetivo("Antonio","3224567","tonho@gmail",
                "Informatica", regime1,"01/01/1990");
        ProfessorEfetivo prof2= new ProfessorEfetivo("Marcos","99981237","markin@gmail",
                "Eletrica", regime2,"11/01/2000");

        //Consulta
        System.out.println(prof1.descreve());
        System.out.println(prof2.descreve());

    }
}