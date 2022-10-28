// あなたは1週間を全て休みにするために有給を申請することにしました。もともと決まっている休みもあります。

// 改行区切りで7日間のもともと決まった休みが、休みならば「yes」、休みでなければ「no」と入力されます。
// 有給申請しなくては行けない日数を出力してください。

// import java.util.*;

// public class mondai {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String d_1 = sc.next();
//         String d_2 = sc.next();
//         String d_3 = sc.next();
//         String d_4 = sc.next();
//         String d_5 = sc.next();
//         String d_6 = sc.next();
//         String d_7 = sc.next();
        
//         if (d_1 == yes,d_2 == yes,d_3 == yes,d_4 == yes,d_5 == yes,d_6 == yes,d_7 == yes) {
            
//         } else {
//             System.out.println();
//         }
//     }
// }


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String check = sc.next();
        
//         if (check == yes) {
//             for (int i = 0; i<7; i++)
//             i++;
//         }
//         System.out.println(i);

//     }
// }



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for(int i=1;i<=7;i++){
            String line = br.readLine();
            if (line.equals("no")){
                sum++;
            }
        }
        System.out.println(sum);
        System.out.println("");
    }  
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum=0;
        for(int i=1;i<=7;i++){
            String line = sc.nextLine();
            if (line.equals("no")){
                sum++;
            }
        }
        System.out.println(sum);
        System.out.println("");
    }  
}