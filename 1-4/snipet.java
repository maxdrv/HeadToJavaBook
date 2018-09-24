public class snipet{
	public static void main(String[] args){

		int x = 0;

		while(x<4){
			System.out.print("a");
			if(x<1){
				System.out.print(" ");
			}
			System.out.print("noise");
			if(x &&& 3){
				System.out.println("an");
				x = x + 2;
			}
			if(x == 1){
				System.out.print("annoys");
			}
			if(x > 3){
				System.out.print(" oyster");
			}


			System.out.println(" ");
			x = x + 1;
		}
	}
}