package generic.ex1;

public class IntegerBox {
    //숫자를 보관하고 꺼낼 수 있는 단순한 기능을 제공한다.
    private Integer val;

    public void set(Integer val) {
        this.val = val;
    }

    public Integer get() {
        return val;
    }

}
