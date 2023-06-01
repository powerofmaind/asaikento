package lesson_19;

public class Dog {
	// 動物の名前のフィールド
	private String name; 
	// 動物の数のフィールド
	private int count; 

	public Dog() {
		// コンストラクタで名前を初期化
		setName("犬"); 
		// コンストラクタで数を初期化
		setCount(1); 
	}

	public Dog(String name, int count) {
		// 引数で受け取った名前を設定
		setName(name);

		// 引数で受け取った数を設定
		setCount(count); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}