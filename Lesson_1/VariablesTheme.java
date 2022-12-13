public class VariablesTheme {
    public static void main(String[] args) {

        //Задача_1: Вывод значений переменных на консоль.
        System.out.println("1. Вывод значений переменных на консоль.\n");

        byte core = 4;
        short gpuGF = 1070;
        int ram = 16_000;
        long ssd = 500_000_000l;

        float coreGHz = 3.50f;
        double coreGHzTurbo = 3.80;

        char verCore = 'K';
        boolean modeCore = false;

        System.out.println("Характеристики устройства:\n\n" + "Процессор Intel Core 4770: версия "
             + verCore + "\nКол. ядер: " + core + "\nЧастота: " + coreGHz + "\nВ режиме турбо: "
             + coreGHzTurbo + "\nРежим турбо по умолчанию включен = " + modeCore + 
             "\nВидеокарта GeForse: " + gpuGF + "\nКоличество оперативной памяти mb: " + ram + 
             "\nОбьем SSD в kb = " + ssd);

        //Задача_2: Расчет стоимости товара со скидкой
        System.out.println("\n\n2. Расчет стоимости товара со скидкой\n");

        int pricePen = 100;
        int priceBook = 200;
        int numDiscount = (((pricePen + priceBook) * 11) / 100);
        int discountedPrice = (pricePen + priceBook) - numDiscount;

        System.out.println("Сумма скидки = " + numDiscount +
                "\nОбщая стоимость товаров со скидкой = " + discountedPrice);

        //Задача_3: Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("\n   J    a  v     v  a      \n" + 
                "   J   a a  v   v  a a      \n" + 
                "J  J  aaaaa  V V  aaaaa     \n" + 
                " JJ  a     a  V  a     a\n");

        //Задача_4: Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte maxValueByte = 127;
        byte incremByte = (byte)(maxValueByte + 1);
        byte decremByte = (byte)(incremByte - 1);

        System.out.println("Byte maxValue: " + maxValueByte + "\nИнкремент Byte: " + incremByte + 
                "\nДекремент Byte: " + decremByte);

        short maxValueShort = 32_767;
        short incremShort = (short)(maxValueShort + 1);
        short decremShort = (short)(incremShort - 1);

        System.out.println("\nShort maxValue: " + maxValueShort + "\nИнкремент Short: " + 
                incremShort + "\nДекремент Short: " + decremShort);

        int maxValueInt = 2_147_483_647;
        int incremInt = (int)(maxValueInt + 1);
        int decremInt = (int)(incremInt - 1);

        System.out.println("\nInt maxValue: " + maxValueInt + "\nИнкремент Int: " + incremInt + 
                "\nДекремент Int: " + decremInt);

        long maxValueLong = 9_223_372_036_854_775_807L;
        long incremLong = (long)(maxValueLong + 1L);
        long decremLong = (long)(incremLong - 1L);

        System.out.println("\nLong maxValue: " + maxValueLong + "\nИнкремент Long: " + incremLong
                 + "\nДекремент Long: " + decremLong);

        //Задача_5: Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных\n");

        int a1 = 2;
        int b1 = 5;
        int c = a1;

        System.out.println("1) Перестановка с помощью третьей переменной: " + 
                "\nисходные значения: a = " + a1 + ", b = " + b1 + " новые значения: a = " + 
                (a1 = b1) + ", b = " + (b1 = c));

        int a2 = 2;
        int b2 = 5;

        System.out.println("\n2) Перестановка с помощью арифметических операций: " + 
                "\nисходные значения: a = " + a2 + ", b = " + b2 + " новые значения: a = " + 
                (a2 += b2 - (b2 = a2)) + ", b = " + (b2 += a2 - (b2 = a2)));

        int a3 = 2; // 010
        int b3 = 5; // 101

        System.out.println("\n3) Перестановка с помощью побитовой операции: " + 
                "\nисходные значения: a = " + a3 + ", b = " + b3 + " новые значения: a = " + 
                (a3 = a3 ^ b3 ^ (b3 = a3)) + ", b = " + (b3 = (a3 ^ b3) ^ a3));

        //Задача_6: Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов\n");

        char sym1 = '#'; //35
        char sym2 = '&'; //38
        char sym3 = '@'; //64
        char sym4 = '^'; //94
        char sym5 = '_'; //95

        System.out.println("Значения переменных char:\n" + "\nКод | Символ\n" + 35 + "  |  " +
                 sym1 + '\n' + 38 + "  |  " + sym2 + '\n' + 64 + "  |  " + sym3 + '\n' + 94 + 
                 "  |  " + sym4 + '\n' + 95 + "  |  " + sym5);

        //Задача_7: Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char symvDuke1 = '/';
        char symvDuke2 = '\\';
        char symvDuke3 = '_';
        char symvDuke4 = '(';
        char symvDuke5 = ')';

        System.out.println("Java-талисман:\n\n    " + symvDuke1 + symvDuke2 + "     " + "\n   " + 
                symvDuke1 + "  " + symvDuke2 + "      \n" + "  " + symvDuke1 + symvDuke3 + 
                symvDuke4 + " " + symvDuke5 + symvDuke2 + "    \n" + " " + symvDuke1 + "      " + 
                symvDuke2 + "   \n" + symvDuke1 + symvDuke3 + symvDuke3 + symvDuke3 + symvDuke3 + 
                symvDuke1 + symvDuke2 + symvDuke3 + symvDuke3 + symvDuke2);

        //Задача_8: Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int number = 123;
        int num1 = number%10;
        int num10 = number/10%10;
        int num100 = number/100;
        int numberSum = num1 + num10 + num100;
        int numberProd = num1 * num10 * num100;

        System.out.println("Число " + number + " содержит:\n" + num100 + " сотен\n" + num10 + 
                " десятков\n" + num1 + " единиц\n");
        System.out.println("Сумма его цифр = " + numberSum + "\nА произведение = " + numberProd);

        //Задача_9: Вывод времени
        System.out.println("\n9. Вывод времени\n");

        int origTime = 86_399;
        int hour = origTime/60/60;
        int min = origTime/60%60;
        int second = origTime%60;

        System.out.println("Время: " + hour + ':' + min + ':' + second);
    }
}