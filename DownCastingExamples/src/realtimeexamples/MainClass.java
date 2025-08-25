package realtimeexamples;

public class MainClass {
	static void display(Employee obj) {
		if(obj instanceof Devloper) {
			Devloper d1=(Devloper) obj;
			System.out.println("Company Name: "+d1.company);
			d1.developApp();
		}
		else if(obj instanceof Tester) {
			Tester t1=(Tester) obj;
			System.out.println("Company Name:"+t1.company);
			t1.testingApp();
		}
	}
	public static void main(String[] args) {
		display(new Devloper());
		System.out.println("-------------------");
		display(new Tester());
	}
}
