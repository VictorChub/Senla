import java.util.Scanner;

public class nodnok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите простое число1: ");
        int a=in.nextInt();
        System.out.print("Введите простое число2: ");
        int b=in.nextInt();
        System.out.println("НОД чисел:"+ nod(a,b));
        int s = a*b/nod(a,b);
        System.out.print("НОК чисел:"+s);
    }
    public static int nod(int a, int b){
        if (b == 0) {
            return a;
        }
        else {
            return nod(b, a % b);
        }
    }

}