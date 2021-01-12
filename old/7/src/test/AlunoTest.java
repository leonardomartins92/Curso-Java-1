package test;

import classes.*;

public class AlunoTest {
    public static void main(String[] args) {


        //Criação das avaliações
        Avaliacao av1= new Avaliacao("Portugues", 100);
        Avaliacao av2= new Avaliacao("Portugues", 50);
        Avaliacao av3= new Avaliacao("Ciencias", 80);
        Avaliacao av4= new Avaliacao("Matematica", 70);

        //Impressão das avaliações para verificar to_String e o incremento do codigo "A_"
        System.out.println("Primeira avaliação: "+av1);
        System.out.println("Segunda avaliação: "+av2);
        System.out.println("Terceira avaliação: "+av3);
        System.out.println("\n");

       //Criação das disciplinas
        Disciplina disciplina1= new Disciplina("Portugues");
        Disciplina disciplina2= new Disciplina("Ciencias");
        Disciplina disciplina3= new Disciplina("Matematica");


        //Impressão das disciplinas para verificar to_String e o incremento do codigo "D_"
        System.out.println("Primeira disciplina: "+disciplina1);
        System.out.println("Segunda disciplina: "+disciplina2);
        System.out.println("Terceira disciplina: "+disciplina3);
        System.out.println("\n");

        //Metodo adiciona avaliações na lista de disciplina

        disciplina1.listaAvaliacoes.adiciona(av1);
        disciplina1.listaAvaliacoes.adiciona(av2);
        disciplina1.listaAvaliacoes.adiciona(av3);
        disciplina1.listaAvaliacoes.adiciona(av4);
        disciplina2.listaAvaliacoes.adiciona(av4);


        System.out.println("Lista de Avaliações: "+disciplina1.listaAvaliacoes.listar());
        System.out.println("\n");

        //Calcula media das avaliações da disciplina
        System.out.println("Media das avaliações: "+disciplina1.mediaAvaliacoes());
        System.out.println("\n");

        //Metodo remove avaliação
        disciplina1.listaAvaliacoes.remove(av3);

        //Metodo verifica se avaliação esta na lista
        System.out.println("Avaliação 1 está no listaDisciplinas? "+disciplina1.listaAvaliacoes.consulta(av1));
        System.out.println("Avaliação 2 está no listaDisciplinas? "+disciplina1.listaAvaliacoes.consulta(av3));
        System.out.println("\n");

        //Criação dos alunos

        Aluno aluno1 = new Aluno("Leo", "9991212", "leo@gmail", SexoUsuario.MASCULINO);
        Aluno aluno2 = new Aluno("Pedro", "3223451", "kik@hot",SexoUsuario.MASCULINO);
        Aluno aluno3 = new Aluno("Pam","3232212", "joi@gmia",SexoUsuario.FEMININO);

        //Teste do incremento do codigo Ano-X
        System.out.println(aluno1.descreve());
        System.out.println(aluno2.descreve());
        System.out.println(aluno3.descreve());
        System.out.println("\n");

        //Metodo adiciona disciplina
        aluno1.listaDisciplinas.adiciona(disciplina1);
        aluno1.listaDisciplinas.adiciona(disciplina2);
        aluno1.listaDisciplinas.adiciona(disciplina3);
        System.out.println("Lista das disciplinas: "+aluno1.listaDisciplinas.listar());
        System.out.println("\n");

        //Metodo remove disciplina
        aluno1.listaDisciplinas.remove(disciplina3);

        //Verifica se disciplina esta na lista
        System.out.println("Disciplina 1 está na lista? "+aluno1.listaDisciplinas.consulta(disciplina1));
        System.out.println("Disciplina 3 está na lista? "+aluno1.listaDisciplinas.consulta(disciplina3));
        System.out.println("\n");

        //Metodo lista todas as avaliaçoes na lista de disciplinas
        System.out.println(disciplina1.listaAvaliacoes());

        //Metodo listar todas as disciplinas de um aluno
        System.out.println(aluno1.listaDisciplinas());

        //Teste do calculo do IRA
        System.out.println("O IRA do aluno é:"+aluno1.calculaIra());

        //Teste do tratamento
        System.out.println("\n");
        System.out.println("Tratamento:");
        System.out.println(aluno1.tratamento());
        System.out.println(aluno3.tratamento());

    }
}
