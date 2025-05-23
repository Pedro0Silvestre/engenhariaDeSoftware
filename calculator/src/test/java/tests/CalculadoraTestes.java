package tests;

import control.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTestes {

    Calculadora calc;

    //Anotação before é executada antes de executar cada , instancia um novo objeto para cada teste
    @Before
    public void setup() {
        calc = new Calculadora();
    }

    //anotaçaõ de teste do junit
    @Test
    // metodos de teste geralmente não tem retorno
    public void testeSomar() {
        Assert.assertEquals(5.0,calc.somar(2.0,3.0),0.0);
    }

    @Test
    public void testeSubtrair() {
        Assert.assertEquals(5.0,calc.subtrair(7.0,2.0),0.0);
    }

    @Test
    public void testeMultiplicar() {
        Assert.assertEquals(6.0,calc.multiplicar(2.0,3.0),0.0);
    }

    @Test
    public void testeDividir() {
        Assert.assertEquals(5.0,calc.dividir(10.0,2.0),0.0);
    }
}
