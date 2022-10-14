package solid_principles.principle.single_responsability.after;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontendDeveloper frontdev = new FrontendDeveloper();
		BackendDeveloper backdev = new BackendDeveloper();
		
		// Frontend dev
		frontdev.workOnCode();
		frontdev.makeDesignWithFigma();
		// Backend dev
		backdev.workOnCode();
		backdev.dbConception();
		backdev.workOnRestAPI();
	}

}
