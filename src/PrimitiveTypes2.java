public class PrimitiveTypes2 {

    public static void main(String[] args) {

        //byte has a range from –128 to 127

        byte value1 = -120;
        byte value2 = -100;
        byte value3 = 0;
        byte value4 = 100;
        byte value5 = 120;

        //short has a range from –32,768 to 32,767

        short quantity1 = -32768;
        short quantity2 = -20100;
        short quantity3 = -10000;
        short quantity4 = -4523;
        short quantity5 = -523;
        short quantity6 = -12;
        short quantity7 = 0;
        short quantity8 = 111;
        short quantity9 = 12345;
        short quantity10 = 22222;

        //int has a range from –2,147,483,648 to 2,147,483,647

        int rate1 = -2111235987;
        int rate2 = -3447502;
        int rate3 = -604357;
        int rate4 = -1120;
        int rate5 = 55556;
        int rate6 = 856269;
        int rate7 = 6986596;
        int rate8 = 56929659;
        int rate9 = 1221569836;

        //long is useful when an int type isn't large enough to hold the desired value

        long l1 = -5698741236695565656l;
        long l2 = -122333687655556l;
        long l3 = -89898989898l;
        long l4 = 44444789l;
        long l5 = 1122334455778899686l;

        //float specifies a single-precision value that uses 32 bits of storage

        float number1 = 1.23f;
        float number2 = -2.5f;
        float number3 = 56.1f;
        float number4 = 3.45f;
        float number5 = 11.11f;

        //double uses 64 bits to store a value

        double number6 = 2365.55;
        double number7 = 223.1;
        double number8 = 9884569652.23;
        double number9 = -546.3;
        double number10 = -5965556959595632.136;

        //demonstration of char data type

        char x = '@';
        char y = 'A';
        char a = '$';
        char b = '(';
        char c = ')';

        //demonstration of booleans

        boolean result; // 1000 < 100
        result = true;
        result = false;

        boolean result2; // 1000 > 100
        result2 = true;
        result2 = false;

        System.out.println("Value 1 = " + value1);
        System.out.println("Value 2 = " + value2);
        System.out.println("Value 3 = " + value3);
        System.out.println("Value 4 = " + value4);
        System.out.println("Value 5 = " + value5);

        System.out.println("Quantity 1 = " + quantity1);
        System.out.println("Quantity 2 = " + quantity2);
        System.out.println("Quantity 3 = " + quantity3);
        System.out.println("Quantity 4 = " + quantity4);
        System.out.println("Quantity 5 = " + quantity5);
        System.out.println("Quantity 6 = " + quantity6);
        System.out.println("Quantity 7 = " + quantity7);
        System.out.println("Quantity 8 = " + quantity8);
        System.out.println("Quantity 9 = " + quantity9);
        System.out.println("Quantity 10 = " + quantity10);

        System.out.println("Rate is: " + rate1);
        System.out.println("Rate is: " + rate2);
        System.out.println("Rate is: " + rate3);
        System.out.println("Rate is: " + rate4);
        System.out.println("Rate is: " + rate5);
        System.out.println("Rate is: " + rate6);
        System.out.println("Rate is: " + rate7);
        System.out.println("Rate is: " + rate8);
        System.out.println("Rate is: " + rate9);

        System.out.println("Long number is: " + l1);
        System.out.println("Long number is: " + l2);
        System.out.println("Long number is: " + l3);
        System.out.println("Long number is: " + l4);
        System.out.println("Long number is: " + l5);

        System.out.println("Amount is approximately " + number1);
        System.out.println("Amount is approximately " + number2);
        System.out.println("Amount is approximately " + number3);
        System.out.println("Amount is approximately " + number4);
        System.out.println("Amount is approximately " + number5);

        System.out.println("Amount is approximately " + number6);
        System.out.println("Amount is approximately " + number7);
        System.out.println("Amount is approximately " + number8);
        System.out.println("Amount is approximately " + number9);
        System.out.println("Amount is approximately " + number10);

        System.out.println("We use character " + x);
        System.out.println("We use character " + y);
        System.out.println("We use character " + a);
        System.out.println("We use character " + b);
        System.out.println("We use character " + c);

        System.out.println("Result is " + false);
        System.out.println("Result is " + true);


    }

}
