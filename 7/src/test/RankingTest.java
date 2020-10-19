package test;

import classes.*;

public class RankingTest {
    public static void main(String[] args) throws InterruptedException {
        //Criação das avaliações
        Avaliação av1 = new Avaliação("Portugues", 97);
        Avaliação av2 = new Avaliação("Portugues", 100);
        Avaliação av3 = new Avaliação("Ciencias", 95);
        Avaliação av4 = new Avaliação("Matematica", 80);
        Avaliação av5 = new Avaliação("Matematica", 3);

        //Criação das disciplinas
        Disciplina disciplina1 = new Disciplina("Portugues");
        Disciplina disciplina2 = new Disciplina("Ciencias");
        Disciplina disciplina3 = new Disciplina("Matematica");
        Disciplina disciplina4 = new Disciplina("Calculo");

        //Metodo adiciona avaliações na lista de disciplina
        disciplina1.adicionaAvaliação(av1);
        disciplina1.adicionaAvaliação(av2);
        disciplina1.adicionaAvaliação(av3);
        disciplina1.adicionaAvaliação(av4);
        disciplina2.adicionaAvaliação(av4);
        disciplina3.adicionaAvaliação(av1);
        disciplina3.adicionaAvaliação(av2);
        disciplina4.adicionaAvaliação(av5);


        //Criação dos alunos
        Aluno.setAno(2020);
        Aluno aluno1 = new Aluno("Leo", "9991212", "leo@gmail", SexoUsuario.MASCULINO);
        Aluno aluno2 = new Aluno("Pedro", "3223451", "kik@hot", SexoUsuario.MASCULINO);
        Aluno aluno3 = new Aluno("Pam", "3232212", "joi@gmia", SexoUsuario.FEMININO);
        Aluno aluno4 = new Aluno("Mariana", "3232212", "joi@gmia", SexoUsuario.FEMININO);

        //Metodo adiciona disciplina
        aluno1.adicionaDisciplina(disciplina1);
        aluno1.adicionaDisciplina(disciplina2);
        aluno1.adicionaDisciplina(disciplina3);
        aluno2.adicionaDisciplina(disciplina1);
        aluno2.adicionaDisciplina(disciplina2);
        aluno3.adicionaDisciplina(disciplina2);
        aluno3.adicionaDisciplina(disciplina3);
        aluno4.adicionaDisciplina(disciplina4);

        //Teste Lista de todos alunos e os rankings
        System.out.println(Ranking.listaRanking());
        System.out.println("\n");

        //Metodo de consulta do ranking do aluno
        System.out.println("O rank do Aluno 1 é:"+Ranking.consultaRanking(aluno1));
        System.out.println("O rank do Aluno 2 é:"+Ranking.consultaRanking(aluno2));
        System.out.println("O rank do Aluno 3 é:"+Ranking.consultaRanking(aluno3));
        System.out.println("O rank do Aluno 4 é:"+Ranking.consultaRanking(aluno4));
        System.out.println("\n");

        //Mudando notas dos alunos para testar o metodo atualiza ranking
        av1.setValor(20);
        av2.setValor(30);
        av3.setValor(85);
        av4.setValor(70);
        av5.setValor(100);

        //Metodo atualiza ranking
       Ranking.atualizaRanking();

        //Metodo de consulta do ranking do aluno
        System.out.println(Ranking.listaRanking());
        System.out.println("O rank do Aluno 1 é:"+Ranking.consultaRanking(aluno1));
        System.out.println("O rank do Aluno 2 é:"+Ranking.consultaRanking(aluno2));
        System.out.println("O rank do Aluno 3 é:"+Ranking.consultaRanking(aluno3));
        System.out.println("O rank do Aluno 4 é:"+Ranking.consultaRanking(aluno4));

    }
}