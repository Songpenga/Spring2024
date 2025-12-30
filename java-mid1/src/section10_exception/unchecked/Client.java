package section10_exception.unchecked;

public class Client {
    public void call() throws MyUnckeckedException{
        throw new MyUnckeckedException("ex :: Unchecked");
    }
}
