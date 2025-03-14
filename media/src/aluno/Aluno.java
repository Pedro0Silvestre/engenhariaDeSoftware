package aluno;

import java.util.Scanner;

public class Aluno {
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

    public double calcularMedia(double ap1, double ap2) {
        return (ap1 + ap2) / 2;
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
            aprovado();
        }
        else  {this.ap2 = notaAs;
        aprovado();}

    }
}
