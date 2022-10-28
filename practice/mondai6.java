//整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。

import java.util.*;

public class mondai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int most = 0;
        int mini = 0;

        for(int i = 0; i <10; i++) {
           int integer = sc.nextInt();

            if (i == 0 || integer > most)
            most = integer;
            if (i == 0 || integer < mini) 
            mini = integer;
           
        }
        System.out.println("最大値="+most+"、最小値="+mini);
        
    }
}



