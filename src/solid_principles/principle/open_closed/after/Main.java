package solid_principles.principle.open_closed.after;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontendDeveloper frontdev = new FrontendDeveloper(33, 2);
		
		Salary salary = new Salary();
		
		salary.calculateSalary(frontdev);
		
		
	}

}
