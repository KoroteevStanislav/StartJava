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

        if(gender != 'M'){
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        double growth = 1.85;

        if(growth < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }

        char firstInitial = "Maria".charAt(0);

        if(firstInitial == 'M') {
            System.out.println("Первая буква в имени = " + firstInitial);
        } else if(firstInitial == 'I') {
            System.out.println("Первая буква в имени = " + firstInitial);
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
            if(num3 % 2 == 0) {
                if(num3 > 0) {
                    System.out.println("Число " + num3 + " является четным и положительным");
                } else {
                    System.out.println("Число " + num3 + " является четным и отрицательным");
                }
            } else {
                if(num3 < 0) {
                    System.out.println("Число " + num3 + " является нечетным и отрицательным");
                } else {
                    System.out.println("Число " + num3 + " является нечетным и положительным");
                }
            }
        }

        //Задача_4: Поиск одинаковых цифр в числах
        System.out.println("\n\n4.Поиск одинаковых цифр в числах\n");

        int num4 = 525;
        int num5 = 725;

        System.out.println("Исходные числа: " + num4 + " и " + num5);

        int num4Unit = num4%10;
        int num4Ten = num4/10%10;
        int num4Hundred = num4/100;

        int num5Unit = num5%10;
        int num5Ten = num5/10%10;
        int num5Hundered = num5/100;

        if(num4Hundred == num5Hundered) {
            System.out.println("В первом разряде цифры равны: " + num4Hundred + " = " + 
                    num5Hundered);
            if(num4Ten == num5Ten) {
                System.out.println("Во втором разряде цифры равны: " + num4Ten + " = " + num5Ten);
                if(num4Unit == num5Unit) {
                    System.out.println("В третьем разряде цифры равны: " + num4Unit + " = " + 
                            num5Unit);
                }
            }
        } else if(num4Ten == num5Ten) {
            System.out.println("\nВо втором разряде цифры равны: " + num4Ten + " = " + num5Ten);
            if(num4Unit == num5Unit) {
                System.out.println("\nВ третьем разряде цифры равны: " + num4Unit + " = " + 
                        num5Unit);
            }
        } else if(num4Unit == num5Unit) {
            System.out.println("\nВ третьем разряде цифры равны: " + num4Unit + " = " + 
                    num5Unit);
        } else {
            System.out.println("\nРавных цифр нет");
        }

        //Задача_5: Определение символа по его коду
        System.out.println("\n\n5.Определение символа по его коду\n");

        char code = '\u0057';

        if(code <= '9' && code >= '0') {
            System.out.println("Символ: " + code + " число");
        } else if(code >= 'A' && code <= 'Z') {
            System.out.println("Символ: " + code + " большая буква");
        } else if(code >= 'a' && code <= 'z') {
            System.out.println("Символ: " + code + " маленькая буква");
        } else {
            System.out.println("Символ: " + code + " не буква и не число");
        }


        //Задача_6: Подсчет суммы вклада и начисленных банком %
        System.out.println("\n\n6.Подсчет суммы вклада и начисленных банком %\n");

        int sumBank = 300_000;

        System.out.println("Сумма вклада: " + sumBank);

        int sum5 = sumBank * 5/100;
        int sumTotal5 = sumBank + sum5;

        int sum7 = sumBank * 7/100;
        int sumTotal7 = sumBank + sum7;

        int sum10 = sumBank * 10/100;
        int sumTotal10 = sumBank + sum10;

        if(sumBank < 100_000) {
            System.out.println("Начисленный %: " + sum5);
            System.out.println("Итоговую сумма с %: " + sumTotal5);
        } else if(sumBank > 300_000) {
            System.out.println("Начисленный %: " + sum10);
            System.out.println("Итоговую сумма с %: " + sumTotal10);
        } else {
            System.out.println("Начисленный %: " + sum7);
            System.out.println("Итоговую сумма с %: " + sumTotal7);
        }

        //Задача_7: Определение оценки по предметам
        System.out.println("\n\n7.Определение оценки по предметам\n");

        int history = 59;
        int programm = 91;

        int historyBall;
        int programmBall;

        if(history < 91) {
            if(history < 73) {
                if(history <= 60) {
                    historyBall = 2;
                    System.out.println("Оценка по истории: " + historyBall);
                } else {
                    historyBall = 3;
                    System.out.println("Оценка по истории: " + historyBall);
                }
            } else {
                historyBall = 4;
                System.out.println("Оценка по истории: " + historyBall);
            }
        } else {
            historyBall = 5;
            System.out.println("Оценка по истории: " + historyBall);
        }

        if(programm < 91) {
            if(programm < 73) {
                if(programm <= 60) {
                    programmBall = 2;
                    System.out.println("Оценка по программированию: " + programmBall);
                } else {
                    programmBall = 3;
                    System.out.println("Оценка по программированию: " + programmBall);
                }
            } else {
                programmBall = 4;
                System.out.println("Оценка по программированию: " + programmBall);
            }
        } else {
            programmBall = 5;
            System.out.println("Оценка по программированию: " + programmBall);
        }

        int mediumBall = (historyBall + programmBall) /2;
        int mediumPercent = (history + programm) /2;

        System.out.println("\nСредний балл оценок по предметам: " + mediumBall);
        System.out.println("Средний % по предметам: " + mediumPercent);

        //Задача_8: Расчет прибыли за год
        System.out.println("\n\n8.Расчет прибыли за год\n");

        int arenda = 5_000;
        int sumM = 13_000;
        int price = 9_000;
        int sumE = sumM - price - arenda;

        if(sumE > 0) {
            System.out.println("Прибыль за год: + " + sumE + " руб.");
        } else if(sumE < 0) {
            System.out.println("Прибыль за год: " + sumE + " руб.");
        } else {
            System.out.println("Прибыль за год: " + sumE + " руб.");
        }

        //Задача_9: Подсчет количества банкнот
        System.out.println("\n\n9.Подсчет количества банкнот\n");

        int sumUsd = 867;
        int usd100 = sumUsd/100;
        int usd10 = sumUsd/10%10;
        int usd1 = sumUsd%10;

        int numB100 = 10;
        int numB10 = 5;
        int numB1 = 50;
        int numMax = (numB100 * 100) + (numB10 * 10) + numB1;

        if(sumUsd <= numMax && numB1 >= usd1) {
            if(numB100 < usd100) {
                usd100 -= numB100;
                System.out.println("Выдача банкнот номиналом 100: " + numB100);
                if(numB10 >= usd10) {
                    int vB10 = (usd100*10) + usd10;
                    if(vB10 >= numB10) {
                        vB10 -= numB10;
                        System.out.println("Выдача банкнот номиналом 10: " + numB10);
                        vB10 = (vB10*10)+usd1;
                        numB1 -= vB10;
                        System.out.println("Выдача банкнот номиналом 1: " + vB10);
                        sumUsd = numB100*100 + numB10*10 + vB10;
                        System.out.println("\nОбщая сумма выдачи: " + sumUsd);
                    } else {
                        numB10 -= vB10;
                        System.out.println("Выдача банкнот номиналом 10: " + vB10);
                        numB1 -= usd1; 
                        System.out.println("Выдача банкнот номиналом 1: " + usd1);
                        sumUsd = (vB10*10) + (numB100*100) + usd1; 
                        System.out.println("\nОбщая сумма выдачи: " + sumUsd);
                    }
                } else {
                    usd10 -= numB10;
                    System.out.println("Выдача банкнот номиналом 10: " + numB10);
                    usd10 = usd10*10 + usd1;
                    usd100 = usd100*100 + usd10;
                    numB1 -= usd100;
                    System.out.println("Выдача банкнот номиналом 1: " + usd100);
                    sumUsd = numB100*100 + numB10*10 + usd100;
                    System.out.println("\nОбщая сумма выдачи: " + sumUsd);
                }
            } else {
                numB100 -= usd100;
                System.out.println("Выдача банкнот номиналом 100: " + usd100);
                if(numB10 >= usd10) {
                    numB10 -= usd10;
                    System.out.println("Выдача банкнот номиналом 10: " + usd10);
                    numB1 -= usd1; 
                    System.out.println("Выдача банкнот номиналом 1: " + usd1);
                    sumUsd = usd100*100 + usd10*10 + usd1;
                    System.out.println("\nОбщая сумма выдачи: " + sumUsd);
                } else {
                    usd10 -= numB10;
                    System.out.println("Выдача банкнот номиналом 10: " + numB10);
                    usd10 = usd10*10 + usd1;
                    numB1 -= usd10;
                    System.out.println("Выдача банкнот номиналом 1: " + usd10);
                    sumUsd = usd100*100 + numB10*10 + usd10; 
                    System.out.println("\nОбщая сумма выдачи: " + sumUsd);
                }
            }
        } else {
            System.out.println("\nНедостаточно банкнот для выдачи всей суммы!\n" + 
                    "\nМаксимально доступная сумма выдачи: " + numMax);
        }

    }
}