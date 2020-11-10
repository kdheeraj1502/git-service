package util;

public class MinGameCasino {

	public static int minGames(int N, int K) {
		int count = 0;
		while (N > 1) {
			if (K > 0) {
				if (N % 2 == 0) {
					N /= 2;
					K--;
				} else {
					N--;
				}
				count++;
			} else {
				count += N - 1;
				N = 0;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(minGames(18, 2));
		System.out.println(minGames(8, 0));
	}

}
