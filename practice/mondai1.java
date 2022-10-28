// 7 つの科目はすべて 100 点満点のテストで、平均点が合格点以上なら合格します。

// あなたの 7 科目それぞれの点数と合格点が与えられるので、合格する場合は"pass"を、不合格の場合は"failure"を出力してください。

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = sc.nextInt();
        int sum2 = sc.nextInt();
        int sum3 = sc.nextInt();
        int sum4 = sc.nextInt();
        int sum5 = sc.nextInt();
        int sum6 = sc.nextInt();
        int sum7 = sc.nextInt();
        int X = sc.nextInt();
        int total = 0;
        int average = 0;
        
            total = sum1+sum2+sum3+sum4+sum5+sum6+sum7;
            average = total/7;
        if (average >= X) {
                System.out.println("pass");
                
            } else {
                System.out.println("failure");
        }
    }
}