
public class Display {
	String data[] = {"git", "new", "branch"};
	
	public void display() {
		System.out.println("String:");
		for (int i=0; i< data.length;i++) {
			System.out.println("String data: " + data[i]);
		}
	}
}
