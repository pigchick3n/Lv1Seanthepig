
public class Athlete {
//static for variables means just 1
	int speed;
	String name;
	static int count;
	static String location = "San Diego";
	static int time = 500;
	
	//constructer (looks like class but without class)
	public Athlete(int speed, String name){
		this.name = name;
		this.speed = speed;
		count++;
	}
}
