import javax.swing.JOptionPane;

public class Athlete {
//static for variables means just 1
	int speed;
	String name;
	static int count;
	static String location = "San Diego";
	static int time = 500;
	int shirt;
	
	//constructer (looks like class but without class)
	public Athlete(int speed, String name){
		this.name = name;
		this.speed = speed;
		count++;
		shirt = count;
	}
	public static void main(String[] args) {
		Athlete Sean = new Athlete(10000, "Sean");
		Athlete Jon = new Athlete(1000, "Jon");
		Athlete Jessie = new Athlete(100, "Jessie");
		System.out.println(Sean.name +" has shirt number "+ Sean.shirt);
		System.out.println(Jon.name +" has shirt number "+ Jon.shirt );
		System.out.println(Jessie.name +" has shirt number "+ Jessie.shirt );
		System.out.println("There are "+ Athlete.count+ " athletes running in the race");
		System.out.println("They are starting the race in " + location);
		Sean.location = "Antartica";
		System.out.println("Sean is running to " +Sean.location);
		System.out.println("Jon is running to " +Jon.location);
		System.out.println("Jessie is running to " + Jessie.location);
		
	}
}
