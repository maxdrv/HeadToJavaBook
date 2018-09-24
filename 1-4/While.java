public class While{
	public static void main(String[] args){
		int x = 1;
		System.out.println("Before loop");
		while(x < 4) {
			System.out.println("In a loop");
			System.out.println("Value is x = " + x);
			x = x + 1;
		}
		System.out.println("After the loop");
	}
}