package solid_principles.principle.open_closed.after;

public class FrontendDeveloper extends Employee implements ISalary{
	
	public FrontendDeveloper(int workingHours, float yearsOfEx) {
		super(workingHours, yearsOfEx);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		float salary = 0;
		// We Add 1000 MAD for Assurance and other stuff
		salary+=1000;
		// Working Hours 50 MAD/Hour
		salary+=this.getWorkingHours()*50;
		// Years of Experience
		// < 1 Year we give 1000 MAD && > 2 Years we give 1500 MAD
		if(this.getYearsOfEx()<1) {
			salary+=1000;
		}else {
				salary+=1500;
		}
		System.out.println(salary + " MAD");
		return;
	}
}
