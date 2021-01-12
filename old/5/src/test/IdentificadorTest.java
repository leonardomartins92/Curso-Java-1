package test;

import classes.*;

import java.time.LocalDate;

public class IdentificadorTest {
    public static void main(String[] args) {

        //Criação dos objetos que serão testados no identificador
        Regime regime = new Regime("20 aulas", 3000);
        Aluno aluno = new Aluno("Leo", "9991212", "leo@gmail",SexoUsuario.MASCULINO);
        LocalDate data= LocalDate.now();
        ProfessorSubstituto prof1 = new ProfessorSubstituto("Pedro","98127321","droo@hot",SexoUsuario.MASCULINO,"Matematica",
                20);
        ProfessorEfetivo prof2= new ProfessorEfetivo("Marcos","99981237","markin@gmail",SexoUsuario.MASCULINO,
                "Eletrica", regime,data);

        //Funcionamento do identificador
        System.out.println("Classe do Objeto:"+IdentificadorDePessoas.identificaPessoas(aluno));
        System.out.println("Classe do Objeto:"+IdentificadorDePessoas.identificaPessoas(prof1));
        System.out.println("Classe do Objeto:"+IdentificadorDePessoas.identificaPessoas(prof2));
    }
}
