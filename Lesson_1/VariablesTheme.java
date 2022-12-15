public class VariablesTheme {
    public static void main(String[] args) {
        //Задача_1: Вывод значений переменных на консоль.
        System.out.println("1. Вывод значений переменных на консоль.\n");

        byte core = 4;
        short gpuGf = 1070;
        int ram = 16_000;
        long ssd = 500_000_000l;

        float coreGhz = 3.50f;
        double coreGhzTurbo = 3.80;

        char verCore = 'K';
        boolean modeCore = false;

        System.out.println("Характеристики устройства:\n\n" + "Процессор Intel Core 4770: версия "
                 + verCore + "\nКол. ядер: " + core + "\nЧастота: " + coreGhz +
                 "\nВ режиме турбо: " + coreGhzTurbo + "\nРежим турбо по умолчанию включен = " +
                 modeCore + "\nВидеокарта GeForse: " + gpuGf +
                 "\nКоличество оперативной памяти mb: " + ram + "\nОбьем SSD в kb = " + ssd);

        //Задача_2: Расчет стоимости товара со скидкой
        System.out.println("\n\n2. Расчет стоимости товара со скидкой\n");

        int pricePen = 100;
        int priceBook = 200;
        int numDiscount = (((pricePen + priceBook) * 11) / 100);
        int discountPrice = (pricePen + priceBook) - numDiscount;

        System.out.println("Сумма скидки = " + numDiscount +
                "\nОбщая стоимость товаров со скидкой = " + discountPrice);

        //Задача_3: Вывод слова JAVA
        System.out.println("\n\n3. Вывод слова JAVA\n");

        System.out.println("\n   J    a  v     v  a      \n" + 
                "   J   a a  v   v  a a      \n" + 
                "J  J  aaaaa  V V  aaaaa     \n" + 
                " JJ  a     a  V  a     a\n");

        //Задача_4: Вывод min и max значений целых числовых типов
        System.out.println("\n\n4. Вывод min и max значений целых числовых типов\n");

        byte maxByte = 127;
        byte incremByte = (byte)maxByte++;
        byte decremByte = (byte)maxByte--;

        System.out.println("Byte maxValue: " + maxByte + "\nИнкремент Byte: " + incremByte + 
                "\nДекремент Byte: " + decremByte);

        short maxShort = 32_767;
        short incremShort = (short)maxShort++;
        short decremShort = (short)maxShort--;

        System.out.println("\nShort maxValue: " + maxShort + "\nИнкремент Short: " + 
                incremShort + "\nДекремент Short: " + decremShort);

        int maxInt = 2_147_483_647;
        int incremInt = (int)maxInt++;
        int decremInt = (int)maxInt--;

        System.out.println("\nInt maxValue: " + maxInt + "\nИнкремент Int: " + incremInt + 
                "\nДекремент Int: " + decremInt);

        long maxLong = 9_223_372_036_854_775_807L;
        long incremLong = (long)maxLong++;
        long decremLong = (long)maxLong--;

        System.out.println("\nLong maxValue: " + maxLong + "\nИнкремент Long: " + incremLong
                 + "\nДекремент Long: " + decremLong);

        //Задача_5: Перестановка значений переменных
        System.out.println("\n\n5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;

        System.out.println("1) Перестановка с помощью третьей переменной:");
        System.out.println("\nисходные значения: a = " + a + ", b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("Значения после перестановки: а = " + a + ", b = " + b);

        System.out.println("\n2) Перестановка с помощью арифметических операций:");
        System.out.println("\nисходные значения: a = " + a + ", b = " + b);

        a += b - (b = a);
        b += a - (b = a);

        System.out.println("Значения после перестановки: а = " + a + ", b = " + b);

        System.out.println("\n3) Перестановка с помощью побитовой операции:");
        System.out.println("\nисходные значения: a = " + a + ", b = " + b);

        a = a ^ b ^ (b = a);
        b = (a ^ b) ^ a;

        System.out.println("Значения после перестановки: а = " + a + ", b = " + b);

        //Задача_6: Вывод символов и их кодов
        System.out.println("\n\n6. Вывод символов и их кодов\n");

        char numberSing = '#'; //35
        char ampersand = '&'; //38
        char atSign = '@'; //64
        char caret = '^'; //94
        char underscore = '_'; //95

        System.out.println("Значения переменных char:\n" + "\nКод | Символ\n" + 35 + "  |  " +
                 numberSing + '\n' + 38 + "  |  " + ampersand + '\n' + 64 + "  |  " + atSign + 
                 '\n' + 94 + "  |  " + caret + '\n' + 95 + "  |  " + underscore);

        //Задача_7: Вывод в консоль ASCII-арт Дюка
        System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка\n");

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
        System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int numUnit = num%10;
        int numTen = num/10%10;
        int numHundred = num/100;
        int numSum = numUnit + numTen + numHundred;
        int numProd = numUnit * numTen * numHundred;

        System.out.println("Число " + num + " содержит:\n" + numHundred + " сотен\n" + numTen + 
                " десятков\n" + numUnit + " единиц\n");
        System.out.println("Сумма его цифр = " + numSum + "\nА произведение = " + numProd);

        //Задача_9: Вывод времени
        System.out.println("\n\n9. Вывод времени\n");

        int origTime = 86_399;
        int hour = origTime/60/60;
        int min = origTime/60%60;
        int second = origTime%60;

        System.out.println("Время: " + hour + ':' + min + ':' + second);
    }
}