package stack_que;

//프로그래머스_스택/큐_프린터
public class Problem_01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[]priorities = {1, 2, 3, 4};
		int location = 2;
		System.out.println(sol.solution(priorities, location));
	}
}
class Solution {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		int temparr = 0;
		int temppri = 0;
		int num = 0;
		int arr[] = new int[priorities.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		while(true) {
			num = 0;
			exit:for (int j = 0; j < arr.length - 1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(priorities[j] < priorities[k]) {
						temppri = priorities[j];
						temparr = arr[j];
						for (int i = j; i < arr.length-1; i++) {
							arr[i] = arr[i+1];
							priorities[i] = priorities[i + 1];
						}
						arr[arr.length - 1] = temparr;
						priorities[arr.length - 1] = temppri;
						num++;
						break exit;
					}
					else {
						continue;
					}
				}
			}
			if(num == 0) {
				break;
			}
			else {
				continue;
			}
		}

//		for (int l = 0; l < arr.length; l++) {
//			exit:for (int j = 0; j < arr.length - 1; j++) {
//				for (int k = j+1; k < arr.length; k++) {
//					if(priorities[j] < priorities[k]) {
//						temppri = priorities[j];
//						temparr = arr[j];
//						for (int i = j; i < arr.length-1; i++) {
//							arr[i] = arr[i+1];
//							priorities[i] = priorities[i + 1];
//						}
//						arr[arr.length - 1] = temparr;
//						priorities[arr.length - 1] = temppri;
//						break exit;
//					}
//					else {
//						continue;
//					}
//				}
//			}
//		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == location) {
				answer = i + 1;
				break;
			}
		}
		return answer;
	}
}
