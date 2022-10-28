import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        int wordNum = word.length();//単語の文字数
        
        for (int i = 1; i < wordNum; i++) {
            System.out.print("+");
        }
        System.out.println("+++");
        
        System.out.println("+" + word + "+");
        
        for (int i = 1; i < wordNum; i++) {
            System.out.print("+");
        }
        System.out.print("+++");
    }
}