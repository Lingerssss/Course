package main.dataType;

public class data {
    void run(){
        /*        //32bit
        int number = 1;
        //64bit
        long number2 = 1L;
        //16bit
        short s = 1;

        //8bit = 1byte
        byte b = 1;
        System.out.println("max int value = "+Integer.MAX_VALUE);
        System.out.println("min int value = "+Integer.MIN_VALUE);

        float xiao = 1.1f;
        double xiao2 = 0.1;

        char c = 'a';
        char c2 = 's';
        char c3 = '&';

//      String char的集合


        boolean isN = true;
        boolean ist = false;*/

        //+ - * / % 计算符号

        int s1 = 1;
        int s2 = 2;

        int s3 = s1 + s2;
        int s4 = s1 - s2;
        int s5 = s1 * s2;
        int s6 = s1 / s2;
        int s7 = 573 % 21;

        System.out.println(s1 + " + " + s2 + " = " + s3);
        System.out.println(s1 + " - " + s2 + " = " + s4);
        System.out.println(s1 + " * " + s2 + " = " + s5);
        System.out.println(s1 + " / " + s2 + " = " + s6);
        System.out.println(573 + " % " + 21 + " = " + s7);

        //与或非

        boolean fact1 = true;
        boolean fact2 = false;

        boolean result1 = true && true;
        boolean result2 = true || true;
        boolean result3 = !true;

        var a = 2&1;
        System.out.println(a);
    }
}
