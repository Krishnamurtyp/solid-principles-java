package solid_principles.principle.liskov_principle.after;

public class FrontendDeveloper extends Developer implements OnSiteWorkingDevelopers{

	@Override
	public void goToOffice() {
		System.out.println("I work from Office ! ");
	}

}
