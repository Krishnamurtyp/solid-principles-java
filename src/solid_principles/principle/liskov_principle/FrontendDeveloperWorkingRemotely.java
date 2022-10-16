package solid_principles.principle.liskov_principle;

public class FrontendDeveloperWorkingRemotely extends Developer{
	
	@Override
    public void goToOffice() {
        System.out.println("I do not go to office, I work from home !");
    }
	
}
