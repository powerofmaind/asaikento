package lesson1_4;

public class Curriculum_New_1_4 {

    public static void main(String[] args) {
        // Q1 ���L9�����[�J���ϐ��Ƃ��Đ錾�݂̂��Ă�������
        //     �E�o�C�g�^�E�Z�����^�E�����^�E�������^
        byte myByte;
        short myShort;
        int myInt;
        long myLong;
        //     �E�P���x���������_���^�E�{���x���������_���^
        float myFloat;
        double myDouble;
        //     �E�����^�E������^
        char myChar;
        String myString;
        //     �E�u�[���A���^ 
        boolean myBoolean;
        
        // Q2 ���ꂼ��̃N���X�ϐ������[�J�����ł��ꂼ��̏����l���������������Ă�������
        myByte = 0;
        myShort = 0;
        myInt = 0;
        myLong = 0L;
        myFloat = 0.0f;
        myDouble = 0.0;
        myChar = '\u0000';
        myString = null;
        myBoolean = false;
        
        // Q3 ���������������ꂼ��̕ϐ��ɉ��L�̒l�������Ă�������
   
        // �E�o�C�g�^                 10
        myByte = 10;
        // �E�Z�����^                 100
        myShort  = 100;
        // �E�����^                     1000
        myInt = 1000;
        // �E�������^                 10000
        myLong = 10000;
        // �E�P���x���������_���^      9.5
        myFloat = 9.5f;
        // �E�{���x���������_���^      10.5
        myDouble = 10.5;
        // �E�����^                   a
        myChar = 'a';
        // �E������^                �n���[
        myString = "�n���[";
        // �E�u�[���A���^              true
        myBoolean = true;
            
        // Q4 ���L�̒ʂ�ɃR���\�[���o�͂����悤�ɂ��Ă�������
        // �K���ϐ����g�p���邱��
   
        // 11110
        //�o�C�g�^�A�Z�����^ �A�����^�A�������^�̒l��sum1�ɑ�����R���\�[���ɏo�͂���
        Long sum1 = myByte + myShort + myInt + myLong;
        System.out.println(sum1);
        // 20.0
        //myDouble��myFloat�̒l�𑫂����킹sum2�ɑ�����R���\�[���ɏo�͂���
        double sum2 = myDouble + myFloat;
        System.out.println(sum2);
        // a �n���[ true
        //�����^�A������^�A�u�[���A���^�𑫂��e�^�̊Ԃ�(�h ")�ŋ󔒂�����ăR���\�[���ɏo�͂���
        System.out.println(myChar + " " + myString + " " + myBoolean);
        // 11130.0                    ������S�đ���
        //myByte�AmyShort�AmyInt�AmyLong�AmyFloat�AmyDouble �̒l��S�đ������킹�āA���̌��ʂ� double �^�̕ϐ� sum3 �ɑ�����R���\�[���ɏo�͂���
        double sum3 = myByte + myShort + myInt + myLong + myFloat + myDouble;
        System.out.println(sum3);
        // 10000000000                �����_�ȊO�̐�����S�Ă�����
        //myByte �̒l�� long �^�ɃL���X�g���A4�̕ϐ��̒l����Z�������ʂ� long �^�̕ϐ� product �ɑ�����āA�R���\�[���ɏo�͂���
        long product = (long)myByte * myShort * myInt * myLong;
        System.out.println(product);
        // 0.105                      10.5����100������
        //10.5���i�[����Ă���Double�^�ϐ��umyDouble�v��100�Ŋ�����quotient�ɑ�����ăR���\�[���ɏo�͂���
        double quotient = myDouble / 100;
        System.out.println(quotient);
        // -90                        10����100������
        //10���i�[����Ă���byte�^�ϐ��umyByte�v����100���i�[����Ă���Short�^�ϐ��umyShor�vt������diffrence�ɑ�����ăR���\�[���ɏo�͂���
        int difference = myByte - myShort;
        System.out.println(difference);
        
       // Q5 
       // ���̃v���O���������s����Ɓu�n���[JAVA2023�v�Ƃ������ʂ��\������܂��B
       //�u�n���[JAVA43�v�ƕ\���Ƃ��������̂ł����A�Ӑ}�ʂ�ɓ����܂���B���������삷��悤�ɏC�����Ă��������B
       String num = "20";
       int num1 = 23;
       //String�^�ϐ�num��int�^�ɕϊ�����num2�Ɋi�[�Aint�^�ϐ�num1�Ƒ�����result�Ɋi�[���R���\�[���Ɂu�n���[JAVA�v�ƈꏏ�ɏo�͂���B
       int num2 = Integer.parseInt(num);
       int result = num1 + num2;
       System.out.println("�n���[JAVA" + result);
        
    }

}
