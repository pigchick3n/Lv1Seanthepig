
public class SmurfRunner {
public static void main(String[] args) {


/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */
	Smurf handy = new Smurf("Handy");
	System.out.println(handy.getName());
	handy.eat();
	System.out.println(handy.getHatColor());
	System.out.println(handy.isGirlOrBoy());
	Smurf Papa = new Smurf("Papa");
	System.out.println(Papa.getName());
	Papa.eat();
	System.out.println(Papa.getHatColor());
	System.out.println(Papa.isGirlOrBoy());
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getName());
	Smurfette.eat();
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
}
}
