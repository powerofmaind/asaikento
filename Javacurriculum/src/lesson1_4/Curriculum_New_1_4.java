package lesson1_4;

public class Curriculum_New_1_4 {

    public static void main(String[] args) {
        // Q1 下記9個をローカル変数として宣言のみしてください
        //     ・バイト型・短整数型・整数型・長整数型
        byte myByte;
        short myShort;
        int myInt;
        long myLong;
        //     ・単精度浮動小数点数型・倍精度浮動小数点数型
        float myFloat;
        double myDouble;
        //     ・文字型・文字列型
        char myChar;
        String myString;
        //     ・ブーリアン型 
        boolean myBoolean;
        
        // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
        myByte = 0;
        myShort = 0;
        myInt = 0;
        myLong = 0L;
        myFloat = 0.0f;
        myDouble = 0.0;
        myChar = '\u0000';
        myString = null;
        myBoolean = false;
        
        // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
   
        // ・バイト型                 10
        myByte = 10;
        // ・短整数型                 100
        myShort  = 100;
        // ・整数型                     1000
        myInt = 1000;
        // ・長整数型                 10000
        myLong = 10000;
        // ・単精度浮動小数点数型      9.5
        myFloat = 9.5f;
        // ・倍精度浮動小数点数型      10.5
        myDouble = 10.5;
        // ・文字型                   a
        myChar = 'a';
        // ・文字列型                ハロー
        myString = "ハロー";
        // ・ブーリアン型              true
        myBoolean = true;
            
        // Q4 下記の通りにコンソール出力されるようにしてください
        // 必ず変数を使用すること
   
        // 11110
        //バイト型、短整数型 、整数型、長整数型の値をsum1に代入しコンソールに出力する
        Long sum1 = myByte + myShort + myInt + myLong;
        System.out.println(sum1);
        // 20.0
        //myDoubleとmyFloatの値を足し合わせsum2に代入しコンソールに出力する
        double sum2 = myDouble + myFloat;
        System.out.println(sum2);
        // a ハロー true
        //文字型、文字列型、ブーリアン型を足し各型の間に(” ")で空白を作ってコンソールに出力する
        System.out.println(myChar + " " + myString + " " + myBoolean);
        // 11130.0                    数字を全て足す
        //myByte、myShort、myInt、myLong、myFloat、myDouble の値を全て足し合わせて、その結果を double 型の変数 sum3 に代入しコンソールに出力する
        double sum3 = myByte + myShort + myInt + myLong + myFloat + myDouble;
        System.out.println(sum3);
        // 10000000000                小数点以外の数字を全てかける
        //myByte の値を long 型にキャストし、4つの変数の値を乗算した結果を long 型の変数 product に代入して、コンソールに出力する
        long product = (long)myByte * myShort * myInt * myLong;
        System.out.println(product);
        // 0.105                      10.5割る100をする
        //10.5が格納されているDouble型変数「myDouble」を100で割ってquotientに代入してコンソールに出力する
        double quotient = myDouble / 100;
        System.out.println(quotient);
        // -90                        10引く100をする
        //10が格納されているbyte型変数「myByte」から100が格納されているShort型変数「myShor」tを引きdiffrenceに代入してコンソールに出力する
        int difference = myByte - myShort;
        System.out.println(difference);
        
       // Q5 
       // 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
       //「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
       String num = "20";
       int num1 = 23;
       //String型変数numをint型に変換してnum2に格納、int型変数num1と足してresultに格納しコンソールに「ハローJAVA」と一緒に出力する。
       int num2 = Integer.parseInt(num);
       int result = num1 + num2;
       System.out.println("ハローJAVA" + result);
        
    }

}
