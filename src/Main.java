import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Level 1:
        // Вводится число. Напишите на экран сообщение "Я начинаю разбираться с циклами" количество раз, равное введенному числу
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = scanner.nextInt();
        int i = 0;

        while(i < inputNumber) {
            System.out.printf("%d. %s\n", ++i, "Я начинаю разбираться с циклами");
        }

        // Level2:
        // Вводится строка, выведите первый ее символ на экран количество раз, равное длине всей строки.
        System.out.println();
        String inputString = scanner.nextLine(); // Подчищаем то, что осталось с прошлого раза
        System.out.print("Введите строку: ");
        inputString = scanner.nextLine();
        i = 0;

        while(i < inputString.length()) {
            System.out.printf("%d. %s\n", ++i, inputString.charAt(0));
        }
    }
}