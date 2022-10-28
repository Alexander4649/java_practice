// 数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。

import java.util.*;

public class mondai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int N = sc.nextInt();
            sum += N;

            if(sum >= 100) {
                break;
            }
        }
        System.out.println("合計値:" + sum);
    }
}


//whileは繰り返しが決まっていない場合、
//for は繰り返し回数が決まっている場合

// import java.util.*;

// public class mondai9 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         while (sum <= 100)
//             sum += sc.nextInt();
//             System.out.println(sum);
//         }
//     }