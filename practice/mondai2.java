// 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。

import java.util.*;

public class mondai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            int X = sc.nextInt();
            sum += X;
        }
        result = sum/10;
        System.out.println(result);
    }
}