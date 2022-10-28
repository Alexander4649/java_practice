// 整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。

import java.util.*;

public class mondai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        int lose = 0;

        for (int i = 0; i <10; i++) {
            int vs = sc.nextInt();
            if (vs == 1) {
                win++;
            } else if (vs == 0) {
                lose++;
            }
        }
            System.out.println("Winの数は" +win); 
            System.out.println("loseの数は"+lose);
    }
}