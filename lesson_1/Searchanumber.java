import java.util.Scanner;

public class Searchanumber {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);

        // Задаём диапазон для случайного числа
        int min = 1;
        int max = 100;
        // Создаём случайное число от 1 до 100
        int randomNumber = min + (int)(Math.random() * ((max - min) + 1));

        int num = -1; // Переменная для хранения числа 
    
        System.out.println("Загаданное число от 1 до 100. Попробуйте угадать его");

        // Основной цикл игры: продолжается, пока число не будет угадано
        while (num != randomNumber) {

            System.out.println("Введите число:");
            num = scanner.nextInt(); // Считываем число 
            System.out.println(num);

            if (num == randomNumber) {
                // Если число угадано
                System.out.println("Вы победили! Вы угадали число: " + randomNumber);
            } else {
                // Если число не угадано
                System.out.println("К сожалению, вы не угадали. Попробуйте снова.");
            }
            
            // Даём подсказки, если число не угадано
            if (num < randomNumber) {
                System.out.println(num + " меньше того, что загадал компьютер");
            } else if (num > randomNumber) {
                System.out.println(num + " больше того, что загадал компьютер");
            }
        }    
    }
}