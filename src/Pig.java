
public class Pig {
	//variables
String pigName;
int pigFoodnum;
int pigToys;
//constructor
public Pig(String name, int food, int toys) {
	
	pigName = name;
	pigFoodnum = food;
	pigToys = toys;
	
}
//methods
public void status() {
	if(pigFoodnum < 9001) {
		System.out.println("Pig is dead");
	}else {
		System.out.println("Your pig is alive" );
	}
}
	public void speak() {
		System.out.println("pig says "+ pigName);
	}
	public void toys() {
		if(pigToys < 3) {
			System.out.println(" pig says oink ");
		}else {
			System.out.println("pig rolls over");
		}
	}
}

