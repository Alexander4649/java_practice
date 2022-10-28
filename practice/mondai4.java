// 次のプログラムを作成しなさい。

// 巨人、阪神戦で毎回の得点を入力する。（１回～９回）
// 入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
// ※ 	試合は巨人の先行とする。

import java.util.*;

public class mondai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point1 = 0;
        int point2 = 0;
        int total1 = 0;
        int total2 = 0;

        for (int i =1; i <= 9; i++) {
            System.out.print(i + "回表、巨人の得点は？"+"");
            point1 = sc.nextInt();
            System.out.print(i + "回表、阪神の得点は？"+"");
            point2 = sc.nextInt();

            total1 += point1;
            total2 += point2;
        }
        System.out.println("巨人:"+total1+"点,阪神:"+total2+"点");
        if (total1 > total2) {
            System.out.println("巨人の勝ち");
        } else {
            System.out.println("阪神の勝ち");
        }
    }
}