package curriculum_B;

public class Qes4 {
    public static void main(String[] args) {

        System.out.println("課題4"); //"課題4" という文字列をコンソールに出力します。

        // 掛け算の九九をループで表示
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i*j));
            }
            System.out.println(); //九九の段が改行されるコード
        }

    }
}
