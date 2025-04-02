package level_0;

//배열의 평균값
public class Solution_16_Demo {
    
    public static void main(String[] args) {

    	int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	solution(number);
    }
    
    public static void solution(int[] numbers) {
    	double test = 0;
    	
    	for(int i : numbers) {
    		test += i;
    	}
    	
    	System.out.println(test);
    	System.out.println(test/numbers.length);
    	System.out.println("test");
    	
    }
    
}




