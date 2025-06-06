package org.example;

import models.CalculadoraImc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CalculadoraImc calc = new CalculadoraImc();
        System.out.println(calc.calcularIMC(55,1.6,66,"m"));

        double peso_imc = 55.0/(Math.pow(1.6,2));
        System.out.println(peso_imc);

        }
    }