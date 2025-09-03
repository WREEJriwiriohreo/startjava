import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;

public class VariablesTheme {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

        final long startNanoTime = System.nanoTime();
        final LocalTime startClockTime = LocalTime.now();

        // 1. ВЫВОД ASCII-ГРАФИКИ
        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ\n");
        System.out.println("|                     /\\");
        System.out.println("|   J    a  v     v  /  \\");
        System.out.println("|   J   a a  v   v  /_( )\\");
        System.out.println("|J  J  aaaaa  V V  /      \\");
        System.out.println("| JJ  a     a  V  /___/\\___\\\n");

        String block = """
                |         /\\            
                |   J    /  \\  v     v  a
                |   J   /_( )\\  v   v  a a
                |J  J  /      \\  V V  aaaaa
                | JJ  /___/\\___\\  V  a     a
                """;
        System.out.println(block);

        // 2. РАСЧЕТ СТОИМОСТИ ТОВАРА
        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА\n");
        float penCost = 105.5f;
        float bookCost = 235.23f;
        float discountRate = 0.11f;
        float totalCost = penCost + bookCost;
        float discountAmount = totalCost * discountRate;
        float discountedTotal = totalCost - discountAmount;
        System.out.println("Общая стоимость без скидки: " + totalCost);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Стоимость со скидкой: " + discountedTotal + "\n");

        BigDecimal penCostBd = BigDecimal.valueOf(105.5);
        BigDecimal bookCostBd = BigDecimal.valueOf(235.23);
        BigDecimal discountRateBd = BigDecimal.valueOf(0.11);
        BigDecimal totalCostBd = penCostBd.add(bookCostBd);
        BigDecimal discountAmountBd = totalCostBd.multiply(discountRateBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountedTotalBd = totalCostBd.subtract(discountAmountBd);
        System.out.println("Общая стоимость без скидки: " + totalCostBd);
        System.out.println("Сумма скидки: " + discountAmountBd);
        System.out.println("Стоимость со скидкой: " + discountedTotalBd + "\n");

        // 3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ
        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");
        int cellValueA = 2;
        int cellValueB = 5;
        System.out.println("Исходные значения: A1 = " + cellValueA + ", B1 = " + cellValueB);

        System.out.println("Метод: третья переменная");
        int tempValue = cellValueA;
        cellValueA = cellValueB;
        cellValueB = tempValue;
        System.out.println("Результат: A1 = " + cellValueA + ", B1 = " + cellValueB + "\n");

        System.out.println("Метод: арифметический");
        cellValueA += cellValueB;
        cellValueB = cellValueA - cellValueB;
        cellValueA -= cellValueB;
        System.out.println("Результат: A1 = " + cellValueA + ", B1 = " + cellValueB + "\n");

        System.out.println("Метод: побитовый");
        cellValueA ^= cellValueB;
        cellValueB ^= cellValueA;
        cellValueA ^= cellValueB;
        System.out.println("Результат: A1 = " + cellValueA + ", B1 = " + cellValueB + "\n");

        // 4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ
        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ\n");
        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;
        System.out.printf("%6d%6d%6d%6d%6d%6d\n", code1, code2, code3, code4, code5, code6);
        System.out.printf("%6c%6c%6c%6c%6c%6c\n\n",
                (char) code1, (char) code2, (char) code3, (char) code4, (char) code5, (char) code6);

        // 5. АНАЛИЗ КОДА ТОВАРА
        System.out.println("5. АНАЛИЗ КОДА ТОВАРА\n");
        int productCode = 123;
        int category = productCode / 100;
        int subcategory = (productCode / 10) % 10;
        int packageType = productCode % 10;
        int digitSum = category + subcategory + packageType;
        int digitProduct = category * subcategory * packageType;
        System.out.println("Код товара: " + productCode);
        System.out.println("  категория товара - " + category);
        System.out.println("  подкатегория - " + subcategory);
        System.out.println("  тип упаковки - " + packageType);
        System.out.println("Контрольная сумма = " + digitSum);
        System.out.println("Проверочный код = " + digitProduct + "\n");

        // 6. ТЕСТИРОВАНИЕ ДАТЧИКОВ
        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ\n");
        byte maxTemperature = Byte.MAX_VALUE;
        System.out.println("[Температура, °C]:");
        System.out.println("  Исходное: " + maxTemperature);
        maxTemperature++;
        System.out.println("  +1: " + maxTemperature);
        maxTemperature--;
        System.out.println("  -1: " + maxTemperature + "\n");

        short maxPressure = Short.MAX_VALUE;
        System.out.println("[Давление, мм рт.ст.]:");
        System.out.println("  Исходное: " + maxPressure);
        maxPressure++;
        System.out.println("  +1: " + maxPressure);
        maxPressure--;
        System.out.println("  -1: " + maxPressure + "\n");

        char maxStatusCode = Character.MAX_VALUE;
        System.out.println("[Код состояния]:");
        System.out.println("  Исходное: " + (int) maxStatusCode);
        maxStatusCode++;
        System.out.println("  +1: " + (int) maxStatusCode);
        maxStatusCode--;
        System.out.println("  -1: " + (int) maxStatusCode + "\n");

        int maxDistance = Integer.MAX_VALUE;
        System.out.println("[Пройденное расстояние, м]:");
        System.out.println("  Исходное: " + maxDistance);
        maxDistance++;
        System.out.println("  +1: " + maxDistance);
        maxDistance--;
        System.out.println("  -1: " + maxDistance + "\n");

        long maxTimeSinceStart = Long.MAX_VALUE;
        System.out.println("[Время с момента старта, мс]:");
        System.out.println("  Исходное: " + maxTimeSinceStart);
        maxTimeSinceStart++;
        System.out.println("  +1: " + maxTimeSinceStart);
        maxTimeSinceStart--;
        System.out.println("  -1: " + maxTimeSinceStart + "\n");

        // 7. ПАРАМЕТРЫ JVM И ОС
        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");
        Runtime runtime = Runtime.getRuntime();
        long totalMemoryBytes = runtime.totalMemory();
        long freeMemoryBytes = runtime.freeMemory();
        long maxMemoryBytes = runtime.maxMemory();
        long usedMemoryBytes = totalMemoryBytes - freeMemoryBytes;

        System.out.printf("Доступно ядер: %d\n", runtime.availableProcessors());
        System.out.printf("Выделено памяти: %.1f МБ\n", totalMemoryBytes / 1048576.0);
        System.out.printf("Свободно памяти: %.1f МБ\n", freeMemoryBytes / 1048576.0);
        System.out.printf("Используется памяти: %.1f МБ\n", usedMemoryBytes / 1048576.0);
        System.out.printf("Максимум памяти: %.1f МБ\n\n", maxMemoryBytes / 1048576.0);

        System.out.printf("Системный диск: %s\n", System.getProperty("user.home"));
        System.out.printf("Версия ОС: %s\n", System.getProperty("os.version"));
        System.out.printf("Версия Java: %s\n", System.getProperty("java.version"));
        System.out.printf("Разделитель пути: %s\n\n", System.getProperty("path.separator"));

        // 8. ЗАМЕР ВРЕМЕНИ
        long endNanoTime = System.nanoTime();
        LocalTime endClockTime = LocalTime.now();
        double elapsedSeconds = (endNanoTime - startNanoTime) / 1_000_000_000.0;

        System.out.println("Старт проверки: " + startClockTime);
        System.out.println("Финиш проверки: " + endClockTime);
        System.out.printf("Время работы:   %.3f сек\n", elapsedSeconds);
    }
}
