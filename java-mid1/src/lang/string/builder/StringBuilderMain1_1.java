package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder ab = new StringBuilder();

        ab.append("A");
        ab.append("B");
        ab.append("C");
        ab.append("D");
        System.out.println("ab ::: " + ab);

        ab.insert(4, "peng");
        System.out.println("ab insert ::: " + ab);

        ab.delete(4, 8);
        System.out.println("ab delete :::  " + ab);

        ab.reverse();
        System.out.println("ab reverse ::: " + ab);

        String str = ab.toString();
        System.out.println("str ::: " + str);

    /*
        StringBuilder 객체를 생성한다.
        append() 메서드를 사용해 여러 문자열을 추가한다.
        insert() 메서드로 특정 위치에 문자열을 삽입한다.
        delete () 메서드로 특정 범위의 문자열을 삭제한다.
        reverse() 메서드로 문자열을 뒤집는다.
        마지막으로 toString 메소드를 사용해 StringBuilder 의 결과를 기반으로 String 을 생성해서 반환한
        다
    */
    }

}
