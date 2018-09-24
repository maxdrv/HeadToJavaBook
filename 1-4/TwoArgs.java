class TwoArgs{
	public static void main(String[] args){

		TestStuff t = new TestStuff();
		t.go();

		
	}
}

class TestStuff{
	int x = 0;
	int y = 0;
	int z = 0;

	void go(){
		TestStuff t = new TestStuff();
		t.takeTwo(4,2);
	}

	void takeTwo(int x, int y){
		z = x + y;
		System.out.println("Answer  is " + z);
	}	
}

