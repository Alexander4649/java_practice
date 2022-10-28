// 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
// 数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。

import java.util.*;

public class mondai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0, out = 0; i < count; i++) {
            if(out == 10) {
                out = 0;
            }
            System.out.print(out++);
        }
    }
}