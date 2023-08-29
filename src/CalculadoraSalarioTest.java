import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraSalarioTest {
    CalculadoraSalario calculadoraSalario = new CalculadoraSalario();

    @Test
    public void CS1(){
        double resultadoAtual = calculadoraSalario.calcularINSS(1300);
        Assertions.assertEquals(97.5, resultadoAtual, 0.01);
    }
    @Test
    public void CS2(){
        double resultadoAtual = calculadoraSalario.calcularINSS(1500);
        Assertions.assertEquals(115.2, resultadoAtual, 0.01);
    }
    @Test
    public void CS3(){
        double resultadoAtual = calculadoraSalario.calcularINSS(3000);
        Assertions.assertEquals(263.06, resultadoAtual, 0.01);
    }
    @Test
    public void CS4(){
        double resultadoAtual = calculadoraSalario.calcularINSS(6000);
        Assertions.assertEquals(665.92, resultadoAtual, 0.01);
    }
    @Test
    public void CS5(){
        double resultadoAtual = calculadoraSalario.calcularINSS(10000);
        Assertions.assertEquals(876.97, resultadoAtual, 0.01);
    }
}