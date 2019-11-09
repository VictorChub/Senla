import java.util.Scanner;

public class Main1 {
        public static void main1(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        double n = scanner1.nextInt();
        double u = add(n);
        System.out.print(u);
        }
    public static double add(double n) {
        return n+1;
    }
}
