import models.CalculadoraImc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestesCalculadoraImc {

    CalculadoraImc calc = new CalculadoraImc();

    @Before
    public void setup() {
        calc = new CalculadoraImc();
    }

    //testes

    @Test
    public void testCalcularImc() {
        Assert.assertEquals("Baixo peso muito grave",calc.calcularIMC(49.0,1.85,65,"h"));
        Assert.assertEquals("Baixo peso grave",calc.calcularIMC(36.0,1.5,64,"h"));
        Assert.assertEquals("Baixo peso grave",calc.calcularIMC(38.2,1.5,64,"h"));
        Assert.assertEquals("Baixo peso",calc.calcularIMC(38.3,1.5,63,"m"));
        Assert.assertEquals("Baixo peso",calc.calcularIMC(41.60,1.5,62,"m"));
        Assert.assertEquals("Peso normal",calc.calcularIMC(41.7,1.5,62,"m"));
        Assert.assertEquals("Peso normal",calc.calcularIMC(80.9,1.8,62,"m"));
        Assert.assertEquals("Sobrepeso",calc.calcularIMC(81,1.8,62,"m"));
        Assert.assertEquals("Sobrepeso",calc.calcularIMC(97.15,1.8,62,"m"));
        Assert.assertEquals("Obesidade grau I",calc.calcularIMC(97.2,1.8,62,"m"));
        Assert.assertEquals("Obesidade grau I",calc.calcularIMC(113.35,1.8,62,"m"));
        Assert.assertEquals("Obesidade grau II",calc.calcularIMC(113.5,1.8,62,"m"));
        Assert.assertEquals("Obesidade grau II",calc.calcularIMC(129.56,1.8,62,"m"));
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)",calc.calcularIMC(130.0,1.8,62,"m"));
        Assert.assertEquals("Baixo peso",calc.calcularIMC(63.2,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Peso normal",calc.calcularIMC(63.6,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Peso normal",calc.calcularIMC(78.02,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Sobrepeso",calc.calcularIMC(78.35,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Sobrepeso",calc.calcularIMC(86.68,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Obesidade grau I",calc.calcularIMC(87.0,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Obesidade grau I",calc.calcularIMC(101.0,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Obesidade grau II",calc.calcularIMC(101.45,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Obesidade grau II",calc.calcularIMC(115.30,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)",calc.calcularIMC(118.5,1.7,66,"h"));//idosos homens
        Assert.assertEquals("Baixo peso",calc.calcularIMC(56.0,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Peso normal",calc.calcularIMC(56.8,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Peso normal",calc.calcularIMC(69.1,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Sobrepeso",calc.calcularIMC(69.39,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Sobrepeso",calc.calcularIMC(81.92,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Obesidade grau I",calc.calcularIMC(82.18,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Obesidade grau I",calc.calcularIMC(94.72,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Obesidade grau II",calc.calcularIMC(94.98,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Obesidade grau II",calc.calcularIMC(107.26,1.6,66,"m"));//idosos mulheres
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)",calc.calcularIMC(107.78,1.6,66,"m"));//idosos mulheres












    }
}
