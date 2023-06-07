public class Day_2{
  public static int removeDuplicates(int[] nums) {
		int res = 1;
		int n = nums.length;

		for(int i = 1;i < n;i++){
			if(nums[i] != nums[res-1]){
				nums[res] = nums[i];
				res++;
			}      
		}
		return res;
	}
	public static void main(String[] args) {

		int arr[] = {0,0,1,1,1,2,2,3,3,4};		
		Day_2 obj = new Day_2();
		
		int n = removeDuplicates(arr);
		
		for(int i = 0; i < n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
