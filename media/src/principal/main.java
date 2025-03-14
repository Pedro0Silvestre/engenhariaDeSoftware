package principal;

import aluno.Aluno;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno(7.0,5.0);
        Aluno aluno2 = new  Aluno(7.0,8.0);
        alunos.add(aluno1);
        alunos.add(aluno2);

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(aluno1);
            aluno1.aprovado();
        }


    }


}
