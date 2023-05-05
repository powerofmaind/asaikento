package lesson1_8;

public class Curriculum_New_1_8_2 {
   
    public static void main(String[] args) {
   
    // 名前
    String name = "山田 太郎";
    // 年齢
    int age = 18;
    // 身長
    double height = 170.5;
    // 体重
    double weight = 62.2;
    // 食べ物
    String food = "寿司";
    
    //変数の再代入
    name = "鈴木 一郎";
    age = 24;
    height = 168.5;
    weight = 64.2;
    food = "オムライス";
    
    //自己紹介文を出力する処理
    System.out.println("私の名前は" + name + "です。");
    System.out.println("年齢は" + age + "歳です。");
    System.out.println("身長は" + height + "cmです。");
    System.out.println("体重は" + weight + "kgです。");
    System.out.println("好きな食べ物は" + food + "です。");
    
    // BMIを計算して出力する処理
    double bmi = weight / ((height / 100) * (height / 100));
    String formattedBmi = String.format("%.1f", bmi);
    System.out.println("BMIは" + formattedBmi + "です。");
    
    }
}
