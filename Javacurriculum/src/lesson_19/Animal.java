package lesson_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// Dogクラスを呼び出してインスタンスを生成し、変数dogに代入
		Dog dog = new Dog();

		// dog変数から動物の名前を取得
		String animalName = dog.getName();

		// 動物の名前を「動物の名前:」の後に続けてコンソールに出力
		System.out.println("動物の名前: " + animalName);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// Dogクラスを呼び出して変数に代入
		int animalCount = Dog.getCount();

		// 動物の数をコンソールに出力
		System.out.println("動物の数: " + animalCount);

		// Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在の日時をyyyy-MM-dd H:m:s形式で取得し、変数nowに代入
		LocalDateTime now = LocalDateTime.now();

		// DateTimeFormatterを使用して、日時のフォーマットを指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");

		// now変数の日時を指定したフォーマットに変換し、文字列としてformattedDateTime変数に代入
		String formattedDateTime = now.format(formatter);

		// 現在の日時を「現在の日時:」の後に続けてコンソールに出力
		System.out.println("現在の日時: " + formattedDateTime);
	}
}
