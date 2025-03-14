package principal;

import aluno.Aluno;

import java.util.ArrayList;
import java.util.List;

final class Principal {

    private Principal() {
        throw new UnsupportedOperationException(
                "Esta é uma classe utilitária e não pode ser instanciada.");
    }
    /**
     * @param args
     */
    public static void main(final String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno(7.0, 5.0);
        Aluno aluno2 = new  Aluno(2.0, 8.0);
        alunos.add(aluno1);
        alunos.add(aluno2);

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            aluno.aprovado();
        }


    }


}
