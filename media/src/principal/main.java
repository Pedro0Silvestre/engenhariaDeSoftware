package principal;

import aluno.Aluno;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno(7.0,5.0);
        System.out.println(aluno1);
        aluno1.aprovado();
    }


}
