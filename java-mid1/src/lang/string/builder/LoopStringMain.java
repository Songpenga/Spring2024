package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String rslt = "";
        for(int i = 0; i < 100000; i++){
            rslt += "PEng World";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result ::: " + rslt);
        System.out.println("Time ::: " + (endTime - startTime) + "ms");
    }
}
