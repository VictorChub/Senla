import java.util.Scanner;

public class poly5 {

    public static void main(String[] args) {
        System.out.print("Введите слово:");
        Scanner word = new Scanner(System.in);
        String s = word.next();
        String s0="";
        for(int i=s.length()-1;i>=0;i--){
            s0=s0+s.charAt(i);
        }
        if (s0.matches(s)){
            System.out.println("полиндром");
        }
        else{
            System.out.println("неполиндром");
        }
    }
}