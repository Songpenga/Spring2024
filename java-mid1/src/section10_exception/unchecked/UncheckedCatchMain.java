package section10_exception.unchecked;

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        ///service.callThrow();
        System.out.println("test!!!");
    }
}
