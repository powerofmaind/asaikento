package lesson1_16;

public class Curriculum_New_1_16_1 {
    public static void main(String[] args) {

        System.out.println("課題4");

        // 掛け算の九九をループで表示
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i*j) + " || ");
            }
            System.out.println();
        }
        System.out.println("\n" + "課題5");

        // 掛け算の九九をループで表示
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i) + " = " + String.format("%03d", i*j) + " || ");
            }
            System.out.println();
    }
}
}
