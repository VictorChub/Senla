import java.util.Scanner;
public class string6 {
    public static void main(String[] args) {
        System.out.print("Введите текст:");
        Scanner word = new Scanner(System.in);
        String s = word.nextLine();
        char[] s1 = s.toCharArray();
        for (int i = 0; i <= s.length(); i++) {
            char f = s1[i];
            if (Character.isDigit(f)){
                           }
                else {
                System.out.print(s1[i]);
                }
        }



    }
}