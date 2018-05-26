
public class Superhero {
	String name;
	String superpower;
	
	public Superhero(String name, String superpower) {
		this.name = name;
		this.superpower = superpower;	
	}
	// getter
	  String getName() {
		return name;
	  }
	  String getSuperpower() {
		return superpower;
	}
	// setter
	 void setPower(String newsuperpower) {
		 this.superpower = newsuperpower;
		
	 }
	
	}
