//個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。

import java.util.*;

public class mondai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.print("*");
        }
    }
}