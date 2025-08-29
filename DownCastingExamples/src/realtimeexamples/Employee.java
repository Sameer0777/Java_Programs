package realtimeexamples;

public class Employee {
	String company="AMAZON";
}
class Devloper extends Employee{
	void developApp() {
		System.out.println("Devloping App");
	}
}
class Tester extends Employee{
	void testingApp() {
		System.out.println("Testing App");
	}
}
