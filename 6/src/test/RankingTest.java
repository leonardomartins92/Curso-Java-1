package test;

import classes.*;

public class RankingTest {
    public static void main(String[] args) throws InterruptedException {
        //Criação das avaliações
        Avaliacao av1 = new Avaliacao("Portugues", 97);
        Avaliacao av2 = new Avaliacao("Portugues", 100);
        Avaliacao av3 = new Avaliacao("Ciencias", 95);
        Avaliacao av4 = new Avaliacao("Matematica", 90);
        Avaliacao av5 = new Avaliacao("Matematica", 3);

        //Criação das disciplinas
        Disciplina disciplina1 = new Disciplina("Portugues");
        Disciplina disciplina2 = new Disciplina("Ciencias");
        Disciplina disciplina3 = new Disciplina("Matematica");
        Disciplina disciplina4 = new Disciplina("Calculo");

        //Metodo adiciona avaliações na lista de disciplina
        disciplina1.adicionaAvaliacao(av1);
        disciplina1.adicionaAvaliacao(av2);
        disciplina1.adicionaAvaliacao(av3);
        disciplina1.adicionaAvaliacao(av4);
        disciplina2.adicionaAvaliacao(av4);
        disciplina3.adicionaAvaliacao(av1);
        disciplina3.adicionaAvaliacao(av2);
        disciplina4.adicionaAvaliacao(av5);


        //Criação dos alunos
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
        aluno3.adicionaDisciplina(disciplina4);


        //Teste Lista de todos alunos e os rankings - ALUNO 4 S/ HISTORICO
        System.out.println("Ranking c/ Aluno 4 sem Histórico:");
        System.out.println("Lista Ranking: "+Ranking.listaRanking());

        //Metodo de consulta do ranking do aluno
        System.out.println("O rank do Aluno 1 é:"+Ranking.consultaRanking(aluno1));
        System.out.println("O rank do Aluno 2 é:"+Ranking.consultaRanking(aluno2));
        System.out.println("O rank do Aluno 3 é:"+Ranking.consultaRanking(aluno3));
        System.out.println("O rank do Aluno 4 é:"+Ranking.consultaRanking(aluno4));
        System.out.println("\n");

        //Mudando notas para testar o metodo atualiza ranking
        av1.setValor(20);
        av2.setValor(30);
        av3.setValor(85);
        av4.setValor(70);
        av5.setValor(100);

        System.out.println("Novas notas e Aluno 4 com Histórico:");
        //Adicionando Historico p/ Aluno 4
        aluno4.adicionaDisciplina(disciplina2);

        //Teste Lista de todos alunos e os rankings - ALUNO 4 C/ HISTORICO
        System.out.println("Lista dos alunos no Ranking: "+Ranking.listaRanking());

        //Metodo de consulta do ranking do aluno
        System.out.println("O rank do Aluno 1 é:"+Ranking.consultaRanking(aluno1));
        System.out.println("O rank do Aluno 2 é:"+Ranking.consultaRanking(aluno2));
        System.out.println("O rank do Aluno 3 é:"+Ranking.consultaRanking(aluno3));
        System.out.println("O rank do Aluno 4 é:"+Ranking.consultaRanking(aluno4));

    }
}