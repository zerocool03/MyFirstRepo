
public class MySol {
	public static void main(String[] args) {
		MySol s = new MySol();

		System.out.println(s.removeDuplicates(new int[] { 1,1,2 }));
	}

	public int removeDuplicates(int[] nums) {

		int count = 0;

		for (int i = nums.length - 1; i > 0; --i) {
			if (nums[i] == nums[i - 1]) {
				count++;
				
				for(int j=i;j<nums.length-1;j++)
				{
					nums[j] = nums[j+1];
				}
			}
		}

		return nums.length - count;

	}
}
