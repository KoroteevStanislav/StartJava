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
        int max = 10;
        int min = -1;

        for(int i = max - 1; i > min; i--) {
            System.out.printf("% 2d",i);
        }

        //Задача_3: Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");

        int num4 = 1_234;
        int sumRemainders = 0;

        System.out.print("Реверсивное число: ");

        while(num4 > 0) {
            int remainder = num4 % 10;
            sumRemainders += remainder;
            num4 /= 10;
            System.out.print(remainder);
        }

        System.out.println("\nСумма чисел равна: " + sumRemainders);

        //Задача_4: Вывод чисел на консоль в несколько строк
        System.out.println("\n4.Вывод чисел на консоль в несколько строк\n");

        int endRange = 24;

        for(int i = 1; i < endRange;) {
            for(int j = 0; j < 5; j++) {
                if(i < endRange) {
                    System.out.printf("% 3d", i);
                    i += 2;
                    if(j == 4) {
                        System.out.println();
                    }
                } else {
                    System.out.printf("% 3d", 0);
                }
            }
        }

        //Задача_5: Проверка количества двоек на четность/нечетность
        System.out.println("\n5.Проверка количества двоек на четность/нечетность\n");

        int num5 = 3_242_592;
        int digit = num5;
        int sumTwos = 0;

        System.out.print("Число: " + num5 + " содержит ");

        while(digit > 0) {
            if(digit % 10 == 2) {
                sumTwos++;
            }
            digit /= 10;
        }

        System.out.print("Двоек: " + sumTwos);

        if(sumTwos % 2 == 0) {
            System.out.print(" - четное количество\n");
        } else {
            System.out.print(" - нечетное количество\n");
        }

        //Задача_6: Отображение фигур в консоли
        System.out.println("\n6.Отображение фигур в консоли\n");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int numLines = 5;
        int numCharInLine = 5;

        while (numLines > 0) {
            numLines--;
            while(numCharInLine > 0) {
                System.out.print("#");
                numCharInLine--;
            }
            System.out.println();
            numCharInLine = numLines;
        }

        System.out.println();

        numLines = 0;
        numCharInLine = 0;
        int numMaxChar = 2;

        do {
            do {
                System.out.print("$");
                numLines++;
            } while(numLines <= numCharInLine);
            System.out.println();
            if(numCharInLine >= numMaxChar) {
                numMaxChar--;
                numCharInLine--;
            } else {
                numCharInLine++;
            }
            numLines = 0;
        } while(numMaxChar >= 0);

        //Задача_7: Отображение ASCII-символов
        System.out.println("\n7.Отображение ASCII-символов\n");

        System.out.println("Dec Char");

        for(int i = 33; i < 48; i++) {
            if(i % 2 != 0) {
                System.out.printf("%1$3d%2$3s\n", i, (char) i);
            }
        }

        System.out.println("\nDec Char");

        for(int i = 97; i < 123; i++) {
            if(i % 2 == 0) {
                System.out.printf("%1$3d%2$3s\n", i, (char) i);
            }
        }

        //Задача_8: Проверка, является ли число палиндромом
        System.out.println("\n8.Проверка, является ли число палиндромом\n");

        int num6 = 1_234_321;
        int copyNum6 = num6;
        int reverse = 0;

        System.out.print("Число: " + num6 + " является ");

        while(copyNum6 > 0) {
            reverse = reverse * 10 + copyNum6 % 10;
            copyNum6 /= 10;
        }

        System.out.printf("%s", num6 == reverse ? "палиндромом\n" : "не палиндромом\n");

        //Задача_9: Определение, является ли число счастливым
        System.out.println("\n9.Определение, является ли число счастливым\n");

        int num7 = 467_359;
        int rightHalfNum7 = num7 % 1000;
        int leftHalfNum7 = num7 / 1000;
        int sumRight = 0;
        int sumLeft = 0;

        System.out.print("Число: " + num7 + " является ");
        
        for(int i = 1; i <= 3; i++) {
            sumLeft += leftHalfNum7 % 10;
            sumRight += rightHalfNum7 % 10;
            rightHalfNum7 /= 10;
            leftHalfNum7 /= 10;
        }

        System.out.printf("%s", sumRight == sumLeft ? "счастливым\n" : "не счастливым\n");

        //Задача_10: Вывод таблицы умножения Пифагора
        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");

        System.out.printf("%25s%n", "ТАБЛИЦА ПИФАГОРА\n");

        for(int i = 0; i < 10; i++) {
            if(i == 0) {
                System.out.printf("%4s", "|");
            } else if(i == 1) {
                System.out.printf("%1$3s%2$s", "_", "|");
            } else {
                System.out.printf("%1$3d%2$s", i, "|");
            }
            for(int j = 2; j < 10; j++) {
                if(i == 0) {
                    System.out.printf("%3d", j);
                } else if(i == 1) {
                    System.out.printf("%s", "___");
                } else if(i > 1) {
                    System.out.printf("% 3d", (j * i));
                }
            }
            System.out.println();
        }
    }
}