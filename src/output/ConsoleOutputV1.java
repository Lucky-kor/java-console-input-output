package output;

public class ConsoleOutputV1 {
    public static void main(String[] args) {
        // 문자열 "Hello JAVA"를 출력합니다.
        // System.out.print 메서드는 개행(new line) 없이 문자열을 출력합니다.
        System.out.print("Hello JAVA"); // 출력: Hello JAVA

        // 문자열 "Kim"과 "Coding"을 연결하여 출력합니다.
        // + 연산자는 문자열을 연결합니다.
        System.out.print("Kim" + "Coding"); // 출력: Hello JAVAKimCoding

        // 숫자 3과 6을 더한 결과를 출력합니다.
        // 숫자 연산이므로, 두 숫자의 합인 9가 출력됩니다.
        System.out.print(3 + 6); // 출력: Hello JAVAKimCoding9

        // 숫자 2022와 문자열 "year"을 연결하여 출력합니다.
        // 숫자와 문자열을 연결할 때, 숫자가 문자열로 변환되어 연결됩니다.
        System.out.print(2022 + "year"); // 출력: Hello JAVAKimCoding92022year
    }
}
