package lesson_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String name;
	// Q2：フィールドに動物の数の変数を定義してください。
	private int count;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    public Dog() {
        setName("犬");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	{
        setCount(1);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}