import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите простое число: ");
        if (scanner.hasNextInt()) {
            int i, j, n = scanner.nextInt();
            if (n > 0) {
                for (i = 2; i <= n; i++) {
                    int s = 0;
                    for (j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
                        if ((i % j) == 0) {
                            s = 1;
                        }
                    }
                    if (s == 0) {
                            System.out.print("   " + i);
                        }
                }
            } else {
                System.out.print("Вы ввели отрицательное число ");
            }

        }
        else{
         System.out.println("Вы ввели непростое число");
         }


    }
}