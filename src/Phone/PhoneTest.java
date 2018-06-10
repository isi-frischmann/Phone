package Phone;

public class PhoneTest {
	public static void main(String[] args) {
		IPhone i6 = new IPhone("iPhone 6", 50, "AT&T", "RingRing");
		i6.displayInfo();
		
		Galaxy g = new Galaxy("S10", 43, "Telekom", "Zing");
		g.displayInfo();
	}
}
