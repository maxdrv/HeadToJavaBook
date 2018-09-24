class myAnimalList {
	private Animal [] animals = new Animal[5];
	private int nextIndex = 0;

	public void add(Animal a) {
		if(nextIndex < animals.length) {
			animals[nextIndex] = a;
			System.out.println("Animal added at " + nextIndex);
			nextIndex++;
		}
	}
}

public class AnimalTestDrive{
	public static void main(String[] args) {
		myAnimalList list = new myAnimalList();
		Dog a = new Dog();
		Cat c = new Cat();
		list.add(a);
		list.add(c);

		if(a.equals(c)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println(c.getClass());

		System.out.println(c.hashCode());

		System.out.println(c.toString());
	}
}

class Animal{
	public String name;
}

class Cat extends Animal{
	public String name;
}

class Dog extends Animal{
	public String name;
}