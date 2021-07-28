import java.util.Scanner;

public class LazyPrimeFactorization implements  Runnable{
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = sc.nextInt();
        if(number<2){
            System.out.println("number không là số nguyên tố");
        }
        for (int i=2;i<number;i++){
            if(number%i==0){
                System.out.println("số nhập vào không là số nguyên tố");
            }
        }
    }
}
