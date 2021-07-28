public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization op = new OptimizedPrimeFactorization();
        Thread thread1= new Thread(lazy);
        Thread thread2 = new Thread(op);
        thread1.start();
        thread2.start();
    }
}
