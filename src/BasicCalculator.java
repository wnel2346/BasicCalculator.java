import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");

        long num1 = scanner.nextLong();

        System.out.print("연산자 (+, -, *, /)를 입력하세요: ");
        char operator = scanner.next().charAt(0);

        System.out.print("두 번째 정수를 입력하세요: ");

        long num2 = scanner.nextLong();

        long result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("오류: 0으로 나눌 수 없습니다.");
                scanner.close();
                return;
            }


