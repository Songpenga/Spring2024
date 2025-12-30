package section10_exception;

public class Client {
    public void call() throws MycheckedException{
        throw new MycheckedException("ex :: 예시"); //체크 예외는 잡아서 직접 처리하거나 또는 밖으로 던지거나 둘중 하나를 개발자가 직접 명시적으로 처리해야한다.

    /*
     throw 예외 라고 하면 새로운 예외를 발생시킬 수 있다. 예외도 객체이기 때문에 객체를 먼저 new 로 생성하고
     예외를 발생시켜야 한다.
     throws 예외 는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드이다.
     throw , throws 의 차이에 주의하자
    */
    }
}
