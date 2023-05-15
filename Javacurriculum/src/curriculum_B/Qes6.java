package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    
    public static void main(String[] args) {
        
        Random rand = new Random(); //ランダム変数
        Scanner s = new Scanner(System.in); //文字入力のためのスキャナー
        String product = s.nextLine();
        String[] products = product.split("、"); //入力した商品を「、」ごとに区切って配列に格納する
        
        for (String kaden  : products) { //区切った商品ごとに処理
            int index;
            switch (kaden) {
                case "テレビ":
                case "ディスプレイ":
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    index = switch (kaden) { //商品ごとの台数のランダム処理
                        case "パソコン" ->  rand.nextInt(11) + 1;
                        case "冷蔵庫" ->  rand.nextInt(11) + 1;
                        case "扇風機" ->  rand.nextInt(11) + 1;
                        case "洗濯機" ->  rand.nextInt(11) + 1;
                        case "加湿器" ->  rand.nextInt(11) + 1;
                        default -> rand.nextInt(11) + 1;
                    };
                    break;
                default:
                    System.out.println("『 " + kaden + " 』は指定の商品ではありません"); //対象外の商品を表示する処理
                    continue;
            }
            System.out.println(kaden + "の残り台数は" + index + "台です"); //対象の商品の在庫数を表示する処理
        }
        s.close();  }
        }
