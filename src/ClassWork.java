import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        //Написать такие числа на экран 2, 4, 6, 8 .... 996, 998, 1000
        int i = 2;
        while (i <= 1000) {
            System.out.printf("%d\n", i);
            i += 2;
        }

        //Написать на экране все числа от 0 до 1000, которые кончаются на 7: 7, 17, 27
        System.out.println();
        i = 7;
        while (i <= 1000) {
            System.out.printf("%d\n", i);
            i += 10;
        }

        // вводится число, написать все степени двойки, что меньше этого числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputValue = scanner.nextInt();
        double j = 1;
        double result = Math.pow(2, j);
        while (result < inputValue) {
            System.out.printf("%.0f\n", result);
            j++;
            result = Math.pow(2, j);
        }
    }
}
