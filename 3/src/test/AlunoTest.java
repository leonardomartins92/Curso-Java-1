package test;

import classes.Aluno;
import classes.Avaliação;
import classes.Disciplina;

import java.util.ArrayList;

public class AlunoTest {
    public static void main(String[] args) {

        //Criação das avaliações e inclusão na lista respectiva
        Avaliação av1= new Avaliação("Portugues", 9);
        Avaliação av2= new Avaliação("Portugues", 5);
        Avaliação av3= new Avaliação("Ciencias", 8);
        Avaliação av4= new Avaliação("Matematica", 7);

        //Impressão das avaliações para verificar to_String e o incremento do codigo "A_"
        System.out.println("\n");
        System.out.println("Primeira avaliação: "+av1);
        System.out.println("Segunda avaliação: "+av2);
        System.out.println("Terceira avaliação: "+av3);
        System.out.println("\n");

       //Criação das disciplinas utilizando as listas de avaliações e adição a lista
        Disciplina disciplina1= new Disciplina("Portugues");
        Disciplina disciplina2= new Disciplina("Ciencias");
        Disciplina disciplina3= new Disciplina("Matematica");


        //Impressão das disciplinas para verificar to_String e o incremento do codigo "D_"
        System.out.println("Primeira disciplina: "+disciplina1);
        System.out.println("Segunda disciplina: "+disciplina2);
        System.out.println("Terceira disciplina: "+disciplina3);
        System.out.println("\n");

        //Metodo adiciona avaliações na lista de disciplina
        disciplina1.adicionaAvaliação(av1);
        disciplina1.adicionaAvaliação(av2);
        disciplina1.adicionaAvaliação(av3);
        disciplina1.adicionaAvaliação(av4);
        disciplina2.adicionaAvaliação(av4);
        System.out.println("Lista de disciplinas: "+disciplina1.getListaAvaliações());
        System.out.println("\n");

        //Calcula media das avaliações da disciplina
        System.out.println("Media das avaliações: "+disciplina1.mediaAvaliações());
        System.out.println("\n");

        //Metodo remove avaliação
        disciplina1.removeAvaliação(av3);
        System.out.println("Lista de disciplinas: "+disciplina1.getListaAvaliações());
        System.out.println("\n");

        //Metodo verifica se avaliação esta na lista
        System.out.println(disciplina1.consultaAvaliação(av1));
        System.out.println(disciplina1.consultaAvaliação(av3));
        System.out.println("\n");

        //Metodo para calcular a media das avaliações de uma disciplina
        System.out.println("Media de Portugues: "+disciplina1.mediaAvaliações());
        System.out.println("\n");

        //Criação dos alunos, com mudança de ano, manual, para verificar o incremento do codigo Ano-X
        Aluno.setAno(2020);
        Aluno aluno1 = new Aluno("Leo", "9991212", "leo@gmail");
        Aluno aluno2 = new Aluno("Pedro", "3223451", "kik@hot");
        Aluno aluno3 = new Aluno("Pam","3232212", "joi@gmia");
        Aluno.setAno(2021);
        Aluno aluno4 = new Aluno("Mateus","32232212", "qqr@gmia");
        Aluno aluno5 = new Aluno("Fabricio","999212", "algum@gmia");

        //Teste do incremento do codigo Ano-X
        System.out.println(aluno1.consulta());
        System.out.println(aluno2.consulta());
        System.out.println(aluno3.consulta());
        System.out.println(aluno4.consulta());
        System.out.println(aluno5.consulta());
        System.out.println("\n");

        //Metodo adiciona disciplina
        aluno1.adicionaDisciplina(disciplina1);
        aluno1.adicionaDisciplina(disciplina2);
        aluno1.adicionaDisciplina(disciplina3);
        System.out.println(aluno1.getHistoricoDisciplina());
        System.out.println("\n");

        //Metodo remove disciplina
        aluno1.removeDisciplina(disciplina3);
        System.out.println(aluno1.getHistoricoDisciplina());
        System.out.println("\n");

        //Verifica se disciplina esta na lista
        System.out.println(aluno1.consultaDisciplinas(disciplina1));
        System.out.println(aluno1.consultaDisciplinas(disciplina3));
        System.out.println("\n");

        //Metodo lista todas as avaliaçoes na lista de disciplinas
        System.out.println(disciplina1.listaAvaliações());
        System.out.println("\n");

        //Metodo listar todas as disciplinas de um aluno
        System.out.println(aluno1.listaDisciplinas());
        System.out.println("\n");

        //Teste do calculo do IRA
        System.out.println("O IRA do aluno é:"+aluno1.calculaIra());

    }
}
