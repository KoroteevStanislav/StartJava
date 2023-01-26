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
        if(num4Hundred != num5Hundered && num4Ten != num5Ten && num4Ones != num5Ones) {
            System.out.println("\nРавных цифр нет");
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

        System.out.println("Сумма вклада: " + sumBank);

        if(sumBank < 100_000) {
            sumPercent = sumBank * 5 / 100;
        } else if(sumBank <= 300_000) {
            sumPercent = sumBank * 7 / 100;
        } else {
            sumPercent = sumBank * 10 / 100;
        }
        int sumTotal = sumBank + sumPercent;

        System.out.println("Начисленный %: " + sumPercent);
        System.out.println("Итоговую сумма с %: " + sumTotal);

        //Задача_7: Определение оценки по предметам
        System.out.println("\n\n7.Определение оценки по предметам\n");

        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 0;
        int programmingGrade = 0;

        if(historyGrade == 0) {
            if(historyPercent > 60) {
                historyGrade = 3;
                if(historyPercent > 73 && historyPercent < 91) {
                    historyGrade = 4;
                } else {
                    historyGrade = 5;
                }
            } else {
                historyGrade = 2;
            }
        }

        System.out.println("Оценка по истории: " + historyGrade);

        if(programmingGrade == 0) {
            if(programmingPercent > 60) {
                programmingGrade = 3;
                if(programmingPercent > 73 && programmingPercent < 91) {
                    programmingGrade = 4;
                } else {
                    programmingGrade = 5;
                }
            } else {
                programmingGrade = 2;
            }
        }

        System.out.println("Оценка по программированию: " + programmingGrade);

        int avgPercent = (historyPercent + programmingPercent) / 2;
        int avgGrade = (historyGrade + programmingGrade) / 2;

        System.out.println("\nСредний балл оценок по предметам: " + avgGrade);
        System.out.println("Средний % по предметам: " + avgPercent);

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

        int sumRequestedUsd = 567;
        int sumRequestedHundreds = sumRequestedUsd / 100;
        int sumRequestedTens = sumRequestedUsd / 10 % 10;
        int sumRequestedOnes = sumRequestedUsd % 10;

        int sumHundredsInBank = 10;
        int sumTensInBank = 5;
        int sumOnesInBank = 50;
        int sumUsdInBank = (sumHundredsInBank * 100) + (sumTensInBank * 10) + sumOnesInBank;

        if(sumRequestedUsd <= sumUsdInBank && sumOnesInBank >= sumRequestedOnes) {
            if(sumHundredsInBank > sumRequestedHundreds) {
                sumHundredsInBank -= sumRequestedHundreds;
                System.out.println("Выдача банкнот номиналом 100: " + sumRequestedHundreds);
                sumRequestedUsd += sumRequestedHundreds * 100;
            } else {
                sumRequestedHundreds -= sumHundredsInBank;
                System.out.println("Выдача банкнот номиналом 100: " + sumHundredsInBank);
                sumRequestedTens += sumRequestedHundreds * 10;
                sumRequestedUsd += sumHundredsInBank * 100;
            }
            if(sumTensInBank > sumRequestedTens) {
                sumTensInBank -= sumRequestedTens;
                System.out.println("Выдача банкнот номиналом 10: " + sumRequestedTens);
                sumRequestedUsd += sumRequestedTens * 10;
            } else {
                sumRequestedTens -= sumTensInBank;
                System.out.println("Выдача банкнот номиналом 10: " + sumTensInBank);
                sumRequestedOnes += sumRequestedTens * 10;
                sumRequestedUsd += sumTensInBank * 10;
            }
            sumOnesInBank -= sumRequestedOnes;
            System.out.println("Выдача банкнот номиналом 1: " + sumRequestedOnes);
            sumRequestedUsd = (sumRequestedUsd + sumRequestedOnes) / 2;
            System.out.println("\nСумма выдачи равна: " + sumRequestedUsd);

        } else {
            System.out.println("\nНедостаточно банкнот для выдачи всей суммы!\n" + 
                    "\nМаксимально доступная сумма выдачи: " + sumUsdInBank);
        }
    }
}