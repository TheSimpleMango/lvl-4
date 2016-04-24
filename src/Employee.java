
public class Employee {
	private String name;
	private double payRate;
	private final int EMPLOYEE_ID;
	private static int nextID = 0;
	public static final double STARTING_PAY = 15;

	public Employee(String name) {
		this.name = name;
		this.payRate = this.STARTING_PAY;
		EMPLOYEE_ID = getNextID();
	}

	public Employee(String name, double STARTING_PAY) {
		this.name = name;
		this.payRate = STARTING_PAY;
		EMPLOYEE_ID = getNextID();
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return EMPLOYEE_ID;
	}

	public double getPayRate() {
		return payRate;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public void changePayRate(double payRate) {
		this.payRate = payRate;
	}

	public static int getNextID() {
		nextID++;
		return nextID;
	}
}
