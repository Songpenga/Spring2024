package level_0;

import java.util.Arrays;

public class Solution_23 {

	public static void main(String[] args) {
		solution();
	}

	public static int[] solution() {
		int[] num_list = { 1, 2, 3, 4, 5, 5, 4, 4, 5, 1 };
		int[] answer = new int[num_list.length];

		System.out.println(num_list.length);
		System.out.println(answer.length);
		
		  for(int i = 0; i < num_list.length; i++) { 
			  answer[i] = num_list[num_list.length-1-i]; }
		  
		 for(int ite : answer) { System.out.println("answer : " + ite); }
		 
		return answer;
	}

}
