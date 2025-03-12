package level_0;

public class Solution11_2 {

    public int solution(int num1, int num2) {
        int answer = 0;

        if (numberCondition(num1, num2)) {
            answer = calculate(num1, num2);
        }
        return answer;
    }

    private int calculate(int num1, int num2) {
        return (int) (((num1 * 1.0) / (num2 * 1.0)) * 1000);
    }

    private boolean numberCondition(int num1, int num2) {
        int minLimitNumber = 0;
        int maxLimitNumber = 100;
        return (num1 > 0 && num1 <= 100) &&
            (num2 > 0 && num2 <= 100);
    }

}





