package practice_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int arr[] = new int[9];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
			result += arr[i];
		}
//		System.out.println(result);
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(result - (arr[i] + arr[j]) == 100) {
					for (int j2 = 0; j2 < arr.length; j2++) {
						if(j2 != i && j2 != j) {
							list.add(arr[j2]);
						}
					}
					return;
				}
				else {
					continue;
				}
			}
		}
//		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i) > 0) {
//				System.out.println(list.get(i));
//			}
			System.out.println(list.get(i));
		}

		
	}

}
