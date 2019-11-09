import java.util.Scanner;

public class fibonacci {
    public static int f(int s){
        if (s == 0){
            return 1;
        }
        if (s == 1){
            return 1;
        }
        else{
            return f(s - 1) + f(s - 2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i <= n; i++) {
            if (f(i)<=n){
                num[i] = f(i);
                System.out.print(" ,"+num[i]);
            }
        }
    }
}

