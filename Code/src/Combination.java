
public class Combination {
	static void combinationUtil(int arr[], int n, int r, int index, int data[], int i) {

		if (index == r) {
			for (int j = 0; j < r; j++)
				System.out.print(data[j] + " ");
			System.out.println("");
			return;
		}

		if (i >= n)
			return;

		data[index] = arr[i];
		combinationUtil(arr, n, r, index + 1, data, i + 1);

		combinationUtil(arr, n, r, index, data, i + 1);
	}

	static void printCombination(int arr[], int n, int r) {

		int data[] = new int[r];

		combinationUtil(arr, n, r, 0, data, 0);
	}

}
