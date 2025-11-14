import java.util.Iterator;

public record FibonacciHaciaAdelanteGenerator1(int limit) implements Iterable<Long> {

    @Override
    public Iterator<Long> iterator() {
        return new Iterator<>() {

            private long a = 0;
            private long b = 1;
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < limit;
            }

            @Override
            public Long next() {
                long result;

                if (count == 0) {
                    result = 0;
                } else if (count == 1) {
                    result = 1;
                } else {
                    long temp = a + b;
                    a = b;
                    b = temp;
                    result = b;
                }

                count++;
                return result;
            }
        };
    }

    static void main() {

        FibonacciHaciaAdelanteGenerator1 gen = new FibonacciHaciaAdelanteGenerator1(20);

        System.out.println("Fibonacci generado con iterable:");
        for (long num : gen) {
            System.out.print(num + " ");
        }
    }
}

