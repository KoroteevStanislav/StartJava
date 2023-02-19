public class CyclesTheme {
    public static void main(String[] args) {
        //Задача_1: Подсчет суммы четных и нечетных чисел
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел\n");

        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println("В отрезке: от -10 до 21 сумма четных чисел = " + sumEven + "," 
                + " а нечетных = " + sumOdd);

        //Задача_2: Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;

        if(num1 > num2) {
            max = num1 > num3 ? num1 : num3;
            min = num2 < num3 ? num2 : num3;
        } else {
            max = num1 < num3 ? num1 : num3;
            min = num2 > num3 ? num2 : num3;
        }

        for(int i = max - 1; i > min; i--) {
            System.out.print(i + ", ");
        }

        //Задача_3: Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");

        int num4 = 1_234;
        int sumRemainder = 0;

        System.out.print("Реверсивное число: ");

        while(num4 > 0) {
            int remainder = num4 % 10;
            sumRemainder += remainder;
            num4 /= 10;
            System.out.print(remainder);
        }

        System.out.println("\nСумма чисел равна: " + sumRemainder);

        //Задача_4: Вывод чисел на консоль в несколько строк
        System.out.println("\n4.Вывод чисел на консоль в несколько строк\n");

        int limitHalfInterval = 24;

        for(int i = 1; i < limitHalfInterval;) {
            for(int y = 0; y < 5; y++) {
                if(i < limitHalfInterval) {
                    System.out.printf("% 3d", i);
                    i += 2;
                    if(y == 4) {
                        System.out.println();
                    }
                } else {
                    System.out.printf("% 3d", 0);
                }
            }
        }

        //Задача_5: Проверка количества двоек на четность/нечетность
        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");

        int num5 = 3_242_592;
        int numTwosInNum5 = 0;
        int sumTwosInNum5 = 0;

        System.out.print("Число: " + num5 + " содержит ");

        while(num5 > 0) {
            numTwosInNum5 = num5 % 10;
            if(numTwosInNum5 == 2) {
                sumTwosInNum5++;
            }
            num5 /= 10;
        }

        System.out.print("Двоек: " + sumTwosInNum5);

        if(sumTwosInNum5 % 2 == 0) {
            System.out.print(" - четное количество");
        } else {
            System.out.print(" - нечетное количество");
        }

        //Задача_6: Отображение фигур в консоли
        System.out.println("\n\n6.Отображение фигур в консоли\n");

        for(int i = 0; i < 5; i++) {
            for(int y = 0; y < 10; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int numLines = 5;
        int numCharInLines = 5;

        while (numLines > 0) {
            numLines--;
            while(numCharInLines > 0) {
                System.out.print("#");
                numCharInLines--;
            }
            System.out.println();
            numCharInLines = numLines;
        }

        System.out.println();

        int numDollarSignInLines = 0;

        do {
            System.out.println("$");
            numDollarSignInLines++;
            if(numDollarSignInLines == 1 || numDollarSignInLines == 3) {
                System.out.print("$");
            } else if(numDollarSignInLines == 2) {
                System.out.print("$$");
            }
        } while(numDollarSignInLines < 5);

        //Задача_7: Отображение ASCII-символов
        System.out.println("\n7.Отображение ASCII-символов\n");

        System.out.println("Dec Char");

        for(int i = 33; i < 48; i++) {
            if(i % 2 != 0) {
                System.out.printf("%1$3d%2$3s\n", i, (char)i);
            }
        }

        System.out.println("\nDec Char");

        for(int i = 97; i < 123; i++) {
            if(i % 2 == 0) {
                System.out.printf("%1$3d%2$3s\n", i, (char)i);
            }
        }

        //Задача_8: Проверка, является ли число палиндромом
        System.out.println("\n8.Проверка, является ли число палиндромом\n");

        int num6 = 1_234_321;
        int numPalindromeCheck = num6;
        int reverse = 0;

        System.out.print("Число: " + num6 + " является ");

        while(numPalindromeCheck != 0) {
            reverse = reverse * 10 + numPalindromeCheck % 10;
            numPalindromeCheck /= 10;
        }

        System.out.printf("%s", num6 == reverse ? "палиндромом" : "не палиндромом");

        //Задача_9: Определение, является ли число счастливым
        System.out.println("\n\n9.Определение, является ли число счастливым\n");

        int num7 = 467_359;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        System.out.print("Число: " + num7 + " является ");
        
        for(int i = 0; i < 3; i++) {
            sumFirstHalf += num7 % 10;
            num7 /= 10;
        }
        for(int i = 0; i < 3; i++) {
            sumSecondHalf += num7 % 10;
            num7 /= 10;
        }

        System.out.printf("%s", sumFirstHalf == sumSecondHalf ? "счастливым" : "не счастливым");

        //Задача_10: Вывод таблицы умножения Пифагора
        System.out.println("\n\n10.Вывод таблицы умножения Пифагора\n");

        int sum1Task10 = 0;

        System.out.printf("%25s%n", "ТАБЛИЦА ПИФАГОРА\n");

        for(int g = 0; g < 10; g++) {
            if(g == 0){
                System.out.printf("%4s", "|");
            } else if(g == 1){
                System.out.printf("%1$3s%2$s", "_", "|");
            } else {
                System.out.printf("%1$3d%2$s", g, "|");
            }
            for(int y = 2; y < 10; y++) {
                sum1Task10 = y * g;
                if(g == 0) {
                    System.out.printf("%3d", y);
                } else if(g == 1) {
                    System.out.printf("%s", "___");
                } else if( g > 1) {
                    System.out.printf("% 3d", sum1Task10);
                }
            }
            System.out.println();
        }
    }
}