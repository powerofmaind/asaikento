package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
    public static void main(String[] args) {
        // 文字入力のためのスキャナー
        Scanner s = new Scanner(System.in);
        // 名前を入力してくださいと表示
        System.out.println("「名前を入力してください」");

        // s.nextLine() を使用してユーザーから名前の入力を受け取り、変数 name に代入
        String name = s.nextLine();

        while (name.length() <= 0 || name == null || name.length() > 10 || !name.matches("[0-9a-zA-Z]+")) {
            if (name.length() <= 0 || name == null) { // 入力された名前が0文字以下もしくはnullの場合の処理
                System.out.println("名前を入力してください");
            } else if (!name.matches("[0-9a-zA-Z]+")) { // 入力された名前が半角英数字以外で入力された場合の処理
                System.out.println("半角英数字のみで名前を入力してください");
            } else if (name.length() > 10) { // 名前が10文字を超えた場合の処理
                System.out.println("「名前を10文字以内にしてください」");
            }
            System.out.println("「名前を入力してください」");
            name = s.nextLine();
        }

        System.out.println("ユーザー名「" + name + "」を登録しました");


        // じゃんけんのシステム
        int winCount = 0;
        int drawCount = 0;
        int totalPlayCount = 0;

        while (winCount < 1) {// 指示の表示
            System.out.print("\n"+name + "の手を入力してください（0：グー、1：チョキ、2：パー）: ");
            int playerHand = s.nextInt();
            if (playerHand < 0 || playerHand > 2) { // 指示以外での数字の入力があった場合の処理
                System.out.println("0から2の数字で入力してください");
                continue;
            }

            int computerHand = (int) (Math.random() * 3);
            System.out.println("\n"+name + "の手は「" + getHandName(playerHand) + "」"); //自分の手を表示する処理
            System.out.println("相手の手は「" + getHandName(computerHand) + "」"); //相手の手を表示する処理

            int result = (playerHand - computerHand + 3) % 3;
            if (result == 0) { // あいこの時の処理
                drawCount++;
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if (result == 1) { // 負けた時の最初の一言の処理
                System.out.println("俺の勝ち！");
                switch (computerHand) {

                    case 0 : // グーで負けた場合の処理
                        System.out.println("\n"+"負けは次につながるチャンスです！"+"\n"+"ネバーギブアップ！");
                        break;

                    case 1 : // チョキで負けた場合の処理
                        System.out.println("\n"+"たかがじゃんけん、そう思ってないですか？"+"\n"+"それやったら次も、俺が勝ちますよ");
                        break;

                    case 2 : // パーで負けた場合の処理
                        System.out.println("\n"+"なんで負けたか、明日まで考えといてください。"+"\n"+"そしたら何かが見えてくるはずです");
                        break;
                }
            } else if (result == 2) { // 勝った場合の処理
                System.out.println("\n"+"やるやん。"+"\n"+"次は俺にリベンジさせて");
                winCount++;
            }

            totalPlayCount++;
        }

        System.out.println("\n"+"じゃんけんを行った回数は" + totalPlayCount + "回です"); //じゃんけんの行った回数の表示
        s.close(); 
        }

    private static String getHandName(int hand) { // グー、チョキ、パーの対応する値の設定
        switch (hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "";
        }
    }
}