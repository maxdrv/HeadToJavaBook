public class Arr1{
	public static void main(String[] arg){
		int[] nums;
		nums = new int[7];
		int i = 0;
		while(i<7){
			nums[i] = i;
			i = i + 1;
		}
		int j = 0;
		while(j<7){
			System.out.println("This is Array: " + nums[j]);
			j = j + 1;
		}
	}
}

