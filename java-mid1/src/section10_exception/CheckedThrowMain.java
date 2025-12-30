package section10_exception;

public class CheckedThrowMain {
    public static void main(String[] args) throws MycheckedException{
        Service service = new Service();
        service.callThrow();
        System.out.println("정상종료");
    }
}
