package ArrayTest;

public class Arrare {

	public static void main(String[] args) {

		int[] b = {1, 2, 3, 4, 5, 6, 7};
		Arrare a = new Arrare();
		
		System.out.println(a.solution(5, b).length);
	}

	public int[] solution(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			int idx = i;
			System.out.println(idx);

			for (int j = i + 1; j < n; j++) {
				if (arr[idx] > arr[j]) {// 4 > 3
					idx = j;
				}
			}

			int tmp = arr[i];
//			System.out.print(arr[i]);
			arr[i] = arr[idx];
			arr[idx] = tmp;
//			System.out.println(arr[idx]);
		}
		return arr;
	}

}
