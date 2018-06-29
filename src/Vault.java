
public class Vault {
	int secretCode;
Vault(int secretCode){
	this.secretCode = secretCode;
}
	public static void main(String[] args) {
		Vault v = new Vault(123456);
		
		
	}

	public boolean tryCode(int secretCode) {

		if (this.secretCode == secretCode) {
			System.out.println("yay");
			return true;
		} else {
			
			return false;
		}
	}
}