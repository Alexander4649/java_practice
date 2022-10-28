//自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。

import java.util.*;

public class mondai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer = 0;
        int most =0;

        for (int i = 0; i<10; i++) {
            integer = sc.nextInt();
            if (integer > most) {
                most = integer;
            }
        }
        System.out.println("入力された整数の最大値は"+most+"です。");
    }
}