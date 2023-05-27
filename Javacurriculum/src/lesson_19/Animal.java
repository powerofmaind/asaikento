package lesson_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog dog = new Dog();
        
        String animalName = dog.getName();
        
        System.out.println("動物の名前: " + animalName);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        int animalCount = Dog.getCount();
        
        System.out.println("動物の数: " + animalCount);
		// Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        
        String formattedDateTime = now.format(formatter);
        // 現在の時刻を出力
        System.out.println("現在の日時: " + formattedDateTime);
	}
}
