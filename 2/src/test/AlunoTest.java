package test;

import classes.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno.ano=2020;
        Aluno aluno1 = new Aluno("Leo", "9991212", "leo@gmail");
        Aluno aluno2 = new Aluno("Pedro", "3223451", "kik@hot");
        Aluno.ano=2021;
        Aluno aluno3 = new Aluno("Pam","3232212", "joi@gmia");

        System.out.println(aluno1.consulta(aluno1));
        System.out.println(aluno1.consulta(aluno2));
        System.out.println(aluno1.consulta(aluno3));
    }
}
