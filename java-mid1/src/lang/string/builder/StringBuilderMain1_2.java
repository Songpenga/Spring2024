package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder ab = new StringBuilder();
        String str = ab.append("A").append("B").append("C").append("D")
                .insert(4, "PENG")
                .delete(4, 7)
                .reverse()
                .toString();

        System.out.println("str ::: " + str);
    }
}
