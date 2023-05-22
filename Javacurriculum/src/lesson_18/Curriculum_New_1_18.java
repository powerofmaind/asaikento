package lesson_18;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		printHello("JavaSE", 11);
		multiplyNumbers(5, 3);
		int[] array = {1, 2, 3, 4, 5};
		printArrayValues(array);
		addNumbers(2.5, 3.7);
		int[] randomNumbers = getRandomNumbers(4);
		printArrayValues(randomNumbers);
		double average = calculateAverage(randomNumbers);
		System.out.println("Average: " + average);
		boolean isAbove50 = checkIfAbove50(average);
		System.out.println("Above 50: " + isAbove50);
	}

	// Q1
	// 文字列と整数を引数String型(text)、int型(number)と定義する
	public static void printHello(String text, int number) {
		// 引数を「Hello]と合わせ、コンソールに「Hello JavaSE 11」と出力
		System.out.println("Hello " + text + " " + number + "\n");
	}

	// Q2
	// 2つの整数を引数(int a)、(int b)と定義する
	public static void multiplyNumbers(int a, int b) {
		// a(5)とb(3)を乗算
		int result = a * b;
		// Multiplication result:と計算結果をコンソールに出力
		System.out.println("Multiplication result: " + result + "\n");
	}

	// Q3 
	// 整数の配列を引数として受け取り、配列の値を順番にコンソールに出力
	public static void printArrayValues(int[] array) {
		// arrayという名前の整数型の配列から要素を1つずつ取り出しnumberに格納しそれを表示
		for (int number : array) {
			// numberを出力
			System.out.println(number);
		}
		// 改行
		System.out.println();
	}

	// Q4
	// 2つの小数を引数として受け取り、それらの値を和算し、結果をコンソールに出力
	public static void addNumbers(double a, double b) {
		// aとbを足す
		double result = a + b;
		// Addition result:と計算の結果を出力
		System.out.println("Addition result: " + result + "\n");
	}

	// Q5
	// 1から100までのランダムな整数を指定された回数だけ生成し、配列に格納します。生成された値は順番にコンソールに出力
	public static int[] getRandomNumbers(int count) {
	    int[] randomNumbers = new int[count];
	    Random random = new Random();
	    // randomNumbersのi番目に1～100までのランダムな整数を格納する
	    for (int i = 0; i < count; i++) {
	        randomNumbers[i] = random.nextInt(100) + 1;
	    }

	    return randomNumbers;
	}

	// Q6
	// 整数の配列を引数として受け取り、配列の要素の平均値を計算して出力
	public static double calculateAverage(int[] array) {
		int sum = 0;
		// arrayという名前の整数型の配列から要素を1つずつ取り出しsumにすべて足したものを格納する
		for (int number : array) {
			sum += number;
		}
		// 配列のすべての平均値を出力
		return (double) sum / array.length;
	}
	
	// Q7
	// 引数として与えられた値が50以上であれば「turu」50以下であれば「false]と出力
	public static boolean checkIfAbove50(double value) {
	    // 改行
		System.out.println();
		// 引数valueが50以上であればtrueが返され、それ以外の場合はfalse
		return value >= 50;
	}
}