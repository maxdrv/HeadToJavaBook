public class Song{
	public static void main(String[] args){
		int bottle = 99;

		while(bottle > 0){
			System.out.print(bottle + " bottles of beer on the wall, ");
			System.out.println(bottle + " bottles of beer.");
			System.out.print("Take one down and pass it around, ");
			System.out.println(bottle + " bottles of beer on a wall.");
			System.out.println("");
			bottle = bottle - 1;
		}

		System.out.println("No more bottles of beer on the wall, no more bottles of beer. ");
		System.out.print("Go to the store and buy some more, 99 bottles of beer on the wall.");
	}
}