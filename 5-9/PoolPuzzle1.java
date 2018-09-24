interface Nose{
	public int iMethod();
}

abstract class Picasso implements Nose{
	public int iMethod() {
		return 7;
	}
}

class Clown extends Picasso{}

class Acts implements Nose{
	public int iMethod(){
		return 5;
	}
}

public class PoolPuzzle1 extends Clown {
	public static void main(String[] args){
		Nose[] i = new Nose[3];
		i[0] = new Acts();
		i[1] = new Clown();
		i[2] = new PoolPuzzle1();
		for(int x = 0; x < 3; x++){
			System.out.println(i[x].iMethod() + " " + i[x].getClass());
		}
	}
}
