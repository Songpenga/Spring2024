package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBx = new GenericBox();
        GenericBox<Object> integerBoxO = new GenericBox<>(); //권장
        integerBx.setVal(10);
        Integer rslt = (Integer) integerBx.getVal();
        System.out.println("rslt :::" + rslt);
    }
}
