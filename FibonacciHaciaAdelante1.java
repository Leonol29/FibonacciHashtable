public class FibonacciHaciaAdelante1 {

    static void main(String[] args) {
        int n = 20; // aquí cambias el valor que quieres calcular
        long resultado = fibonacci(n);
        System.out.println("F(" + n + ") = " + resultado);
    }

    // Implementación iterativa "hacia adelante"
    public static long fibonacci(int n) {
        if (n <= 1) return n;

        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
