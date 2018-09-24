class Animal{
	public Animal(){
		System.out.println("Making an Animal");
	}
}

class Hippo extends Animal{
	public Hippo(){
		System.out.println("Making an Hippo");
	}
}

public class TestHipppo{
	public static void main(String[] args) {
		System.out.println("Starting...");
		Hippo p = new Hippo();
	}
}