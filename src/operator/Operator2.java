package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기
        String result1 = "hello" + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자열 더하기
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열과 숫자열 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        // 자바에서는 문자열에 어떤 타입에 무언가를 더하면 다 문자열로 처리함.
    }
}
