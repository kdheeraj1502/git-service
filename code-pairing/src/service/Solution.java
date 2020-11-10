package service;

//you can also use imports, for example:
import java.util.*;

class Solution {
	public static String solution(String[] A) {
		Map<Integer, Integer> map = new HashMap<>();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < A.length; i++) {
			String str = A[i];
			if (str.charAt(0) == 'i') {
				String[] ele = str.split(":");
				map.put(Integer.parseInt(ele[1]), Integer.parseInt(ele[2]));
			}
			if (str.charAt(0) == 'j') {
				String[] ele = str.split(":");
				if (map.containsKey(Integer.parseInt(ele[1]))) {
					result.append(map.get(Integer.parseInt(ele[1])) + " ");
				} else {
					result.append("-1 ");
				}
			}
			if (str.charAt(0) == 'k') {
				result.append(String.valueOf(map.size()) + " ");
			}
			if (str.charAt(0) == 'l') {
				String[] ele = str.split(":");
				if (map.containsKey(Integer.parseInt(ele[1]))) {
					map.remove(Integer.parseInt(ele[1]));
				}
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String str[] = {"i:1:2", "i:66:3", "j:66", "l:1", "k"};
		System.out.println(solution(str));
	}
}
