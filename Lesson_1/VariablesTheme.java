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

        System.out.println("Характеристики устройства:\n" + "Процессор Intel Core 4770: версия "
                 + verCore + "\nКол. ядер: " + core + "\nЧастота: " + coreGhz +
                 "\nВ режиме турбо: " + coreGhzTurbo + "\nРежим турбо по умолчанию включен = " +
                 modeCore + "\nВидеокарта GeForse: " + gpuGf +
                 "\nКоличество оперативной памяти mb: " + ram + "\nОбьем SSD в kb = " + ssd);

        //Задача_2: Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int pricePen = 100;
        int priceBook = 200;
        int numDiscount = (((pricePen + priceBook) * 11) / 100);
        int discountPrice = (pricePen + priceBook) - numDiscount;

        System.out.println("Сумма скидки = " + numDiscount +
                "\nОбщая стоимость товаров со скидкой = " + discountPrice);

        //Задача_3: Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("\n   J    a  v     v  a      \n" + 
                "   J   a a  v   v  a a      \n" + 
                "J  J  aaaaa  V V  aaaaa     \n" + 
                " JJ  a     a  V  a     a\n");

        //Задача_4: Вывод mins и max значений целых числовых типов
        System.out.println("\n4. Вывод mins и max значений целых числовых типов\n");

        byte maxByte = 127;
        System.out.println("Byte maxValue: " + maxByte);
        maxByte++;
        System.out.println("Инкремент Byte: " + maxByte);
        maxByte--;
        System.out.println("Декремент Byte: " + maxByte);

        short maxShort = 32_767;
        System.out.println("\nShort maxValue: " + maxShort);
        maxShort++;
        System.out.println("Инкремент Short: " + maxShort);
        maxShort--;
        System.out.println("Декремент Short: " + maxShort);

        int maxInt = 2_147_483_647;
        System.out.println("\nInt maxValue: " + maxInt);
        maxInt++;
        System.out.println("Инкремент Int: " + maxInt);
        maxInt--;
        System.out.println("Декремент Int: " + maxInt);

        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("\nLong maxValue: " + maxLong);
        maxLong++;
        System.out.println("Инкремент Long: " + maxLong);
        maxLong--;
        System.out.println("Декремент Long: " + maxLong);

        //Задача_5: Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных\n");

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
        System.out.println("\n6. Вывод символов и их кодов\n");

        char numberSing = '#';
        char ampersand = '&';
        char atSign = '@';
        char caret = '^';
        char underscore = '_';

        System.out.println("Значения переменных char:\n" + "\nКод | Символ\n" + (int)numberSing + 
                "  |  " + numberSing + '\n' + (int)ampersand + "  |  " + ampersand + 
                '\n' + (int)atSign + "  |  " + atSign + '\n' + (int)caret + "  |  " + 
                caret + '\n' + (int)underscore + "  |  " + underscore);

        //Задача_7: Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backSlash = '\\';
        char lParen = '(';
        char rParen = ')';

        System.out.println("Java-талисман:\n\n    " + slash + backSlash + "     " + "\n   " + 
                slash + "  " + backSlash + "      \n" + "  " + slash + underscore + 
                lParen + " " + rParen + backSlash + "    \n" + " " + slash + "      " + 
                backSlash + "   \n" + slash + underscore + underscore + underscore + underscore + 
                slash + backSlash + underscore + underscore + backSlash);

        //Задача_8: Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int ones = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num / 100;
        int sum = ones + tens + hundreds;
        int prod = ones * tens * hundreds;

        System.out.println("Число " + num + " содержит:\n" + hundreds + " сотен\n" + tens + 
                " десятков\n" + ones + " единиц\n");
        System.out.println("Сумма его цифр = " + sum + "\nА произведение = " + prod);

        //Задача_9: Вывод времени
        System.out.println("\n9. Вывод времени\n");

        int totalSeconds = 86_399;
        int hours = totalSeconds / 60 / 60;
        int mins = totalSeconds / 60 % 60;
        int seconds = totalSeconds % 60;

        System.out.println("Время: " + hours + ':' + mins + ':' + seconds);
    }
}