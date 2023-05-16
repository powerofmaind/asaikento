package curriculum_B;

public class Qes5 {
    public static void main(String[] args) {
    
        int tableSize = 9; // 九九の表の大きさ
        
    System.out.println( "課題5"); //"課題5" という文字列をコンソールに出力します。

    // 九九の表を生成して表示する
    for (int i = 1; i <= tableSize; i++) {
        for (int j = 1; j <= tableSize; j++) {
            int result = i * j;
            System.out.print(String.format("%03d * %02d = %03d  ", i, j, result));
        }
        System.out.println(); //九九の段が改行されるコード
    }
    }
}
