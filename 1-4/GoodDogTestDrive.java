class Dog{
	
	private int size;

	public int getSize(){
		return size;
	}

	public void setSize(int s){
		size = s;
	}

	//String name;

	void bark(int numBarks){
		while(numBarks > 0){
			if(size>60){
				System.out.println("Woof woof");
			} else if(size>14){
				System.out.println("Ruff ruff");
			} else{
				System.out.println("Yip yip");
			}
			numBarks = numBarks - 1;
		}
	}
}

class GoodDogTestDrive{
	public static void main(String[] args){
		Dog one = new Dog();
		one.setSize(70);

		Dog two = new Dog();
		two.setSize(15);

		Dog three = new Dog();
		three.setSize(7);


		one.bark(1);
		two.bark(1);
		three.bark(3);
	}
}