package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price); int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);
        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }

/*
    문자열 상수를 사용한 덕분에 전체적으로 코드가 더 명확해졌다. 그리고 discount() 에 인자를 전달할 때도
    StringGrade 가 제공하는 문자열 상수를 사용하면 된다. 더 좋은 점은 만약 실수로 상수의 이름을 잘못 입력하면 컴
    파일 시점에 오류가 발생한다는 점이다. 따라서 오류를 쉽고 빠르게 찾을 수 있다.
    하지만 문자열 상수를 사용해도, 지금까지 발생한 문제들을 근본적으로 해결할 수 는 없다. 왜냐하면 String 타입은
    어떤 문자열이든 입력할 수 있기 때문이다. 어떤 개발자가 실수로 StringGrade 에 있는 문자열 상수를 사용하지 않
    고, 다음과 같이 직접 문자열을 사용해도 막을 수 있는 방법이 없다.
*/
}
