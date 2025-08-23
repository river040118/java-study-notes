package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = ( 2 * 2 ) + ( 3 * 3 ); // 둘이 같은 값인데 코드가 조금 길더라도 가독성 좋게 작성하는 것이 유지보수 하기 좋음.

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 개발에선 단순함과 명확함이 중요! 애매하면 괄호를 넣어 우선순위를 확실하게 해주기.
    }
}
