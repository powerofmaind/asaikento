package curriculum_B;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 生徒の人数を入力
        System.out.print("生徒の人数を入力してください（2以上）: ");
        int n = scanner.nextInt();

        // 各教科の合計点を初期化
        double englishTotal = 0;
        double mathTotal = 0;
        double scienceTotal = 0;
        double socialTotal = 0;

        // 各生徒の成績を入力
        for (int i = 1; i <= n; i++) {
            
            //成績の入力時初めに出力される
            System.out.println(i + "人目の成績を入力してください");
            
            //英語の点数の入力時に出力される
            System.out.print("英語の点数を入力してください : ");
            double englishScore = scanner.nextDouble();
            englishTotal += englishScore;
            
            //数学の点数入力時に出力される
            System.out.print("数学の点数を入力してください : ");
            double mathScore = scanner.nextDouble();
            mathTotal += mathScore;
            
           // 理科の点数の入力時に出力される
            System.out.print("理科の点数を入力してください : ");
            double scienceScore = scanner.nextDouble();
            scienceTotal += scienceScore;
            
            //社会の点数の入力時に出力される
            System.out.print("社会の点数を入力してください : ");
            double socialScore = scanner.nextDouble();
            socialTotal += socialScore;
            
            //すべての点数の平均点を算出する
            double average = (englishScore + mathScore + scienceScore + socialScore) / 4;
            
            //1人の全教科の平均点を出力する
            System.out.printf("%d人目の平均点は%.2f点です。\n", i, average);
        }

        // 各教科の平均点と全体の平均点を計算
        double englishAverage = englishTotal / n;
        double mathAverage = mathTotal / n;
        double scienceAverage = scienceTotal / n;
        double socialAverage = socialTotal / n;
        double totalAverage = (englishTotal + mathTotal + scienceTotal + socialTotal) / (4 * n);

        // 各教科の平均点と全体の平均点を出力
        System.out.printf("英語の平均点は%.2f点です。\n", englishAverage);
        System.out.printf("数学の平均点は%.2f点です。\n", mathAverage);
        System.out.printf("理科の平均点は%.2f点です。\n", scienceAverage);
        System.out.printf("社会の平均点は%.2f点です。\n", socialAverage);
        System.out.printf("全体の平均点は%.2f点です。\n", totalAverage);
        
        scanner.close();
        }
    }
