package test;

import classes.*;

public class RelatorioTest {
    public static void main(String[] args) {
        //Criação das avaliações
        Avaliacao av1= new Avaliacao("Portugues", 91);
        Avaliacao av2= new Avaliacao("Portugues",60 );
        Avaliacao av3= new Avaliacao("Ciencias", 82);

        //Criação das disciplinas
        Disciplina disciplina1= new Disciplina("Portugues");
        Disciplina disciplina2= new Disciplina("Ciencias");
        Disciplina disciplina3= new Disciplina("Matematica");

        //Metodo adiciona avaliações na lista de disciplina
        disciplina1.listaAvaliacoes.adiciona(av1);
        disciplina2.listaAvaliacoes.adiciona(av2);
        disciplina3.listaAvaliacoes.adiciona(av3);

        Aluno aluno1 = new Aluno("Leo", "9991212", "leo@gmail", SexoUsuario.MASCULINO);

        //Metodo adiciona disciplina
        aluno1.listaDisciplinas.adiciona(disciplina1);
        aluno1.listaDisciplinas.adiciona(disciplina2);
        aluno1.listaDisciplinas.adiciona(disciplina3);

        //Metodo gera relatório notas crescentes
        System.out.println("Avaliações em Ordem Crescente:"+Relatorio.crescente(aluno1));
        System.out.println("Avaliações em Ordem Decrescente:"+Relatorio.decrescente(aluno1));
        System.out.println("Disciplinas em Ordem Alfabetica:"+Relatorio.alfabetico(aluno1));
    }
}
