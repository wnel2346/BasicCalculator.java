import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> results = new ArrayList<>();

        results.add(100L);
        results.add(200L);
        System.out.println("[초기 기록 상태]: " + results);

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
        } else {
            System.out.println("오류: 유효하지 않은 연산자입니다.");
            scanner.close();
            return;
        }

        System.out.printf("계산 결과: %d %c %d = %d%n", num1, operator, num2, result);
        results.add(result);
        System.out.println("\n[새 결과 추가 후 기록]: " + results);

        if (!results.isEmpty()) {
            long removedValue = results.remove(0);
            System.out.printf("✅ 가장 오래된 기록 (삭제된 값: %d)이 삭제되었습니다. ✅%n", removedValue);
        }

        System.out.println("[삭제 후 최종 기록 상태]: " + results);
        scanner.close();
    }
}
