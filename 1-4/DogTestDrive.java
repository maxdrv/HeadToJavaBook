class Dog{
	int size;
	String name;

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

class DogTestDrive{
	public static void main(String[] args){
		Dog one = new Dog();
		one.size = 70;

		Dog two = new Dog();
		two.size = 15;

		Dog three = new Dog();
		three.size = 7;


		one.bark(1);
		two.bark(1);
		three.bark(3);
	}
}