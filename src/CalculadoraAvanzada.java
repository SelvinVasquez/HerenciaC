public class CalculadoraAvanzada extends Calculadora {
    public CalculadoraAvanzada() {
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: El divisor no puede ser cero.");
            return -1;
        }
        return a / b;
    }
    public int potencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }
    public int raizCuadrada(int a) {
        if (a < 0) {
            System.out.println("Error: El número no puede ser negativo.");
            return -1; //
        }
        return (int) Math.sqrt(a);
    }
    public int logaritmoNatural(int a) {
        if (a <= 0) {
            System.out.println("Error: El número debe ser mayor que cero.");
            return -1;
        }
        return (int) Math.log(a);
    }
    public int logaritmoBase10(int a) {
        if (a <= 0) {
            System.out.println("Error: El número debe ser mayor que cero.");
            return -1;
        }
        return (int) Math.log10(a);
    }
    public int factorial(int n) {
        if (n < 0) {
            System.out.println("Error: El número debe ser no negativo.");
            return -1;
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public int porcentaje(int total, int porcentaje) {
        return (total * porcentaje) / 100;
    }
}
