package test;

import classes.Aluno;
import classes.Avaliação;
import classes.Disciplina;

import java.util.ArrayList;

public class AlunoTest {
    public static void main(String[] args) {

        //declaração das listas de Avaliações
        ArrayList<Avaliação> listaPT = new ArrayList<>();
        ArrayList<Avaliação> listaCiencias = new ArrayList<>();
        ArrayList<Avaliação> listaMat = new ArrayList<>();

        //Criação das avaliações e inclusão na lista respectiva
        Avaliação av1= new Avaliação("Portugues", 9);
        listaPT.add(av1);
        Avaliação av2= new Avaliação("Portugues", 5);
        listaPT.add(av2);
        Avaliação av3= new Avaliação("Ciencias", 8);
        listaCiencias.add(av3);
        Avaliação av4= new Avaliação("Matematica", 7);
        listaMat.add(av4);

        //Impressão das avaliações para verificar to_String e o incremento do codigo "A_"
        System.out.println("\n");
        System.out.println("Primeira avaliação: "+av1);
        System.out.println("Segunda avaliação: "+av2);
        System.out.println("Terceira avaliação: "+av3);
        System.out.println("\n");

        //Criação da lista de disciplinas
        ArrayList<Disciplina> listaDisciplinas=new ArrayList<>();

        //Criação das disciplinas utilizando as listas de avaliações e adição a lista
        Disciplina disciplina1= new Disciplina("Portugues", listaPT);
        listaDisciplinas.add(disciplina1);
        Disciplina disciplina2= new Disciplina("Ciencias", listaCiencias);
        listaDisciplinas.add(disciplina2);
        Disciplina disciplina3= new Disciplina("Matematica", listaMat);
        listaDisciplinas.add(disciplina3);

        //Impressão das disciplinas para verificar to_String e o incremento do codigo "D_"
        System.out.println("Primeira disciplina: "+disciplina1);
        System.out.println("Segunda disciplina: "+disciplina2);
        System.out.println("Terceira disciplina: "+disciplina3);
        System.out.println("\n");

        //Teste metodo para tirar a media das avaliações de uma disciplina
        System.out.println("Media de Portugues: "+disciplina1.mediaAvaliações());
        System.out.println("Media de Ciencias: "+disciplina2.mediaAvaliações());
        System.out.println("Media de Matematica: "+disciplina3.mediaAvaliações());
        System.out.println("\n");

        //Criação dos alunos, com mudança de ano, manual, para verificar o incremento do codigo Ano-X
        Aluno.ano=2020;
        Aluno aluno1 = new Aluno("Leo", "9991212", "leo@gmail");
        Aluno aluno2 = new Aluno("Pedro", "3223451", "kik@hot");
        Aluno aluno3 = new Aluno("Pam","3232212", "joi@gmia");
        Aluno.ano=2021;
        Aluno aluno4 = new Aluno("Mateus","32232212", "qqr@gmia");
        Aluno aluno5 = new Aluno("Fabricio","999212", "algum@gmia");

        //Teste do incremento do codigo Ano-X
        System.out.println(aluno1.consulta());
        System.out.println(aluno2.consulta());
        System.out.println(aluno3.consulta());
        System.out.println(aluno4.consulta());
        System.out.println(aluno5.consulta());
        System.out.println("\n");

        //Teste do calculo do IRA
        aluno1.historicoDisciplina = listaDisciplinas;
        System.out.println("O IRA do aluno "+aluno1.nome+" é: "+aluno1.calculaIra());



    }
}
