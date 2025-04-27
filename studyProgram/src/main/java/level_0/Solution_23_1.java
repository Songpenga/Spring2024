package level_0;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.Stack;

public class Solution_23_1 {

    public int[] solution1(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int[] solution2(int[] num_list) {
        return LongStream.range(1, num_list.length + 1)
                .mapToInt(i -> num_list[(int) (num_list.length - i)])
                .toArray();
    }    

    public int[] solution3(int[] num_list) {
        int[] answer = new int[num_list.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < num_list.length; i++) stack.add(num_list[i]);
        System.out.println(stack.size());
        for(int j = 0; j < num_list.length; j++) answer[j] = stack.pop();
        return answer;
    }
}
