package level_0;

public class Solution11_1 {

    public int solution1(int num1, int num2) {
        int answer = 0;
        return num1 * 1000 / num2;
    }

    public int solution2(int num1, int num2) {
        return  (int) (((double) num1/num2) * 1000);
    }
    
    public double solution3(int num1, int num2) {
        double num3=num1;
        double num4=num2;
        double num5=num3/num4;
        double answer=Math.floor(num5*1000);
        return answer;
    }
    
    public int solution4(int num1, int num2) {
        int answer = (int)(num1/(double)num2*1000);
        return answer;
    }    
}





