package curriculum_B;

public class Qes5 {
    public static void main(String[] args) {

        System.out.println( "課題5"); //"課題5" という文字列をコンソールに出力します。

        // 1の段から9の段までの計算結果を表示
        for (int i = 1; i <= 9; i++) {
            // 1つの段を表示
            for (int j = 1; j <= 20; j++) {
                int result = i * j;
                System.out.print(String.format("%02d", j) + " * " + String.format("%02d", i) + " = " + String.format("%03d", result));
                if (j < 20) {
                    System.out.print(" || ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
