public class class1{
	public static void main(String[] arg){
		dog d = new dog();
		d.size = 40;
		d.bark();
	}
}

class dog{

	int size;
	String name;
	String breed;

	void bark(){
		System.out.println("Rufl, rufl");
	}
}

