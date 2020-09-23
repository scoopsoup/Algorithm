package hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

//프로그래머스_해쉬_위장
public class Problem_01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String clothes[][] = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(sol.solution(clothes));
	}
}

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < clothes.length; i++) {
			if(map.get(clothes[i][1]) == null) {
				map.put(clothes[i][1], 1);
			}
			else {
				map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
			}
		}
        
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()) {
        	String keys = (String) iter.next();
        	answer *= (map.get(keys) + 1);
        }
        
        return (answer - 1);
    }
}