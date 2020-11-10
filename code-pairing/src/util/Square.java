package util;

public class Square {

	public void checkNeighbor(int[][] A, int[][] B, int i, int j, int N, int M) {
		if (B[i][j] == -1)
			return;
		B[i][j] = -1;
		if (i + 1 < N)
			if (A[i + 1][j] == A[i][j])
				checkNeighbor(A, B, i + 1, j, N, M);
		if (i - 1 >= 0)
			if (A[i - 1][j] == A[i][j])
				checkNeighbor(A, B, i - 1, j, N, M);
		if (j + 1 < M)
			if (A[i][j + 1] == A[i][j])
				checkNeighbor(A, B, i, j + 1, N, M);
		if (j - 1 >= 0)
			if (A[i][j - 1] == A[i][j])
				checkNeighbor(A, B, i, j - 1, N, M);
	}

	int countries_count(int [][]A) {
	  if (A.length == 0) return 0;
	  int sum = 0;
	  int N = A.length;
	  int M = A[0].length; 
	  if (N == 0 || M == 0) return 0;
	//  vector<vector<int> > B(A);
	  for(int i=0; i<N; i++) 
	    for(int j = 0; j<M; j++) {
	   //   if (B[i][j] >= 0) {
		//cout << i<< j << endl;
	//	checkNeighbor(A, B, i, j, N, M);
		sum ++;
	      }
	  //  }
	  return sum;
	}
}
