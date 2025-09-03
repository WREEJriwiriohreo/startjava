import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class VariableNamesTheme {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));        

        System.out.println("1. РАЗНЫЕ ПЕРЕМЕННЫЕ\n");

        // Цифра
        int digit = 7;
        System.out.println("Цифра = " + digit);

        // Сумма чисел
        int numbersSum = 13;
        System.out.println("Сумма чисел = " + numbersSum);

        // Произведение цифр
        int digitsProduct = 56;
        System.out.println("Произведение цифр = " + digitsProduct);

        // Максимальное число
        int maxNumber = 99;
        System.out.println("Максимальное число = " + maxNumber);

        // Количество десятков
        int tensCount = 5;
        System.out.println("Количество десятков = " + tensCount);

        // Вес собаки
        int dogWeight = 12;
        System.out.println("Вес собаки = " + dogWeight);

        // Исходное число
        int initialNumber = 1234;
        System.out.println("Исходное число = " + initialNumber);

        // Процент по вкладу
        int depositPercent = 8;
        System.out.println("Процент по вкладу = " + depositPercent);

        // Символ &
        char ampersand = '&';
        System.out.println("Символ & = " + ampersand);

        // Код ошибки
        int errorCode = 404;
        System.out.println("Код ошибки = " + errorCode);

        // Тип сообщения
        String messageType = "Warning";
        System.out.println("Тип сообщения = " + messageType);

        // Число нулей
        int zeroCount = 3;
        System.out.println("Число нулей = " + zeroCount);

        // Уникальное число
        int uniqueNumber = 1729;
        System.out.println("Уникальное число = " + uniqueNumber);

        // Случайное число
        int randomNumber = 42;
        System.out.println("Случайное число = " + randomNumber);

        // Математическое выражение
        String mathExpression = "2 + 2 * 2";
        System.out.println("Математическое выражение = " + mathExpression);

        // Счёт в игре
        int gameScore = 1500;
        System.out.println("Счёт в игре = " + gameScore);

        // Максимальная длина
        int maxLength = 256;
        System.out.println("Максимальная длина = " + maxLength);

        // Пункт меню
        int menuItem = 3;
        System.out.println("Пункт меню = " + menuItem);

        // Стоимость кофе
        int coffeePrice = 180;
        System.out.println("Стоимость кофе = " + coffeePrice);

        // Начальная дата
        String startDate = "2024-01-01";
        System.out.println("Начальная дата = " + startDate);

        // Окончание диапазона
        int rangeEnd = 1000;
        System.out.println("Окончание диапазона = " + rangeEnd);

        // Имя работника месяца
        String employeeOfMonth = "Иванов И.И.";
        System.out.println("Работник месяца = " + employeeOfMonth);

        // Название электронной книги
        String ebookTitle = "Java для начинающих";
        System.out.println("Название электронной книги = " + ebookTitle);

        // Размер
        int size = 42;
        System.out.println("Размер = " + size);

        // Вместимость
        int capacity = 64;
        System.out.println("Вместимость = " + capacity);

        // Счётчик
        int counter = 0;
        System.out.println("Счётчик = " + counter);

        // Путь до файла
        String filePath = "C:/Users/User/document.txt";
        System.out.println("Путь до файла = " + filePath);

        // Количество чисел в строке
        int numbersInLine = 4;
        System.out.println("Количество чисел в строке = " + numbersInLine);

        System.out.println("\n2. BOOLEAN-ПЕРЕМЕННЫЕ\n");

        // Сотни равны?
        boolean hasEqualHundreds = true;
        System.out.println("Сотни равны = " + hasEqualHundreds);

        // Компьютер включён?
        boolean isComputerOn = false;
        System.out.println("Компьютер включён = " + isComputerOn);

        // Есть равные цифры?
        boolean hasEqualDigits = true;
        System.out.println("Есть равные цифры = " + hasEqualDigits);

        // Служба создана?
        boolean isServiceCreated = true;
        System.out.println("Служба создана = " + isServiceCreated);

        // Файл пустой?
        boolean isFileEmpty = false;
        System.out.println("Файл пустой = " + isFileEmpty);

        // Соединение активно?
        boolean isConnectionActive = true;
        System.out.println("Соединение активно = " + isConnectionActive);

        // Новый?
        boolean isNew = false;
        System.out.println("Новый = " + isNew);

        // Электронная почта действительная?
        boolean isEmailValid = true;
        System.out.println("Электронная почта действительная = " + isEmailValid);

        // Имеются уникальные строки?
        boolean hasUniqueStrings = false;
        System.out.println("Имеются уникальные строки = " + hasUniqueStrings);

        System.out.println("\n3. АББРЕВИАТУРЫ\n");

        // Старый universally unique identifier
        String oldUuid = "123e4567-e89b-12d3-a456-426614174000";
        System.out.println("Старый UUID = " + oldUuid);

        // Производитель оперативной памяти
        String ramManufacturer = "Kingston";
        System.out.println("Производитель оперативной памяти = " + ramManufacturer);

        // Ёмкость жёсткого диска
        int hddCapacity = 1024;
        System.out.println("Ёмкость жёсткого диска = " + hddCapacity);

        // Определение термина HTTP
        String httpDefinition = "Hypertext Transfer Protocol";
        System.out.println("Определение HTTP = " + httpDefinition);

        // Сокращённый URL
        String shortUrl = "bit.ly/java";
        System.out.println("Сокращённый URL = " + shortUrl);

        // Новый идентификатор клиента
        String newClientId = "cli-90345";
        System.out.println("Новый идентификатор клиента = " + newClientId);

        // Количество символов в ASCII
        int asciiCharCount = 128;
        System.out.println("Количество символов в ASCII = " + asciiCharCount);
    }
}