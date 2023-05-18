package curriculum_B;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 生徒の人数を入力
        System.out.print("生徒の人数を入力してください（2以上）: ");
        int n = scanner.nextInt();
        double[] average = new double[n + 1];

        // 各教科の合計点を初期化
        int englishTotal = 0;
        int mathTotal = 0;
        int scienceTotal = 0;
        int socialTotal = 0;

        // 各生徒の成績を入力
        for (int i = 1; i <= n; i++) {

            // 英語の点数の入力時に出力される
            System.out.print("\n" + i + "人目「英語」の点数を入力してください : ");
            int englishScore = scanner.nextInt();
            englishTotal += englishScore;

            // 数学の点数入力時に出力される
            System.out.print(i + "人目「数学」の点数を入力してください : ");
            int mathScore = scanner.nextInt();
            mathTotal += mathScore;

            // 理科の点数の入力時に出力される
            System.out.print(i + "人目「理科」の点数を入力してください : ");
            int scienceScore = scanner.nextInt();
            scienceTotal += scienceScore;

            // 社会の点数の入力時に出力される
            System.out.print(i + "人目「社会」の点数を入力してください : ");
            int socialScore = scanner.nextInt();
            socialTotal += socialScore;

            // すべての点数の平均点を算出する
            average[i] = ((double)englishScore + (double)mathScore + (double)scienceScore + (double)socialScore) / 4;


        }

        // 各教科の平均点と全体の平均点を計算
        double englishAverage = (double)englishTotal / n;
        double mathAverage = (double)mathTotal / n;
        double scienceAverage = (double)scienceTotal / n;
        double socialAverage = (double)socialTotal / n;
        double totalAverage = ((double)englishTotal + (double)mathTotal + (double)scienceTotal + (double)socialTotal) / (4 * n);

        System.out.println("\n");
        // 3人の全教科の平均点を出力する
        for(int j = 1; j < average.length; j++)
            System.out.printf("%d人目の平均点は%.2f点です。\n", j, average[j]);

        // 各教科の平均点と全体の平均点を出力
        System.out.printf("\n英語の平均点は%.2f点です。\n", englishAverage);
        System.out.printf("数学の平均点は%.2f点です。\n", mathAverage);
        System.out.printf("理科の平均点は%.2f点です。\n", scienceAverage);
        System.out.printf("社会の平均点は%.2f点です。\n", socialAverage);
        System.out.printf("全体の平均点は%.2f点です。\n", totalAverage);

        scanner.close();
    }
}
