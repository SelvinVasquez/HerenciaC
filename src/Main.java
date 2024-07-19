public class Main {
    public static void main(String[] args) {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();
        System.out.println("Suma: " + calc.sumar(2, 5));
        System.out.println("Resta: " + calc.restar(9, 3));
        System.out.println("Multiplicación: " + calc.multiplicar(10, 3));
        System.out.println("División: " + calc.dividir(12, 3));
        System.out.println("Potencia: " + calc.potencia(5, 3));
        System.out.println("Raíz Cuadrada: " + calc.raizCuadrada(9));
        System.out.println("Logaritmo Natural: " + calc.logaritmoNatural(7));
        System.out.println("Logaritmo Base 10: " + calc.logaritmoBase10(100));
        System.out.println("Factorial: " + calc.factorial(5));
        System.out.println("Porcentaje: " + calc.porcentaje(200, 15));
    }
}