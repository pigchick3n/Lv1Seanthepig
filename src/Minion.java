
public class Minion {

	String name;
	int eyes;
	String color;
	String master;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;

	}

	String getName() {
		return name;
	}

	int getEyes() {
		return eyes;
	}

	String getColor() {
		return color;
	}

	String getMaster() {
		return master;
	}

	void setName(String newname) {
		this.name = newname;
	}

	void setEyes(int neweyes) {
		this.eyes = neweyes;
	}

	void setColor(String newcolor) {
		this.color = newcolor;
	}

	void setMaster(String newmaster) {
		this.master = newmaster;
	}
}
