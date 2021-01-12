package test;

import classes.*;

public class RelatorioTest {
    public static void main(String[] args) {
        //Criação das avaliações
        Avaliacao av1= new Avaliacao("Portugues", 91);
        Avaliacao av2= new Avaliacao("Portugues",60 );
        Avaliacao av3= new Avaliacao("Ciencias", 82);
        Avaliacao av4= new Avaliacao("Matematica", 73);

        //Criação das disciplinas
        Disciplina disciplina1= new Disciplina("Portugues");
        Disciplina disciplina2= new Disciplina("Ciencias");
        Disciplina disciplina3= new Disciplina("Matematica");

        //Metodo adiciona avaliações na lista de disciplina
        disciplina1.adicionaAvaliacao(av1);
        disciplina1.adicionaAvaliacao(av2);
        disciplina1.adicionaAvaliacao(av3);
        disciplina1.adicionaAvaliacao(av4);
        disciplina2.adicionaAvaliacao(av4);
        disciplina3.adicionaAvaliacao(av1);
        disciplina3.adicionaAvaliacao(av2);

        //Criação dos alunos
        Aluno.setAno(2020);
        Aluno aluno1 = new Aluno("Leo", "9991212", "leo@gmail", SexoUsuario.MASCULINO);
        Aluno aluno2 = new Aluno("Pedro", "3223451", "kik@hot",SexoUsuario.MASCULINO);
        Aluno aluno3 = new Aluno("Pam","3232212", "joi@gmia",SexoUsuario.FEMININO);

        //Metodo adiciona disciplina
        aluno1.adicionaDisciplina(disciplina1);
        aluno1.adicionaDisciplina(disciplina2);
        aluno1.adicionaDisciplina(disciplina3);
        aluno2.adicionaDisciplina(disciplina1);
        aluno2.adicionaDisciplina(disciplina2);
        aluno3.adicionaDisciplina(disciplina2);
        aluno3.adicionaDisciplina(disciplina3);

        //Metodo gera relatório notas crescentes
        System.out.println("Avaliações em Ordem Crescente:"+Relatorio.crescente(aluno1));
        System.out.println("Avaliações em Ordem Decrescente:"+Relatorio.decrescente(aluno1));
        System.out.println("Disciplinas em Ordem Alfabetica:"+Relatorio.alfabetico(aluno1));
    }
}
