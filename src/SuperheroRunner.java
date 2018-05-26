
public class SuperheroRunner {
public static void main(String[] args) {
	Superhero s = new Superhero("Thor", "Control lighting");
	s.setPower("control lightning without hammer");
	s.getSuperpower();
	s.getName();
	System.out.println("Your superhero's name is " + s.getName()); 
	System.out.println(s);
}
}
