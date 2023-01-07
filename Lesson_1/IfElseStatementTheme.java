public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Задача_1: Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java\n");

        int age = 18;

        if(age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }

        char gender = 'W';

        if(gender != 'M') {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        double height = 1.85;

        if(height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }

        char capitalLetter = "Maria".charAt(0);

        if(capitalLetter == 'M') {
            System.out.println("Первая буква в имени = " + capitalLetter);
        } else if(capitalLetter == 'I') {
            System.out.println("Первая буква в имени = " + capitalLetter);
        } else {
            System.out.println("Имя не указано");
        }

        //Задача_2: Поиск max и min числа
        System.out.println("\n\n2. Поиск max и min числа\n");

        int num1 = 18;
        int num2 = 34;

        if(num1 > num2) {
            System.out.println("Максимальное число: " + num1);
            System.out.println("\nМинимальное число: " + num2);
        } else if(num1 < num2) {
            System.out.println("Максимальное число: " + num2);
            System.out.println("\nМинимальное число: " + num1);
        } else {
            System.out.println("Оба числа равны");
        }

        //Задача_3: Проверка числа
        System.out.println("\n\n3. Проверка числа\n");

        int num3 = 2023;

        if(num3 != 0) {
            System.out.print("Число: " + num3 + " - является");
            if(num3 % 2 == 0) {
                System.out.print(" четным");
            } else {
                System.out.print(" нечетным");
            }
            if(num3 > 0) {
                System.out.print(" и положительным");
            } else {
                System.out.print(" и отрицательным");
            }
        } else {
            System.out.println("Число " + num3 + " является нулем");
        }

        //Задача_4: Поиск одинаковых цифр в числах
        System.out.println("\n\n\n4.Поиск одинаковых цифр в числах\n");

        int num4 = 765;
        int num5 = 725;

        System.out.println("Исходные числа: " + num4 + " и " + num5);

        int num4Ones = num4 % 10;
        int num4Ten = num4 / 10 % 10;
        int num4Hundred = num4 / 100;

        int num5Ones = num5 % 10;
        int num5Ten = num5 / 10 % 10;
        int num5Hundered = num5 / 100;

        if(num4Hundred == num5Hundered) {
            System.out.println("В первом разряде цифры равны: " + num4Hundred + " = " + 
                    num5Hundered);
        }
        if(num4Ten == num5Ten) {
            System.out.println("Во втором разряде цифры равны: " + num4Ten + " = " + num5Ten);
        }
        if(num4Ones == num5Ones) {
            System.out.println("В третьем разряде цифры равны: " + num4Ones + " = " + 
                    num5Ones);
        }
        if(num4Hundred != num5Hundered) {
            if(num4Ten != num5Ten && num4Ones != num5Ones) {
                System.out.println("\nРавных цифр нет");
            }
        }

        //Задача_5: Определение символа по его коду
        System.out.println("\n\n5.Определение символа по его коду\n");

        char code = '\u0057';

        System.out.print("Символ: " + code);

        if(code >= '0' && code <= '9') {
            System.out.print(" число");
        } else if(code >= 'A' && code <= 'Z') {
            System.out.print(" большая буква");
        } else if(code >= 'a' && code <= 'z') {
            System.out.print(" маленькая буква");
        } else {
            System.out.print(" не буква и не число");
        }

        //Задача_6: Подсчет суммы вклада и начисленных банком %
        System.out.println("\n\n6.Подсчет суммы вклада и начисленных банком %\n");

        int sumBank = 300_000;
        int sumPercent = 0;
        int sumTotal = 0;

        System.out.println("Сумма вклада: " + sumBank);

        if(sumBank < 100_000) {
            sumPercent = sumBank * 5 / 100;
        } else if(sumBank <= 300_000) {
            sumPercent = sumBank * 7 / 100;
        } else {
            sumPercent = sumBank * 10 / 100;
        }
        sumTotal = sumBank + sumPercent;

        System.out.println("Начисленный %: " + sumPercent);
        System.out.println("Итоговую сумма с %: " + sumTotal);

        //Задача_7: Определение оценки по предметам
        System.out.println("\n\n7.Определение оценки по предметам\n");

        int historyBall = 59;
        int programmBall = 91;
        int markHistory;
        int markProgramm ;

        if(historyBall < 91) {
            markHistory = 4;
        } else {
            markHistory = 5;
        }
        if(historyBall < 73) {
            markHistory = 3;
        }
        if(historyBall <= 60) {
            markHistory = 2;
        }

        System.out.println("Оценка по истории: " + markHistory);

        if(programmBall < 91) {
            markProgramm = 4;
        } else {
            markProgramm = 5;
        }
        if(programmBall < 73) {
            markProgramm = 3;
        }
        if(programmBall <= 60) {
            markProgramm = 2;
        }

        System.out.println("Оценка по программированию: " + markProgramm);

        int avgBall = (historyBall + programmBall) / 2;
        int markAvg = (markHistory + markProgramm) / 2;

        System.out.println("\nСредний балл оценок по предметам: " + markAvg);
        System.out.println("Средний % по предметам: " + avgBall);

        //Задача_8: Расчет прибыли за год
        System.out.println("\n\n8.Расчет прибыли за год\n");

        int arenda = 5_000;
        int monthProfit = 13_000;
        int priceProduct = 9_000;
        int yearProfit = monthProfit - priceProduct - arenda;

        if(yearProfit > 0) {
            System.out.println("Прибыль за год: + " + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }

        //Задача_9: Подсчет количества банкнот
        System.out.println("\n\n9.Подсчет количества банкнот\n");

        int sumUsd = 567;
        int usd100 = sumUsd / 100;
        int usd10 = sumUsd / 10 % 10;
        int usd1 = sumUsd % 10;

        int numB100 = 10;
        int numB10 = 5;
        int numB1 = 50;
        int numMax = (numB100 * 100) + (numB10 * 10) + numB1;

        if(sumUsd <= numMax && numB1 >= usd1) {
            if(numB100 > usd100) {
                numB100 -= usd100;
                System.out.println("Выдача банкнот номиналом 100: " + usd100);
                sumUsd += usd100 * 100;
            } else {
                usd100 -= numB100;
                System.out.println("Выдача банкнот номиналом 100: " + numB100);
                usd10 += usd100 * 10;
                sumUsd += numB100 * 100;
            }
            if(numB10 > usd10) {
                numB10 -= usd10;
                System.out.println("Выдача банкнот номиналом 10: " + usd10);
                sumUsd += usd10 * 10;
            } else {
                usd10 -= numB10;
                System.out.println("Выдача банкнот номиналом 10: " + numB10);
                usd1 += usd10 * 10;
                sumUsd += numB10 * 10;
            }
            numB1 -= usd1;
            System.out.println("Выдача банкнот номиналом 1: " + usd1);
            sumUsd = (sumUsd + usd1) / 2;
            System.out.println("\nСумма выдачи равна: " + sumUsd);

        } else {
            System.out.println("\nНедостаточно банкнот для выдачи всей суммы!\n" + 
                    "\nМаксимально доступная сумма выдачи: " + numMax);
        }
    }
}