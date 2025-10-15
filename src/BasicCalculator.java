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


