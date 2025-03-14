package aluno;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public final class Aluno implements Collection<Aluno> {
    /**
     * nota da ap1.
     */
    private double ap1;
    /**
     * nota da ap2.
     */
    private double ap2;
    /**
     * nota da avaliação substituta.
     */
    private  double as;
    /**
     * a média das duas avaliações ap1 e ap2.
     */
    private double media;
    /**
     * constante que representa a média minima para aprovacao.
     */
    private static final double MEDIA_MINIMA = 7.0;
    /**
     * verifica se o aluna realizou a substituta.
     */
    private boolean fezAs;
    /**
     * variavel para leitura da nota de as caso necessário.
     */
    private Scanner leitura = new Scanner(System.in);

    /**
     * @param notaAp1
     * @param notaAp2
     */
    public Aluno(final double notaAp1, final double notaAp2) {
        this.ap1 = notaAp1;
        this.ap2 = notaAp2;
        this.media = (notaAp1 + notaAp2) / 2;
        this.fezAs = false;
    }

    /**
     * calcula a média do aluno e atribui ao atributo.
     */
    public void calcularMedia() {
        this.media = (ap1 + ap2) / 2;
    }

    /**
     * metodo que verifica se aluno foi aprovado
     * ou seja teve nota maior que 7.0.
     */
    public void aprovado() {
        if (media >= MEDIA_MINIMA) {
            System.out.print("Aprovado");
        } else if (!fezAs) {
            System.out.println("Reprovado precisa fazer As");
            setAs();
        } else {
            System.out.println("Reprovado perdeu de vez");
        }

    }

    /**
     * defiine um valor para a substitutiva do aluno.
     */
    public void setAs() {
        System.out.println("Insira a nota de as:");
        this.as = leitura.nextDouble();
        substituiNota(as);
    }

    @Override
    public String toString() {
        return "Aluno{"
                + "ap1=" + ap1
                + ", ap2=" + ap2
                + ", media="
                + media
                + '}';
    }

    /**
     * metodo que substitui a menor nota pela substituta.
     * @param notaAs
     */
    public void substituiNota(final double notaAs) {
        if (this.ap1 < this.ap2) {
            this.ap1 = notaAs;
            calcularMedia();
            fezAs = true;
            aprovado();
        } else  {
            this.ap2 = notaAs;
            calcularMedia();
            fezAs = true;
        aprovado();
        }

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(final Object o) {
        return false;
    }

    @Override
    public Iterator<Aluno> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(final T[] a) {
        return null;
    }

    @Override
    public boolean add(final Aluno aluno) {
        return false;
    }

    @Override
    public boolean remove(final Object o) {
        return false;
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(final Collection<? extends Aluno> c) {
        return false;
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
