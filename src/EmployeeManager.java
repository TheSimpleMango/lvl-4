import java.util.ArrayList;

public class EmployeeManager {
	private ArrayList<Employee> employeeList;

	public EmployeeManager() {
	}

	public EmployeeManager(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void addEmployee(Employee e) {
		employeeList.add(e);
	}

	public void removeEmployee(String name) {
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getName().equals(name)) {
				employeeList.remove(i);
			}
		}
	}

	public void removeEmployee(int ID) {
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getID() == ID) {
				employeeList.remove(i);
			}
		}
	}

	public int searchByName(String name) {
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getName().equals(name)) {
				return employeeList.get(i).getID();
			}
		}
		return 0;
	}

	public String searchByID(int ID) {
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getID() == ID) {
				return employeeList.get(i).getName();
			}
		}
		return "";
	}
}
