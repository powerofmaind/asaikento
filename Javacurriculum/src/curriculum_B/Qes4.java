package curriculum_B;

public class Qes4 {
    public static void main(String[] args) {

        System.out.println("課題4"); //"課題4" という文字列をコンソールに出力します。

        // 掛け算の九九をループで表示
        for (int i = 1; i <= 9; i++) { //for ループを使って、i を1から9まで1ずつ増やしながらループします。これは掛け算の左側の数値を表します。
            
            for (int j = 1; j <= 9; j++) { //内側の for ループを使って、j を1から9まで1ずつ増やしながらループします。これは掛け算の右側の数値を表します。
                
                //数値を2桁の0埋めした形式で表示しています。式は "左の数値 * 右の数値 = 結果 ||" の形式で表示されます。
                System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i*j) + " || ");
            }
            System.out.println(); //九九の段が改行されるコード
        }

    }
}
