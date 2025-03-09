package level_0;

public class Solution11 {

	public static void main(String[] args) {		
		
		int a = 0;
	    double test1 = (3*1000/2);
	    double test2 = (7*1000/3);
	    double test3 = (1*1000/16);
	    
	    int val = (int) test1;
	    
	    System.out.println(test1);
	    System.out.println(val);
	    
	    val = (int) test2;
	    System.out.println(val);
	    
	    val = (int) test3;
	    System.out.println(val);		
	}
	
    public int solution(int num1, int num2) {
        double test = (num1*1000/num2);
        int answer = (int) test;
        return answer;
    }	

}





