package level_0;

import org.apache.catalina.valves.rewrite.InternalRewriteMap.UpperCase;

public class Solution2 {
    
    
    public static void main(String[] args) {
    	
    	Solution2 sol = new Solution2();
    	
    	sol.solution("test", "t");
    	
    }

	/*
	 * indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환	 
	 */    
    public String solution(String my_string, String alp) {
        
    	//나의 풀이
    	my_string =  my_string.replaceAll(alp,alp.toUpperCase());
    	System.out.println(my_string);
    	
        return "test";
    }

	/*[참고]
	 * class Solution { 
	 * 	public String solution(String my_string, String alp) {
	 * 		String a = alp.toUpperCase(); return my_string.replaceAll( alp, a); 
	 * } 
	 * }
	 */    

}
