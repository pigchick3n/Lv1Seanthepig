
public class PigRunner {
public static void main(String[] args) {
	Pig p = new Pig ("fruit", 10000, 20);
	
	p.speak();
	p.toys();
	p.status();
	Pig zombie = new Pig ("ressurected fruit", 1, 2);
	zombie.speak();
	zombie.toys();
	zombie.status();
}
}
