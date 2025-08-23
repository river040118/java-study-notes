package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; //-32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        long l = 938080182L; // 변수 타입중에 가장 큰 수를 저장 할 수 있음. 사용할때 마지막에 L 붙여서 사용

        // 실수
        float f = 10.0f; //float도 맨 뒤에 f를 붙여서 사용한다. float는 오류가 많아서 double을 사용하는걸 권장한다.
        double d = 10.0;

    }
}

// 메모리를 많이 사용할 수록 큰 수를 표현 할 수 있다.
// 변수 선언에 따라 메모리를 할당하고 그만큼 공간을 차지한다.
