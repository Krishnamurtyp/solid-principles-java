package solid_principles.principle.dependency_inversion_principle;

public class Project {
	
	FrontendDeveloper frontdev = new FrontendDeveloper();
	BackendDeveloper backdev = new BackendDeveloper();
	
	public void realizingProject() {
		frontdev.doMyJob();
		backdev.doMyJob();
	}
}
