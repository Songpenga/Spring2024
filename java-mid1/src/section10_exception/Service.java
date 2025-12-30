package section10_exception;

public class Service {
    Client client = new Client();

    /*
    * 예외를 잡아서 처리하는 코드
    */
    public void callCatch(){
        try {
            //throw new MycheckedException("ex");
            client.call();
        } catch (MycheckedException e) {
            //예외처리로직
            System.out.println("예외 처리 msg : " + e.getMessage());
        }
        System.out.println("정상흐름");

        //Client.call() 에서 MyCheckedException 예외가 발생하고,
        // 그 예외를 Service.callCatch() 에서 잡는것을 확인할 수 있다.
    }

    /*
    * 체크예외를 밖으로 던지는 코드
    * 체크 예외는 예외를 잡지않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.
    */
    public void callThrow() throws MycheckedException{
        client.call();
    }

}
