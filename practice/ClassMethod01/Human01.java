public class Human01 {
    public String name; //メンバー変数
    public int age;  //メンバー変数
    public String hobby;

    //引数なしのコンストラクタ
    public Human01() {
        name = "山口";
        age = 20;
        hobby = "baseball";
    }
    //引数2つのコンストラクタ
    public Human01(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
}