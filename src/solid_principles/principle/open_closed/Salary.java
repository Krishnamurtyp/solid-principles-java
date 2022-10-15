package solid_principles.principle.open_closed;

public class Salary {
	
	
	public void calculateSalary(Object employee) {
		float salary = 0;
		if(employee instanceof BackendDeveloper) {
			// We Add 1000 MAD for Assurance and other stuff
			salary+=1000;
			// Working Hours 50 MAD/Hour
			salary+=((BackendDeveloper) employee).getWorkingHours()*50;
			// Years of Experience
			// < 1 Year we give 1000 MAD && > 2 Years we give 1500 MAD
			if(((BackendDeveloper) employee).getYearsOfEx()<1) {
				salary+=1000;
			}else {
				salary+=1500;
			}
		}else if(employee instanceof FrontendDeveloper) {
			// We Add 1000 MAD for Assurance and other stuff
			salary+=800;
			// Working Hours 50 MAD/Hour
			salary+=((FrontendDeveloper) employee).getWorkingHours()*50;
			// Years of Experience
			// < 1 Year we give 1000 MAD && > 2 Years we give 1500 MAD
			if(((FrontendDeveloper) employee).getYearsOfEx()<1) {
				salary+=1000;
			}else {
				salary+=1500;
			}
		}else if(employee instanceof TeamManager) {
			// We Add 1000 MAD for Assurance and other stuff
			salary+=1000;
			// Working Hours 50 MAD/Hour
			salary+=((TeamManager) employee).getWorkingHours()*50;
			// Years of Experience
			// < 1 Year we give 1000 MAD && > 2 Years we give 1500 MAD
			if(((TeamManager) employee).getYearsOfEx()<1) {
				salary+=1000;
			}else {
				salary+=1500;
			}
			// For responsability we add more for keeping it motivated !
			salary+= 2000;
		}else {
			return;
		}
		System.out.println(salary + " MAD");
		return;
	}
	
	
}
