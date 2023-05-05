package lesson1_8;

public class Curriculum_New_1_8_3 {
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
        
        // 【年齢・身長・体重】の数値を和算で自己代入
        age += age;
        height += height;
        weight += weight;

        // BMIの計算
        double bmi = weight / Math.pow((height/100), 2);

        // 自己紹介文とBMIの出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");
        System.out.printf("BMIは%.2fです%n", bmi);

        // 年齢が25歳以上かでtrueと出力する
        age = 24;//8番で使用した値の再代入
        boolean h1 = (age >= 25);
        if(h1){
        System.out.println("true");
        }else{
        System.out.println("false");
        };
        
        // 文字列型に型変換して出力する
        height = 168.5;
        weight = 64.2;//8番で使用した値の再代入
        String ageStr = String.valueOf(age);
        String heightStr = String.valueOf(height);
        String weightStr = String.valueOf(weight);
        System.out.println(ageStr + "・" + heightStr + "・" + weightStr );
        
        // 年齢と身長を整数型に変換して出力する
        int ageint = Integer.parseInt(ageStr);
        double heightdouble = Double.parseDouble(heightStr);
        int heightint = (int)heightdouble;
        System.out.println("年齢：" + ageint + "歳");
        System.out.println("身長：" + heightint  + "cm");
        
        //年齢が25以上、又は身長が160以上でtrueと出力する
        System.out.println(ageint >= 25 || heightint >= 160);
    }
}