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
        System.out.println("\n2. Поиск max и min числа\n");

        int num1 = 18;
        int num2 = 34;

        System.out.println("Исходные числа: " + num1 + " и " + num2);

        if(num1 > num2) {
            System.out.println("\nМаксимальное число: " + num1);
            System.out.println("Минимальное число: " + num2);
        } else if(num1 < num2) {
            System.out.println("\nМаксимальное число: " + num2);
            System.out.println("Минимальное число: " + num1);
        } else {
            System.out.println("\nОба числа равны");
        }

        //Задача_3: Проверка числа
        System.out.println("\n3. Проверка числа\n");

        int num3 = 2023;

        if(num3 != 0) {
            System.out.print("Число: " + num3 + " - является");
            System.out.printf("%s", num3 % 2 == 0 ? " четным" : " нечетным");
            System.out.printf("%s", num3 > 0 ? " и положительным" : " и отрицательным");
        } else {
            System.out.println("Число " + num3 + " является нулем");
        }

        //Задача_4: Поиск одинаковых цифр в числах
        System.out.println("\n\n4.Поиск одинаковых цифр в числах\n");

        int num4 = 765;
        int num5 = 725;

        System.out.println("Исходные числа: " + num4 + " и " + num5);

        int num4Ones = num4 % 10;
        int num4Tens = num4 / 10 % 10;
        int num4Hundreds = num4 / 100;

        int num5Ones = num5 % 10;
        int num5Tens = num5 / 10 % 10;
        int num5Hundereds = num5 / 100;

        if(num4Hundreds != num5Hundereds && num4Tens != num5Tens && num4Ones != num5Ones) {
            System.out.println("\nРавных цифр нет");
        } else {
            if(num4Hundreds == num5Hundereds) {
                System.out.println("В первом разряде цифры равны: " + num4Hundreds + " = " + 
                        num5Hundereds);
            }
            if(num4Tens == num5Tens) {
                System.out.println("Во втором разряде цифры равны: " + num4Tens + " = " + num5Tens);
            }
            if(num4Ones == num5Ones) {
                System.out.println("В третьем разряде цифры равны: " + num4Ones + " = " + 
                        num5Ones);
            }
        }

        //Задача_5: Определение символа по его коду
        System.out.println("\n5.Определение символа по его коду\n");

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
        int numPercent = 10;

        System.out.println("Сумма вклада: " + sumBank);

        if(sumBank < 100_000) {
            numPercent = 5;
        } else if(sumBank >= 100_000 && sumBank <= 300_000) {
            numPercent = 7;
        }

        int sumPercent = (sumBank * numPercent) / 100;
        int sumTotal = sumBank + sumPercent;

        System.out.println("Начисленный %: " + sumPercent);
        System.out.println("Итоговую сумма с %: " + sumTotal);

        //Задача_7: Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам\n");

        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 2;
        int programmingGrade = 2;

        if(historyPercent > 91) {
            historyGrade = 5;
        } else if(historyPercent > 73) {
            historyGrade = 4;
        } else if(historyPercent > 60) {
            historyGrade = 3;
        }

        System.out.println("Оценка по истории: " + historyGrade);

        if(programmingPercent > 91) {
            programmingGrade = 5;
        } else if(programmingPercent > 73) {
            programmingGrade = 4;
        } else if(programmingPercent > 60) {
            programmingGrade = 3;
        }

        System.out.println("Оценка по программированию: " + programmingGrade);

        int avgPercent = (historyPercent + programmingPercent) / 2;
        double avgGrade = (historyGrade + programmingGrade) / 2;

        System.out.println("\nСредний балл оценок по предметам: " + avgGrade);
        System.out.println("Средний % по предметам: " + avgPercent);

        //Задача_8: Расчет прибыли за год
        System.out.println("\n8.Расчет прибыли за год\n");

        int arenda = 5_000;
        int monthProfit = 13_000;
        int priceProduct = 9_000;
        int yearProfit = (monthProfit - (priceProduct + arenda)) * 12;
        char signPlus = ' ';

        if(yearProfit > 0) {
            signPlus = '+';
        }

        System.out.println("Прибыль за год: " + signPlus + yearProfit + " руб.");

        //Задача_9: Подсчет количества банкнот
        System.out.println("\n9.Подсчет количества банкнот\n");

        int sumRequestedUsd = 567;
        int sumRequestedHundreds = sumRequestedUsd / 100;
        int sumRequestedTens = sumRequestedUsd / 10 % 10;
        int sumRequestedOnes = sumRequestedUsd % 10;

        int sumHundredsInBank = 10;
        int sumTensInBank = 5;
        int sumOnesInBank = 50;
        int sumUsdInBank = (sumHundredsInBank * 100) + (sumTensInBank * 10) + sumOnesInBank;

        int outSumHundredsInBank = 0;
        int outSumTensInBank = 0;

        if(sumRequestedUsd <= sumUsdInBank && sumOnesInBank >= sumRequestedOnes) {
            if(sumHundredsInBank >= sumRequestedHundreds) {
                outSumHundredsInBank = sumRequestedHundreds;
                sumHundredsInBank -= sumRequestedHundreds;
            } else {
                outSumHundredsInBank = sumHundredsInBank;
                sumRequestedTens += (sumRequestedHundreds - sumHundredsInBank) * 10;
            }
            if(sumTensInBank > sumRequestedTens) {
                outSumTensInBank = sumRequestedTens;
                sumTensInBank -= sumRequestedTens;
            } else {
                outSumTensInBank = sumTensInBank;
                sumRequestedOnes += (sumRequestedTens - sumTensInBank) * 10;
            }
            sumOnesInBank -= sumRequestedOnes;
            sumRequestedUsd = (outSumHundredsInBank * 100) + (outSumTensInBank * 10) 
                    + sumRequestedOnes;
            System.out.println("Сумма выдачи равна: " + sumRequestedUsd);
            System.out.println("Выдача банкнот номиналом 100: " + outSumHundredsInBank);
            System.out.println("Выдача банкнот номиналом 10: " + outSumTensInBank);
            System.out.println("Выдача банкнот номиналом 1: " + sumRequestedOnes);
        } else {
            System.out.println("Недостаточно банкнот для выдачи всей суммы!\n" + 
                    "Максимально доступная сумма выдачи: " + sumUsdInBank);
        }
    }
}