import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraSalarioTest {
    CalculadoraSalario calculadoraSalario = new CalculadoraSalario();

    @Test
    @DisplayName("Calcula INSS Com Salário Igual a R$ 1.300")
    public void CS1(){
        double resultadoAtual = calculadoraSalario.calcularINSS(1300);
        Assertions.assertEquals(97.5, resultadoAtual, 0.01);
    }
    @Test
    @DisplayName("Calcula INSS Com Salário Igual a R$ 1.500")
    public void CS2(){
        double resultadoAtual = calculadoraSalario.calcularINSS(1500);
        Assertions.assertEquals(115.2, resultadoAtual, 0.01);
    }
    @Test
    @DisplayName("Calcula INSS Com Salário Igual a R$ 3.000")
    public void CS3(){
        double resultadoAtual = calculadoraSalario.calcularINSS(3000);
        Assertions.assertEquals(263.06, resultadoAtual, 0.01);
    }
    @Test
    @DisplayName("Calcula INSS Com Salário Igual a R$ 6.000")
    public void CS4(){
        double resultadoAtual = calculadoraSalario.calcularINSS(6000);
        Assertions.assertEquals(665.92, resultadoAtual, 0.01);
    }
    @Test
    @DisplayName("Calcula INSS Com Salário Igual a R$ 10.000")
    public void CS5(){
        double resultadoAtual = calculadoraSalario.calcularINSS(10000);
        Assertions.assertEquals(876.97, resultadoAtual, 0.01);
    }
}
