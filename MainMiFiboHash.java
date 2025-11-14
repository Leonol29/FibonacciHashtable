import java.util.Hashtable;

public class MainMiFiboHash {

    static void main(String[] args) {

        Hashtable<Integer, Long> memoria = new Hashtable<>();
        memoria.put(0, 0L);
        memoria.put(1, 1L);

        int n = 10;
        System.out.println("F(" + n + ") = " + fibonacci(n, memoria));
    }

    public static long fibonacci(int n, Hashtable<Integer, Long> memoria) {
        if (memoria.containsKey(n))
            return memoria.get(n);

        long valor = fibonacci(n - 1, memoria) + fibonacci(n - 2, memoria);
        memoria.put(n, valor);
        return valor;
    }
}
