package Phone;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	public String ring() {
//		how it is ringing will be implemented when you create a phone so you don't need it here
		return "I am an iPhone";
	}
	
	public String unlock() {
		return "Unlocking via facial recognition";
	}
	
	public void displayInfo() {
		System.out.print(this.getVersion());
		System.out.print("\n" + ring() + " " + this.getTone());
		System.out.print("\n" + this.getBattery());
		System.out.print("\n" + this.getCarrier());
		System.out.print("\n" + unlock());
	}
}

