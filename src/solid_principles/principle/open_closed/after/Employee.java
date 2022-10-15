package solid_principles.principle.open_closed.after;

public class Employee {
	private int workingHours;
	private float yearsOfEx;
	
	public Employee() {
		super();
	}
	
	public Employee(int workingHours, float yearsOfEx) {
		super();
		this.workingHours = workingHours;
		this.yearsOfEx = yearsOfEx;
	}

	public int getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}


	public float getYearsOfEx() {
		return yearsOfEx;
	}


	public void setYearsOfEx(float yearsOfEx) {
		this.yearsOfEx = yearsOfEx;
	}
	
}
