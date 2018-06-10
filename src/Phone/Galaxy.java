package Phone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	public String ring() {
		return "I'm a Galaxy ";
	}
	
	public String unlock() {
		return "Unlocking via finger print ";
	}
	
	public void displayInfo() {
		System.out.println("\n\r" + ring() + this.getTone());
		System.out.println(this.getVersion());
		System.out.println(this.getBattery());
		System.out.println(this.getCarrier());
		System.out.println(unlock());
	}
}
