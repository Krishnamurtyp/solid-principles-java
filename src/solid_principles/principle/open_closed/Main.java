package solid_principles.principle.open_closed;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrontendDeveloper frontdev = new FrontendDeveloper(30, 1);
		BackendDeveloper backdev = new BackendDeveloper(35, 2);
		TeamManager teamManager = new TeamManager(25, 6);
		
		Salary salaryCalculator = new Salary();
		
		salaryCalculator.calculateSalary(frontdev);
		salaryCalculator.calculateSalary(backdev);
		salaryCalculator.calculateSalary(teamManager);
		
		
		System.out.println(frontdev.getClass());
		
		
		
				
	}

}
