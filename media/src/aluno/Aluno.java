package aluno;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Aluno implements Collection<Aluno> {
    private double ap1;
    private double ap2;
    private  double as;
    private double media;
    private boolean fezAs;
    Scanner leitura = new Scanner(System.in);

    public Aluno(double ap1, double ap2) {
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.media = (ap1 + ap2) / 2;
        this.fezAs = false;
    }

    public void calcularMedia() {
        this.media = (ap1 + ap2) / 2;
    }

    public void aprovado() {
        if (media >= 7.0) {
            System.out.print("Aprovado");
        } else if (!fezAs) {
            System.out.println("Reprovado precisa fazer As");
            setAs();
        }
        else {
            System.out.println("Reprovado perdeu de vez");
        }

    }

    public void setAs() {
        System.out.println("Insira a nota de as:");
        this.as = leitura.nextDouble();
        substituiNota(as);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ap1=" + ap1 +
                ", ap2=" + ap2 +
                ", media=" + media +
                '}';
    }

    public void substituiNota (double notaAs) {
        if (this.ap1 < this.ap2) {
            this.ap1 = notaAs;
            calcularMedia();
            fezAs = true;
            aprovado();
        }
        else  {this.ap2 = notaAs;
            calcularMedia();
            fezAs = true;
        aprovado();}

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
    public boolean contains(Object o) {
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
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Aluno aluno) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Aluno> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
