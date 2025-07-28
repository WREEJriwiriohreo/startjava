import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println(num1);

        System.out.println("Введите оператор (+, -, *, /, ^, %):");
        char operator = scanner.next().charAt(0);
        System.out.println(operator);

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println(num2);
        
        int result;
        int halfresult = num1;
        System.out.println("Ответ:");

        if (operator == '+') {
            result = num1 + num2;
            System.out.println(result);  
        }
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println(result);  
        }
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println(result);  
        }
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(result);  
            } else 
              {
                System.out.println("Ошибка: деление на ноль.");
              }
        }
        else if (operator == '^') {
            if (num2 > 1){
                while (num2 > 1) {
                    num2 = num2-1 ;
                    num1 = halfresult * num1;
                }
                result = num1;
                System.out.println(result);  
            }
            else if (num2 == 0){
                result = 1;
                System.out.println(result);
            }
            else if (num2 < 0){
                  while (num2 < 1) {
                    num2 = num2+1 ;
                    num1 = halfresult * num1;
                }
                result = num1;
                System.out.println("1/" + result);
            }
        else {
            System.out.println("Ошибка: неизвестный оператор.");
        }      
        }
        else if (operator == '%') {
            result = num1 % num2;
            System.out.println(result);  
        }
        else {
            System.out.println("Ошибка: неизвестный оператор.");
        }
        System.out.println("Программа завершена.");
    }
}
