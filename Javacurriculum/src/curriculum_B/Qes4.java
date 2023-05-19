package curriculum_B;

public class Qes4 {
    public static void main(String[] args) {

        System.out.println("課題4"); // "課題4" という文字列をコンソールに出力します。

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.printf("%02d * %02d = %02d", i, j, result);
                if (j < 9) {
                    System.out.print(" || "); // 式の間の区切り
                }
            }
            System.out.println(); // 九九の段ごとに改行するコード
        }
    }
}
