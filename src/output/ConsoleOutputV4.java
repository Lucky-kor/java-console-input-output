package output;

public class ConsoleOutputV4 {
    public static void main(String[] args) {
        // %s는 문자열을 포맷팅하는 지정자입니다. %n은 플랫폼 독립적인 줄바꿈 문자입니다.
        System.out.printf("%s%n", "Hello JAVA"); // "Hello JAVA" 출력 후 줄 바꿈

        // 두 문자열 "Kim"과 "Coding"을 연결한 후, 그 결과를 %s 위치에 포맷팅합니다.
        System.out.printf("%s%n", "Kim" + "Coding"); // "KimCoding" 출력 후 줄 바꿈

        // %d는 정수를 포맷팅하는 지정자입니다. 3과 6을 더한 결과인 9를 출력 후 줄 바꿈합니다.
        System.out.printf("%d%n", 3 + 6); // "9" 출력 후 줄 바꿈

        // 지금은 2022year입니다. 마지막 문자열에는 %n을 사용하지 않아 줄바꿈이 되지 않습니다.
        System.out.printf("지금은 %s입니다", 2022 + "year"); // "지금은 2022year입니다."

        // %c는 단일 문자, %s는 문자열을 포맷팅하는 지정자입니다.
        // '김'과 "코딩"을 각각 %c와 %s의 위치에 포맷팅하여 출력합니다.
        System.out.printf("나는 %c%s입니다", '김', "코딩"); // "나는 김코딩입니다"
    }
}
