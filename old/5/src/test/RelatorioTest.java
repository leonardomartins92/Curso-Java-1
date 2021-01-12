package test;

import classes.*;

public class RelatorioTest {
    public static void main(String[] args) {
        //Criação das avaliações
        Avaliacao av1= new Avaliacao("Portugues", 71);
        Avaliacao av2= new Avaliacao("Educação Física",50 );
        Avaliacao av3= new Avaliacao("Ciencias", 82);
        Avaliacao av4= new Avaliacao("Matematica", 93);
        Avaliacao av5= new Avaliacao("História", 100);

        //Criação das disciplinas
        Disciplina disciplina1= new Disciplina("Portugues");
        Disciplina disciplina2= new Disciplina("Ciencias");
        Disciplina disciplina3= new Disciplina("Matematica");

        //Metodo adiciona avaliações na lista de disciplina
        disciplina1.adicionaAvaliacao(av1);
        disciplina1.adicionaAvaliacao(av2);
        disciplina1.adicionaAvaliacao(av3);
        disciplina2.adicionaAvaliacao(av4);
        disciplina3.adicionaAvaliacao(av5);

        //Criação do aluno
        Aluno aluno1 = new Aluno("Leo", "9991212", "leo@gmail", SexoUsuario.MASCULINO);

        //Metodo adiciona disciplina
        aluno1.adicionaDisciplina(disciplina1);
        aluno1.adicionaDisciplina(disciplina2);
        aluno1.adicionaDisciplina(disciplina3);

        //Metodo gera relatório notas
        System.out.println("Avaliações em Ordem Crescente:"+Relatorio.crescente(aluno1));
        System.out.println("Avaliações em Ordem Decrescente:"+Relatorio.decrescente(aluno1));
        System.out.println("Disciplinas em Ordem Alfabetica:"+Relatorio.alfabetico(aluno1));

    }
}
