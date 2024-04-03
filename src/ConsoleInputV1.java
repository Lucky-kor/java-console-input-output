import java.util.Scanner;

public class ConsoleInputV1 {
    public static void main(String[] args) {
        // Scanner 클래스의 인스턴스를 생성합니다. System.in은 표준 입력 스트림(키보드 입력 등)을 의미합니다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요:");
        // 사용자로부터 문자열 입력을 받습니다.
        String inputValue = scanner.nextLine();
        System.out.println("입력받은 문자열: " + inputValue);

        System.out.println("정수를 입력하세요:");
        // 사용자로부터 정수 입력을 받습니다.
        int intValue = scanner.nextInt();
        System.out.println("입력받은 정수: " + intValue);

        System.out.println("실수를 입력하세요:");
        // 사용자로부터 실수 입력을 받습니다.
        double doubleValue = scanner.nextDouble();
        System.out.println("입력받은 실수: " + doubleValue);

        // Scanner 인스턴스 사용이 끝났으므로, 자원을 해제합니다.
        scanner.close();
    }
}
