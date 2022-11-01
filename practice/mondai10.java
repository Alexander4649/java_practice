// 1から100まで順番に数を表示する。その数が3で割り切れるなら“Fizz”、5 
// で割り切れるなら“Buzz”、両方で割り切れるなら“FizzBuzz” と表示する。

import java.util.*;

public class mondai10 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            if (i%15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%3 == 0 ) {
                System.out.println("Fizz");
            } else 
            System.out.println(i);
         }
    }
}