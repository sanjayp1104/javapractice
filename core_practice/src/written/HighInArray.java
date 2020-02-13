package written;

public class HighInArray {
	public static void main(String[] args) {
		int[] nums = {5,1,7,3,8,9,5,4};
		int first=nums[0], second=nums[1];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>first) {
				second=first;
				first=nums[i];
			}
		}
		System.out.println("Highest No. "+first+"  Second Highest No. "+second);
	}

}
