public class CalculadoraSalario {

    public double calcularINSS(double salarioBruto){

        if (salarioBruto <= 1320){
            double faixaSalarial1 = 1300 * 0.075;
            double totalRecolher = faixaSalarial1;

            return totalRecolher;
        } else if (salarioBruto <= 2571.29) {
            double faixaSalarial1 = 1320.00 * 0.075;
            double faixaSalarial2 = (salarioBruto - 1320.01) * 0.09;
            double totalRecolher = faixaSalarial1 + faixaSalarial2;

            return totalRecolher;
        } else if (salarioBruto <= 3856.94) {
            double faixaSalarial1 = 1320 * 0.075;
            double faixaSalarial2 = (2571.29 - 1320.01) * 0.09;
            double faixaSalarial3 = (salarioBruto - 2571.29) * 0.12;
            double totalRecolher = faixaSalarial1 + faixaSalarial2 + faixaSalarial3;

            return totalRecolher;
        } else if (salarioBruto <= 7507.49) {
            double faixaSalarial1 = 1320 * 0.075;
            double faixaSalarial2 = (2571.29 - 1320.01) * 0.09;
            double faixaSalarial3 = (3856.94 - 2571.29) * 0.12;
            double faixaSalarial4 = (salarioBruto - 3856.94) * 0.14;
            double totalRecolher = faixaSalarial1 + faixaSalarial2 + faixaSalarial3 + faixaSalarial4;

            return totalRecolher;

        }else{
            double faixaSalarial1 = 1320 * 0.075;
            double faixaSalarial2 = (2571.29 - 1320.01) * 0.09;
            double faixaSalarial3 = (3856.94 - 2571.29) * 0.12;
            double faixaSalarial4 = (7507.49 - 3856.94) * 0.14;
            double totalRecolher = faixaSalarial1 + faixaSalarial2 + faixaSalarial3 + faixaSalarial4;

            return totalRecolher;

        }

    }

}
